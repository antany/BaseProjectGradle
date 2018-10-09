package ca.antany.project;

import java.util.logging.Level;
import java.util.logging.Logger;

import ca.antany.common.property.PropertyHandler;
import ca.antany.common.property.enums.PropertyType;

public class Project {
	private static Logger logger = Logger.getLogger(Project.class.getName());
	
	public static void main(String[] args) {
		logger.log(Level.INFO, "Program entry point");
		PropertyHandler pl =  PropertyHandler.getInstance();
		pl.addPropertyFile("project.properties", PropertyType.ANY);
		logger.log(Level.INFO,"Property Loaded succesfully "+pl.getProperty("property.welcome"));
	}
}
