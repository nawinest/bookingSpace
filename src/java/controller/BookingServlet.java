/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
@WebServlet(name = "BookingServlet", urlPatterns = {"/booking.do"})
public class BookingServlet extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            sc = getServletContext();
            conn = (Connection) sc.getAttribute("conn");
            HttpSession session = request.getSession();

            if (request.getParameter("type").equals("day")) {
                Calendar c = Calendar.getInstance();
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String currentDate = df.format(c.getTime());
                
                
                String booking_time = currentDate;
                String status_accept_booking = "not_accept";
                String name_of_customer = (String)session.getAttribute("name");
                String time_checkin = request.getParameter("start-time")+" 00:00:00";
                String status_payment = "no";
                String time_checkout = request.getParameter("end-time")+" 23:59:59";
                Double cost  = (double)session.getAttribute("cost_pday");
                String booking_description = request.getParameter("event_description");
                String username = (String)session.getAttribute("username");
                String place_name = (String)session.getAttribute("place_name");
                int people = Integer.parseInt(request.getParameter("people"));

                
                Booking bk = new Booking(conn);
                String rs_bk = bk.insertBooking(booking_time, status_accept_booking, name_of_customer
                        , time_checkin, status_payment, time_checkout
                        , cost, booking_description, username, place_name,people);
                if (rs_bk.equals("success")){
                    response.sendRedirect("booking-history.jsp");
                }
                
            }
            else if(request.getParameter("type").equals("hour")){
                 Calendar c = Calendar.getInstance();
                SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String currentDate = df.format(c.getTime());
                String daypicker = request.getParameter("daypicker");
                
                String booking_time = currentDate;
                String status_accept_booking = "not_accept";
                String name_of_customer = (String)session.getAttribute("name");
                String time_checkin = daypicker +" " + request.getParameter("start-time");
                String status_payment = "no";
                String time_checkout = daypicker +" " +request.getParameter("end-time");
                Double cost  = (double)session.getAttribute("cost_phour");
                String booking_description = request.getParameter("event_description");
                String username = (String)session.getAttribute("username");
                String place_name = (String)session.getAttribute("place_name");
                int people = Integer.parseInt(request.getParameter("people"));
                Booking bk = new Booking(conn);
                
                
                String rs_bk = bk.insertBooking(booking_time, status_accept_booking, name_of_customer
                        , time_checkin, status_payment, time_checkout, cost
                        , booking_description, username, place_name,people);
                if (rs_bk.equals("success")){
                    response.sendRedirect("booking-history.jsp");
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
