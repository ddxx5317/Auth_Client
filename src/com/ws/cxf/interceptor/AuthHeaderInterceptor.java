package com.ws.cxf.interceptor;

import java.util.List;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class AuthHeaderInterceptor extends AbstractPhaseInterceptor<SoapMessage> {
	private String userId;
	private String userPass;

	public AuthHeaderInterceptor(String userid,String pass) {
		super(Phase.PREPARE_SEND);
		this.userId = userid;
		this.userPass = pass;
	}

	@Override
	public void handleMessage(SoapMessage msg) throws Fault {
		List<Header> headers = msg.getHeaders();
		
		Document doc = DOMUtils.createDocument();
		Element elt = doc.createElement("authHeader");
		
		Element eUserid = doc.createElement("userId");
		eUserid.setTextContent(userId);
		Element eUserPass = doc.createElement("userPass");
		eUserPass.setTextContent(userPass);
		
		elt.appendChild(eUserid);
		elt.appendChild(eUserPass);
		System.out.println("userId:"+userId);
		System.out.println("userPass:"+userPass);
		headers.add(new Header(new QName("qname"), elt));
	}

}
