/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author mac
 */
public class PlaceDescription {
    //insert new place 
    private Connection con;
    private Statement st;
    
    private String place_name;
    private String place_featured;
    private String place_description;
    private String place_status;
    
    //address
    private String place_lat;
    private String place_lng;
    private String place_zone;
    
    //contact
    private String phone;
    private String email;
    
    //price
    private Double price_phour;
    

    public PlaceDescription(Connection con) {
        this.con = con;

        try {
            st = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public PlaceDescription() {
    }
}
