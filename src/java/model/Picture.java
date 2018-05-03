/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class Picture {

    private Connection con;
    private Statement st;

    public Picture(Connection con) {
        this.con = con;

        try {
            st = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Picture(){
        
    }
    public String InsertThePicture(InputStream fileContent, String fileName,String place_name) {
        
//        File targetFile = new File("/Users/mac/NetBeansProjects/BookSpace/web/image/"+fileName);
        File targetFile = new File("/usr/local/tomcat/webapps/image/"+fileName);

        byte[] buffer = new byte[8 * 1024];
        int bytesRead;
        try {
            OutputStream outStream = new FileOutputStream(targetFile);
            while ((bytesRead = fileContent.read(buffer)) != -1) {
                outStream.write(buffer, 0, bytesRead);
            }
            
            
            boolean rsInsTodatabase = this.InsertNameOfPictureToDatabase(place_name,fileName);
            if (rsInsTodatabase){
                return "success";
            }
            fileContent.close();
            outStream.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Picture.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "none";
    }
    
    public boolean InsertNameOfPictureToDatabase(String place_name,String fileName){
        String sql  = "insert into place_picture (img_name,place_name)values('"+fileName+"', '"+place_name+"')";
        try {
            st.execute(sql);
            st.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Picture.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
}
