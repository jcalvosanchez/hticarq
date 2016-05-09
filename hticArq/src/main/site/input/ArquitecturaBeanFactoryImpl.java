package es.htic.arq.input;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.cnp.arquitectura.factory.ArquitecturaBeanFactory;

public class ArquitecturaBeanFactoryImpl implements ArquitecturaBeanFactory, ApplicationContextAware {

	private ApplicationContext applicationContext;


	public Object getBeanInstance(String name, String acuerdoMarco,	String warranty) {
		Object resultado = null;
/*
		try {
			resultado = (Object) applicationContext.getBean(name+"AM"+acuerdoMarco);
		} catch (BeansException e) {}
		if (resultado == null) {
			try {
				resultado = (Object) applicationContext.getBean(name+"WA"+warranty);
			} catch (BeansException e) {}
			if (resultado == null) {
				try {
					resultado = (Object) applicationContext.getBean(name+"AM"+acuerdoMarco+"WA"+warranty);
				} catch (BeansException e) {}
				if (resultado == null) {
					try {
						resultado = (Object) applicationContext.getBean(name);
					} catch (BeansException e) {}
				}
			}
		}
*/
		try {
			resultado = (Object) applicationContext.getBean(name);
		} catch (BeansException e) {}

		return resultado;
	}


	public void setApplicationContext(ApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}
}