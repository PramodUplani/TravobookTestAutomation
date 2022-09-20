package com.booking.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFileTest {
	
	   public static void main(String args[]) throws IOException {
		      Properties prop = readPropertiesFile("D:\\POCZerodha\\PocTravolook\\src\\main\\java\\com\\booking\\qa\\config\\config.properties");
		      System.out.println("LoginEmail: "+ prop.getProperty("LoginEmail"));
		      System.out.println("password: "+ prop.getProperty("password"));
		   }
		   public static Properties readPropertiesFile(String fileName) throws IOException {
		      FileInputStream fis = null;
		      Properties prop = null;
		      try {
		         fis = new FileInputStream(fileName);
		         prop = new Properties();
		         prop.load(fis);
		      } catch(FileNotFoundException fnfe) {
		         fnfe.printStackTrace();
		      } catch(IOException ioe) {
		         ioe.printStackTrace();
		      } finally {
		         fis.close();
		      }
		      return prop;
		   }
		}
	
	
	
