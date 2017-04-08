
package com.ws.cxf;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ws.cxf package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCatsByUser_QNAME = new QName("http://cxf.ws.com/", "getCatsByUser");
    private final static QName _GetCatsByUserResponse_QNAME = new QName("http://cxf.ws.com/", "getCatsByUserResponse");
    private final static QName _SayHi_QNAME = new QName("http://cxf.ws.com/", "sayHi");
    private final static QName _SayHiResponse_QNAME = new QName("http://cxf.ws.com/", "sayHiResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ws.cxf
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCatsByUser }
     * 
     */
    public GetCatsByUser createGetCatsByUser() {
        return new GetCatsByUser();
    }

    /**
     * Create an instance of {@link GetCatsByUserResponse }
     * 
     */
    public GetCatsByUserResponse createGetCatsByUserResponse() {
        return new GetCatsByUserResponse();
    }

    /**
     * Create an instance of {@link SayHi }
     * 
     */
    public SayHi createSayHi() {
        return new SayHi();
    }

    /**
     * Create an instance of {@link SayHiResponse }
     * 
     */
    public SayHiResponse createSayHiResponse() {
        return new SayHiResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link Cat }
     * 
     */
    public Cat createCat() {
        return new Cat();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.ws.com/", name = "getCatsByUser")
    public JAXBElement<GetCatsByUser> createGetCatsByUser(GetCatsByUser value) {
        return new JAXBElement<GetCatsByUser>(_GetCatsByUser_QNAME, GetCatsByUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCatsByUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.ws.com/", name = "getCatsByUserResponse")
    public JAXBElement<GetCatsByUserResponse> createGetCatsByUserResponse(GetCatsByUserResponse value) {
        return new JAXBElement<GetCatsByUserResponse>(_GetCatsByUserResponse_QNAME, GetCatsByUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHi }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.ws.com/", name = "sayHi")
    public JAXBElement<SayHi> createSayHi(SayHi value) {
        return new JAXBElement<SayHi>(_SayHi_QNAME, SayHi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHiResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://cxf.ws.com/", name = "sayHiResponse")
    public JAXBElement<SayHiResponse> createSayHiResponse(SayHiResponse value) {
        return new JAXBElement<SayHiResponse>(_SayHiResponse_QNAME, SayHiResponse.class, null, value);
    }

}
