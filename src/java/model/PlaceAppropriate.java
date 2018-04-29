/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class PlaceAppropriate {
    private Connection con;
    private Statement st;
    private String[] approSet;
     
    
    public PlaceAppropriate(Connection con) {
        this.con = con;

        try {
            st = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public PlaceAppropriate(){
        
    }
    
    public boolean InsertPA(String good_meeting,String good_seminar,String good_workshop,String good_openproduct,
            String good_party,String good_photo,String good_concert,String place_name){
        try {
            PreparedStatement pstmt = con.prepareStatement("insert into place_appropriate (good_meeting,good_seminar,good_workshop,good_openproduct,good_party,good_photo,good_concert,place_name) "
                    + "values (?,?,?,?,?,?,?,?)");
            pstmt.setBoolean(1, false);
            pstmt.setBoolean(2, false);
            pstmt.setBoolean(3, false);
            pstmt.setBoolean(4, false);
            pstmt.setBoolean(5, false);
            pstmt.setBoolean(6, false);
            pstmt.setBoolean(7, false);
            pstmt.setString(8, place_name);
            if(good_meeting!=null){pstmt.setBoolean(1, true);}
            if(good_seminar!=null){pstmt.setBoolean(2, true);}
            if(good_workshop!=null){pstmt.setBoolean(3, true);}
            if(good_openproduct!=null){pstmt.setBoolean(4, true);}
            if(good_party!=null){pstmt.setBoolean(5, true);}
            if(good_photo!=null){pstmt.setBoolean(6, true);}
            if(good_concert!=null){pstmt.setBoolean(7, true);}
          
            pstmt.execute();
            pstmt.close();
            return true;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PlaceAppropriate.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
