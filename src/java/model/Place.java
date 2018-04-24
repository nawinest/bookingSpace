/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
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
public class Place {

    private Connection con;
    private Statement st;
    private List<String> listName_place = new ArrayList();
    
    public Place(Connection con) {
        this.con = con;

        try {
            st = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public Place(){
        
    }
    
    public List queryPlaceByNameProvider(String owner_name){
        
        String sql = "select * from place_description where owner_name = '"+owner_name+"'";
        try {
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                String place_name = rs.getString("place_name");
                listName_place.add(place_name);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Place.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(listName_place.size());
        return listName_place;
    }
   

}
