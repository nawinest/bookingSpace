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
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mac
 */
public class PlaceType {

    private Connection con;
    private Statement st;

    public PlaceType(Connection con) {
        this.con = con;

        try {
            st = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public PlaceType() {

    }

    public void insertType(String[] type_place, String place_name) {
        try {
            PreparedStatement pstmt = con.prepareStatement("insert into place_type (isHotel,isConference,isRestaurant,isCoworking,isOthers,place_name) "
                    + "values (?,?,?,?,?,?)");
            pstmt.setBoolean(1, false);
            pstmt.setBoolean(2, false);
            pstmt.setBoolean(3, false);
            pstmt.setBoolean(4, false);
            pstmt.setBoolean(5, false);
            pstmt.setString(6, place_name);
            for (int i = 0; i < type_place.length; i++) {
                int temp = Integer.parseInt(type_place[i]);
                pstmt.setBoolean(temp, true);
            }
            System.out.println(pstmt.toString());
            pstmt.execute();

        } catch (SQLException ex) {
            Logger.getLogger(PlaceType.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
