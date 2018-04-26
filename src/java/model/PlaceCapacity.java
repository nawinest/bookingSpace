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
public class PlaceCapacity {

    private Connection con;
    private Statement st;

    public PlaceCapacity(Connection con) {
        this.con = con;

        try {
            st = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public PlaceCapacity() {

    }

    public boolean insertPlaceCapacity(Double stand_capacity, Double banquat_capacity, Double sit_capacity,Double meeting_capacity,Double park_capacity,Double room_capacity,String place_name) {
        try {
            PreparedStatement pstmt = con.prepareStatement("insert into place_capacity (stand_capacity,banquat_capacity,sit_capacity,meeting_capacity,park_capacity,room_capacity,place_name) "
                    + "values (?,?,?,?,?,?,?)");
            pstmt.setDouble(1, stand_capacity);
            pstmt.setDouble(2, banquat_capacity);
            pstmt.setDouble(3, sit_capacity);
            pstmt.setDouble(4, meeting_capacity);
            pstmt.setDouble(5, park_capacity);
            pstmt.setDouble(6, room_capacity);
            pstmt.setString(7, place_name);
            pstmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PlaceCapacity.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

}
