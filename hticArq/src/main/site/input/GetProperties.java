package es.htic.arq.input;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class GetProperties {

	private static GetProperties instance = null;
	private static String applicationProperties = "application.properties";
	private static String constantsProperties = "constants.properties";
	private static String cnpppiMessagesProperties = "cnpppi-messages.properties";
	private static String notificationsProperties = "notifications-messages.properties";
	
	private  Properties properties;


	private GetProperties(){
		try {
			properties = new Properties();
			ClassLoader classLoader = getClass().getClassLoader();
			InputStream fis = classLoader.getResourceAsStream(applicationProperties);
			InputStream fis2 = classLoader.getResourceAsStream(constantsProperties);
			InputStream fis3 = classLoader.getResourceAsStream(cnpppiMessagesProperties);
			InputStream fis4 = classLoader.getResourceAsStream(notificationsProperties);
			properties.load(fis);
			properties.load(fis2);
			properties.load(fis3);
			properties.load(fis4);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public static GetProperties getInstance(){
		if(instance == null)
			instance = new GetProperties();
		return instance;
	}

	public String getProperty(String key){
		try {
			return new String(properties.get(key).toString().getBytes("ISO-8859-1"),"UTF-8");
		} catch (NullPointerException e) {
			return "";
		}catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}
}