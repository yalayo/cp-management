package com.rondonsarnik.app.directorio.comun.listeners;

import javax.servlet.ServletContextEvent;

import com.rondonsarnik.app.directorio.comun.util.ApplicationUtil;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ContextLoaderListener;

public class MyContextLoaderListener extends ContextLoaderListener {

	@Override
	public void contextDestroyed(ServletContextEvent event) {
		// TODO Auto-generated method stub
		super.contextDestroyed(event);
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		// TODO Auto-generated method stub
		super.contextInitialized(event);	
		
		ApplicationUtil.setApplicationContext(ContextLoader.getCurrentWebApplicationContext());		
	}

	@Override
	protected ContextLoader createContextLoader() {
		return super.createContextLoader();
	}

	@Override
	public ContextLoader getContextLoader() {
		// TODO Auto-generated method stub
		return super.getContextLoader();
	}
	
}
