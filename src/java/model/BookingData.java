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
public class BookingData {

    private int booking_id;
    private String booking_time;
    private String status_accept_booking;
    private String name_of_customer;
    private String time_checkin;
    private String status_payment;
    private String time_checkout;
    private Double cost;
    private String booking_description;
    private String username;
    private String place_name;

    public BookingData() {

    }
    
    public void setBookingDataAll(
            int booking_id,
            String booking_time,
            String status_accept_booking,
            String name_of_customer,
            String time_checkin,
            String status_payment,
            String time_checkout,
            Double cost,
            String booking_description,
            String username,
            String place_name){
        
        this.booking_id = booking_id;
        this.booking_time = booking_time;
        this.status_accept_booking = status_accept_booking;
        this.name_of_customer = name_of_customer;
        this.time_checkin = time_checkin;
        this.time_checkout = time_checkout;
        this.cost = cost;
        this.booking_description = booking_description;
        this.username = username;
        this.place_name = place_name;
        
    }

    public int getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(int booking_id) {
        this.booking_id = booking_id;
    }

    public String getBooking_time() {
        return booking_time;
    }

    public void setBooking_time(String booking_time) {
        this.booking_time = booking_time;
    }

    public String getStatus_accept_booking() {
        return status_accept_booking;
    }

    public void setStatus_accept_booking(String status_accept_booking) {
        this.status_accept_booking = status_accept_booking;
    }

    public String getName_of_customer() {
        return name_of_customer;
    }

    public void setName_of_customer(String name_of_customer) {
        this.name_of_customer = name_of_customer;
    }

    public String getTime_checkin() {
        return time_checkin;
    }

    public void setTime_checkin(String time_checkin) {
        this.time_checkin = time_checkin;
    }

    public String getStatus_payment() {
        return status_payment;
    }

    public void setStatus_payment(String status_payment) {
        this.status_payment = status_payment;
    }

    public String getTime_checkout() {
        return time_checkout;
    }

    public void setTime_checkout(String time_checkout) {
        this.time_checkout = time_checkout;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getBooking_description() {
        return booking_description;
    }

    public void setBooking_description(String booking_description) {
        this.booking_description = booking_description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPlace_name() {
        return place_name;
    }

    public void setPlace_name(String place_name) {
        this.place_name = place_name;
    }

    
}
