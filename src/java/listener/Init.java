/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listener;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

/**
 * Web application lifecycle listener.
 *
 * @author mac
 */
public class Init implements ServletContextListener {
    private Connection conn;
    @Override
    public void contextInitialized(ServletContextEvent arg0) {
        try {
            try {
                conn = getBookSpace().getConnection();
                arg0.getServletContext().setAttribute("conn", conn);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private DataSource getBookSpace() throws NamingException {
        Context c = new InitialContext();
        return (DataSource) c.lookup("java:comp/env/bookSpace");
    }
}
