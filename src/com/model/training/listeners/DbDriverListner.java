package com.model.training.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class DbDriverListner
 *
 */
public class DbDriverListner implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce)  { 
        String driverName=sce.getServletContext().getInitParameter("jdbc.driver");
        try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
   }
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	

	
}
