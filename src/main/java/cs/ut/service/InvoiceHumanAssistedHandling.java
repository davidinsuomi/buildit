package cs.ut.service;

import javax.xml.bind.JAXBContext;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.stereotype.Component;
import org.w3c.dom.Document;



@Component
public class InvoiceHumanAssistedHandling {
	
	@ServiceActivator
	public void process(Document invoice) {
		System.out.println("InvoiceHumanAssitedHandling: Done!");
	}	
 }
