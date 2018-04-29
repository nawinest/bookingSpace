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
public class Payment {
    private Connection con;
    private Statement st;
    public Payment(Connection con) {
        this.con = con;

        try {
            st = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public Payment() {
    }
    
    public String insertDataPayment(String time_payment,String place_name, double cost,String username_ref,int booking_id){
        String sql = "INSERT INTO `payment` ( `time_payment`, `place_name`"
                + ", `cost`, `username_ref`, `booking_id`) VALUES(?, ?, ?, ?, ?)";
        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, time_payment);
            pstmt.setString(1, place_name);
            pstmt.setDouble(1, cost);
            pstmt.setString(1, username_ref);
            pstmt.setInt(1, booking_id);
            pstmt.close();
            return "success";
        } catch (SQLException ex) {
            Logger.getLogger(Payment.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "none";
    }

    public String updateStatusPayment(int booking_id){
        String sql = "update booking set status_payment = 'yes' where booking_id = "+booking_id;
        try {
            st.execute(sql);
            st.close();
            return "success";
        } catch (SQLException ex) {
            Logger.getLogger(Booking.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "none";
    }
    
}
