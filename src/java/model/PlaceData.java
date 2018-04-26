/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author mac
 */
public class PlaceData {

    //place_description
    private String place_name;
    private String place_featured;
    private String place_description;
    private String place_status;
    private String place_lat;
    private String place_lng;
    private String place_zone;
    private String phone;
    private String email;
    private String owner_name;
    private double price_phour;
    private double price_pday;
    private String place_address;

    //place img
    

    
    public PlaceData(){}
        
    public void SetPlaceData(String place_name,
            String place_featured,
            String place_description,
            String place_status,
            String place_lat,
            String place_lng,
            String place_zone,
            String phone,
            String email,
            String owner_name,
            double price_phour,
            double price_pday,
            String place_address
            ) {
        
        //set place_description obj
        this.place_name = place_name;
        this.place_description = place_description;
        this.place_featured = place_featured;
        this.place_status = place_status;
        this.place_lat = place_lat;
        this.place_lng = place_lng;
        this.place_zone = place_zone;
        this.phone = phone;
        this.email = email;
        this.owner_name = owner_name;
        this.price_phour = price_phour;
        this.price_pday = price_pday;
        this.place_address = place_address;
        
        //set place obj
//        this.img_id = img_id;
//        this.img_name = img_name;

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

    public double getPrice_phour() {
        return price_phour;
    }

    public void setPrice_phour(double price_phour) {
        this.price_phour = price_phour;
    }

    public double getPrice_pday() {
        return price_pday;
    }

    public void setPrice_pday(double price_pday) {
        this.price_pday = price_pday;
    }

    public String getPlace_address() {
        return place_address;
    }

    public void setPlace_address(String place_address) {
        this.place_address = place_address;
    }

   

}
