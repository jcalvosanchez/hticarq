package es.htic.arq.input;

import java.util.HashMap;
import java.util.List;

import com.kotasoft.core.notificator.IEmailer;
import com.kotasoft.core.notificator.Mail;
import com.kotasoft.core.notificator.directnotifier.Emailer;

public class EmailUtils {

	public static void sendEmail(HashMap<String, Object> map,String email,String[] cc,List<String> files){
		IEmailer emailer;
		try {
			emailer = new Emailer("mail.properties");
	        Mail mail=new Mail();
	        mail.setTo(email);
	        mail.setCc(cc);
	        mail.setContent(IEmailer.TYPE_PLAIN);
	        mail.setSubject((String) map.get("email.subject"));
	        mail.setBody((String) map.get("email.message"));
	        mail.setAttachments(files);
        	emailer.sendEmail(mail, map);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
}