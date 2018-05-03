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
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Comment;

/**
 *
 * @author mac
 */
@WebServlet(name = "CommentServlet", urlPatterns = {"/comment.do"})
public class CommentServlet extends HttpServlet {

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
            

            if (session.getAttribute("logged") != null) {
                String comment_description = request.getParameter("comment_description");
                String timecomment = currentDate;
                String username = (String) session.getAttribute("username");
                String place_name_ref = request.getParameter("place_name");
                String name = (String)session.getAttribute("name");
//                System.out.println(place_name_ref);
                
                
                Comment cm = new Comment(conn);
                String rs_cm = cm.insertCommentData(comment_description, timecomment, username, place_name_ref,name);
                if(rs_cm.equals("success")){
                    request.setAttribute("place_name", place_name_ref);
                    RequestDispatcher rd=request.getRequestDispatcher("comment_success.jsp");  
                    rd.forward(request, response);
                }

            } else {
                response.sendRedirect("comment_error.jsp");
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
