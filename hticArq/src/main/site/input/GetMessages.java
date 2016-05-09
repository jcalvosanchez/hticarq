package es.htic.arq.input;

import java.text.MessageFormat;
import java.util.ResourceBundle;

public class GetMessages {
	
	private static final long serialVersionUID = -1639297698938288764L;

	private static GetMessages instance = null;
	private static String cnpppiMessagesProperties = "cnpppi-messages";
	private ResourceBundle bundle;


	private GetMessages(){
		try {
			bundle = ResourceBundle.getBundle(cnpppiMessagesProperties);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static GetMessages getInstance(){
		if(instance == null)
			instance = new GetMessages();
		return instance;
	}

	public String getProperty(String key){
		return (String) bundle.getString(key);
	}

	public String getPropertyWithArgs(String key, String[] arguments){
		return MessageFormat.format(bundle.getString(key), (Object[]) arguments);
	}
}