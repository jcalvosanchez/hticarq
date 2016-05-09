package es.cocacola.cokeid.register.action;

import org.apache.commons.codec.binary.Base64;

public class Base64Test {

	public static void main (String[] args) {
		String message = "20130114008@mailinator.com";

		String me = new String (Base64.encodeBase64(message.getBytes()));
		String mef = new String (Base64.encodeBase64(message.getBytes(), false));
		String met = new String (Base64.encodeBase64(message.getBytes(), true));
		String meff = new String (Base64.encodeBase64(message.getBytes(), false, false));
		String meft = new String (Base64.encodeBase64(message.getBytes(), false, true));
		String metf = new String (Base64.encodeBase64(message.getBytes(), true, false));
		String mett = new String (Base64.encodeBase64(message.getBytes(), true, true));

		String md = new String (Base64.decodeBase64(me));
		String mdf = new String (Base64.decodeBase64(mef));
		String mdt = new String (Base64.decodeBase64(met));
		String mdff = new String (Base64.decodeBase64(meff));
		String mdft = new String (Base64.decodeBase64(meft));
		String mdtf = new String (Base64.decodeBase64(metf));
		String mdtt = new String (Base64.decodeBase64(mett));

		System.out.println("message = [" + message + "]\n");
		System.out.println("me = [" + me + "]");
		System.out.println("mef = [" + mef + "]");
		System.out.println("met = [" + met + "]");
		System.out.println("meff = [" + meff + "]");
		System.out.println("meft = [" + meft + "]");
		System.out.println("metf = [" + metf + "]");
		System.out.println("mett = [" + mett + "]\n");
		System.out.println("md = [" + md + "]");
		System.out.println("mdf = " + mdf + "]");
		System.out.println("mdt = [" + mdt + "]");
		System.out.println("mdff = [" + mdff + "]");
		System.out.println("mdft = [" + mdft + "]");
		System.out.println("mdtf = [" + mdtf + "]");
		System.out.println("mdtt = [" + mdtt + "]");
	}
}