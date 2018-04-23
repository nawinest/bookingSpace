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
import model.PlaceDescription;

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
            String place_address = request.getParameter("place_address");

            //section 1 place description insert
            PlaceDescription pd = new PlaceDescription(conn);
            String insertPlaceDescriptionResult = pd.insertNewPlace(place_name, place_featured, place_description,
                     place_status, place_lat, place_lng, place_zone,
                     phone, email, owner_name, price_phour, place_address);
            //finish that section 1

            List<Part> fileParts = request.getParts().stream().filter(part -> "file".equals(part.getName())).collect(Collectors.toList()); // Retrieves <input type="file" name="file" multiple="true">
            
            for (Part filePart : fileParts) {
                Picture pc = new Picture(conn);
                String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
                InputStream fileContent = filePart.getInputStream();
                pc.InsertThePicture(fileContent,fileName,place_name);
            }
            
            if (insertPlaceDescriptionResult.equals("success")) {
                response.sendRedirect("create_place_success.jsp");
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
