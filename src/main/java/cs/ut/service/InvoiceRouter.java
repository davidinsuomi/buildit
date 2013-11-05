package cs.ut.service;

import javax.swing.text.Document;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

public class InvoiceRouter {
	// Comparing invoice's total with its corresponding po's total
	public String analyzeInvoice(Document invoice)
			throws XPathExpressionException {
		String destinationChannel = null;
		XPath xPath = XPathFactory.newInstance().newXPath();
		String poHRef = xPath.evaluate("//purchaseOrderHRef", invoice);
		Float total = Float.valueOf(xPath.evaluate("//total", invoice));
		if (total <= 100)
			destinationChannel = "MINOR";
		else
			destinationChannel = "MAJOR";
		return destinationChannel;
	}

}
