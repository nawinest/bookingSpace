/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import model.Picture;
import model.PlaceAppropriate;
import model.PlaceCapacity;
import model.PlaceDescription;
import model.PlaceType;

/**
 *
 * @author mac
 */
@MultipartConfig
@WebServlet(name = "NewPlace", urlPatterns = {"/newplace.do"})
public class NewPlace extends HttpServlet {

    private Connection conn;
    private ServletContext sc;

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
            //place description
            String place_name = request.getParameter("place_name");
            String place_featured = request.getParameter("place_featured");
            String place_description = request.getParameter("place_description");
            String place_status = "open";
            String place_lat = request.getParameter("place_lat");
            String place_lng = request.getParameter("place_lng");
            String place_zone = request.getParameter("place_zone");
            String phone = request.getParameter("phone");
            String email = request.getParameter("email");
            String owner_name = (String) session.getAttribute("owner");
            Double price_phour = Double.parseDouble(request.getParameter("price_phour"));
            Double price_pday = Double.parseDouble(request.getParameter("price_pday"));
            String place_address = request.getParameter("place_address");

            //section 1 place description insert
            PlaceDescription pd = new PlaceDescription(conn);
            //finish that section 1

            //section 2 upload picture
            List<Part> fileParts = request.getParts().stream().filter(part -> "file".equals(part.getName())).collect(Collectors.toList()); // Retrieves <input type="file" name="file" multiple="true">
            //finish section 2

            //section 3 type_place insert
            String[] type_place = request.getParameterValues("type_place");
            PlaceType pt = new PlaceType(conn);
            //finish that section 3

            //section 4 insert appropriate of place
            String good_meeting = request.getParameter("good_meeting");
            String good_seminar = request.getParameter("good_seminar");
            String good_workshop = request.getParameter("good_workshop");
            String good_openproduct = request.getParameter("good_openproduct");
            String good_party = request.getParameter("good_party");
            String good_photo = request.getParameter("good_photo");
            String good_concert = request.getParameter("good_concert");
            PlaceAppropriate pa = new PlaceAppropriate(conn);
            // finish

            //section 5 insert a capacity
            Double stand_capacity = Double.parseDouble(request.getParameter("stand_capacity"));
            Double banquat_capacity = Double.parseDouble(request.getParameter("banquat_capacity"));
            Double sit_capacity = Double.parseDouble(request.getParameter("sit_capacity"));
            Double meeting_capacity = Double.parseDouble(request.getParameter("meeting_capacity"));
            Double park_capacity = Double.parseDouble(request.getParameter("park_capacity"));
            Double room_capacity = Double.parseDouble(request.getParameter("room_capacity"));
            PlaceCapacity pl_ca = new PlaceCapacity(conn);
            //finish 

            try {
                //insert description
                String insertPlaceDescriptionResult = pd.insertNewPlace(place_name, place_featured, place_description, place_status,
                        place_lat, place_lng, place_zone, phone,
                        email, owner_name, price_phour, price_pday, place_address);
                //insert picture of place
                for (Part filePart : fileParts) {
                    Picture pc = new Picture(conn);
                    String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
                    InputStream fileContent = filePart.getInputStream();
                    pc.InsertThePicture(fileContent, fileName, place_name);
                }
                //insert Type all of place
                pt.insertType(type_place, place_name);
                //insert this place is Good for ?
                boolean paResult = pa.InsertPA(good_meeting, good_seminar, good_workshop, good_openproduct, good_party, good_photo, good_concert, place_name);
                //insert all of Capacity of place 
                boolean pl_ca_rs = pl_ca.insertPlaceCapacity(stand_capacity, banquat_capacity, sit_capacity, meeting_capacity, park_capacity, room_capacity, place_name);
                
                response.sendRedirect("create_place_success.jsp");

            } catch (Exception e) {
                 e.printStackTrace();
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
