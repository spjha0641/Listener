package com.servlet.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


@WebListener
public class Context_Listener implements ServletContextListener {

    
    public Context_Listener() {
    	System.out.println("Context_Listener-> default constructor...");
    }

	
    
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("Context_Listener-> contextInitialized...");
    }

	
    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("Contex_Listener-> contextDestroyed");
    }
}
