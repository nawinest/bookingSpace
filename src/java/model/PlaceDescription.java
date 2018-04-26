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
import java.util.logging.Level;
import java.util.logging.Logger;

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
    private String owner_name;
    
    //price
    private Double price_phour;
    
    
    private String sql;
    
    

    public PlaceDescription(Connection con) {
        this.con = con;

        try {
            st = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    public String getPlace_featured() {
        return place_featured;
    }

    public void setPlace_featured(String place_featured) {
        this.place_featured = place_featured;
    }

    public String getPlace_description() {
        return place_description;
    }

    public void setPlace_description(String place_description) {
        this.place_description = place_description;
    }

    public String getPlace_status() {
        return place_status;
    }

    public void setPlace_status(String place_status) {
        this.place_status = place_status;
    }

    public String getPlace_lat() {
        return place_lat;
    }

    public void setPlace_lat(String place_lat) {
        this.place_lat = place_lat;
    }

    public String getPlace_lng() {
        return place_lng;
    }

    public void setPlace_lng(String place_lng) {
        this.place_lng = place_lng;
    }

    public String getPlace_zone() {
        return place_zone;
    }

    public void setPlace_zone(String place_zone) {
        this.place_zone = place_zone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public Double getPrice_phour() {
        return price_phour;
    }

    public void setPrice_phour(Double price_phour) {
        this.price_phour = price_phour;
    }

    public PlaceDescription() {
    }
    
    public String insertNewPlace(String place_name, String place_featured, String place_description, String place_status,
            String place_lat, String place_lng, String place_zone,String phone
            ,String email,String owner_name, Double price_phour, Double price_pday,String place_address){
       
        try {
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO place_description (place_name, place_featured, place_description,place_status,place_lat, place_lng,place_zone,phone,email,owner_name,price_phour,price_pday,place_address) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1, place_name);
            pstmt.setString(2, place_featured);
            pstmt.setString(3, place_description);
            pstmt.setString(4, place_status);
            pstmt.setString(5, place_lat);
            pstmt.setString(6, place_lng);
            pstmt.setString(7, place_zone);
            pstmt.setString(8, phone);
            pstmt.setString(9, email);
            pstmt.setString(10, owner_name);
            pstmt.setDouble(11, price_phour);
            pstmt.setDouble(12, price_pday);
            pstmt.setString(13, place_address);
            
            pstmt.execute();
            return "success";
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PlaceDescription.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        //delete
        
        return "none"; 
    }
    
    public void queryPlaceDescription(){
        
    }
    
    
}
