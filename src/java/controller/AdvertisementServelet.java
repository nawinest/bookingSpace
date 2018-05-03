/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.AdsvertiseData;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Booking;

/**
 *
 * @author mac
 */
@WebServlet(name = "AdvertisementServelet", urlPatterns = {"/advertise.do"})
public class AdvertisementServelet extends HttpServlet {
            private Connection conn;
            private ServletContext sc;
            private HttpSession session;
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        try (PrintWriter out = response.getWriter()) {
            sc = getServletContext();
            conn = (Connection) sc.getAttribute("conn");
            HttpSession session = request.getSession();
            Calendar c = Calendar.getInstance();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String currentDate = df.format(c.getTime());
            
            
            
            String place_name = request.getParameter("place_name");
            String time_purchase = currentDate;
            String date_activate_old = request.getParameter("start-time");
            String[] date_activate_set = date_activate_old.split("/");
            String date_activate = date_activate_set[2]+"-"+date_activate_set[0]+"-"+date_activate_set[1]+ " 00:00:00";
            
            String date_expire_old = request.getParameter("date_expire");
            String[] date_expire_set = date_expire_old.split("/");
            String date_expire = date_expire_set[2]+"-"+date_expire_set[0]+"-"+date_expire_set[1]+ " 23:59:59";
            
            double cost_amount = 1234.0;
            String provider_username = (String)session.getAttribute("username");
            int advertising_ads_id = 1;
            String status_ads = "not_approve";
            
            
            if(session.getAttribute("role") == null){
                response.sendRedirect("error_out_hack.jsp");
            }
            else{
                AdsvertiseData ads_data = new AdsvertiseData(conn);
                String result = ads_data.insertAdsData(place_name, time_purchase
                        , date_activate, date_expire, cost_amount
                        , provider_username, advertising_ads_id, status_ads);
                if(result.equals("success")){
                    response.sendRedirect("operation_result.jsp");
                }
            }
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
