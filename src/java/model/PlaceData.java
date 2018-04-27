/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

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
    private ArrayList<PlaceImage> place_img;

    //place appropriate
    private boolean good_meeting;
    private boolean good_seminar;
    private boolean good_workshop;
    private boolean good_openproduct;
    private boolean good_party;
    private boolean good_photo;
    private boolean good_concert;

    //place Capacity
    private double stand_capacity;
    private double banquat_capacity;
    private double sit_capacity;
    private double meeting_capacity;
    private double park_capacity;
    private double room_capacity;

    //place type
    private boolean isHotel;
    private boolean isConference;
    private boolean isRestaurant;
    private boolean isCoworking;
    private boolean isOthers;

    public PlaceData() {
    }

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
            String place_address,
            ArrayList<PlaceImage> place_img,
            boolean good_meeting, // begin appropriate
            boolean good_sminar,
            boolean good_workshop,
            boolean good_openproduct,
            boolean good_party,
            boolean good_photo,
            boolean good_concert,
            double stand_capacity, // begin capacity
            double banquat_capacity,
            double sit_capacity,
            double meeting_capacity,
            double park_capacity,
            double room_capacity,
            boolean isHotel, //begin type
            boolean isConference,
            boolean isRestaurant,
            boolean isCoworking,
            boolean isOthers
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

        //set place_image
        this.place_img = place_img;

        //set place appropriate
        this.good_meeting = good_meeting;
        this.good_seminar = good_seminar;
        this.good_workshop = good_workshop;
        this.good_openproduct = good_openproduct;
        this.good_party = good_party;
        this.good_photo = good_photo;
        this.good_concert = good_concert;

        //set place capacity
        this.stand_capacity = stand_capacity;
        this.banquat_capacity = banquat_capacity;
        this.sit_capacity = sit_capacity;
        this.meeting_capacity = meeting_capacity;
        this.park_capacity = park_capacity;
        this.room_capacity = room_capacity;

        //set type
        this.isHotel = isHotel;
        this.isConference = isConference;
        this.isRestaurant = isRestaurant;
        this.isCoworking = isCoworking;
        this.isOthers = isOthers;

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

    public boolean isGood_meeting() {
        return good_meeting;
    }

    public void setGood_meeting(boolean good_meeting) {
        this.good_meeting = good_meeting;
    }

    public boolean isGood_seminar() {
        return good_seminar;
    }

    public void setGood_seminar(boolean good_seminar) {
        this.good_seminar = good_seminar;
    }

    public boolean isGood_workshop() {
        return good_workshop;
    }

    public void setGood_workshop(boolean good_workshop) {
        this.good_workshop = good_workshop;
    }

    public boolean isGood_openproduct() {
        return good_openproduct;
    }

    public void setGood_openproduct(boolean good_openproduct) {
        this.good_openproduct = good_openproduct;
    }

    public boolean isGood_party() {
        return good_party;
    }

    public void setGood_party(boolean good_party) {
        this.good_party = good_party;
    }

    public boolean isGood_photo() {
        return good_photo;
    }

    public void setGood_photo(boolean good_photo) {
        this.good_photo = good_photo;
    }

    public boolean isGood_concert() {
        return good_concert;
    }

    public void setGood_concert(boolean good_concert) {
        this.good_concert = good_concert;
    }

    public double getStand_capacity() {
        return stand_capacity;
    }

    public void setStand_capacity(double stand_capacity) {
        this.stand_capacity = stand_capacity;
    }

    public double getBanquat_capacity() {
        return banquat_capacity;
    }

    public void setBanquat_capacity(double banquat_capacity) {
        this.banquat_capacity = banquat_capacity;
    }

    public double getSit_capacity() {
        return sit_capacity;
    }

    public void setSit_capacity(double sit_capacity) {
        this.sit_capacity = sit_capacity;
    }

    public double getMeeting_capacity() {
        return meeting_capacity;
    }

    public void setMeeting_capacity(double meeting_capacity) {
        this.meeting_capacity = meeting_capacity;
    }

    public double getPark_capacity() {
        return park_capacity;
    }

    public void setPark_capacity(double park_capacity) {
        this.park_capacity = park_capacity;
    }

    public double getRoom_capacity() {
        return room_capacity;
    }

    public void setRoom_capacity(double room_capacity) {
        this.room_capacity = room_capacity;
    }

    public boolean isIsHotel() {
        return isHotel;
    }

    public void setIsHotel(boolean isHotel) {
        this.isHotel = isHotel;
    }

    public boolean isIsConference() {
        return isConference;
    }

    public void setIsConference(boolean isConference) {
        this.isConference = isConference;
    }

    public boolean isIsRestaurant() {
        return isRestaurant;
    }

    public void setIsRestaurant(boolean isRestaurant) {
        this.isRestaurant = isRestaurant;
    }

    public boolean isIsCoworking() {
        return isCoworking;
    }

    public void setIsCoworking(boolean isCoworking) {
        this.isCoworking = isCoworking;
    }

    public boolean isIsOthers() {
        return isOthers;
    }

    public void setIsOthers(boolean isOthers) {
        this.isOthers = isOthers;
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

    public ArrayList<PlaceImage> getPlace_img() {
        return place_img;
    }

    public void setPlace_img(ArrayList<PlaceImage> place_img) {
        this.place_img = place_img;
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
