/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3_nb;

import com.raul.ws.EchoWS;
import com.sun.xml.ws.Closeable;
//import com.sun.xml.internal.ws.Closeable;
//import com.sun.xml.internal.ws.Closeable;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author rc
 */
public class JavaApplication3_NB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
//        com.sun.xml.internal.ws.transport.http.client.HttpTransportPipe.dump=true;
        com.sun.xml.ws.transport.http.client.HttpTransportPipe.dump=true;
        
        // TODO code application logic herer.println(s);
        URL url = new URL("http://localhost:8080/JAX-WS-RM-01_Server_NB/echo?wsdl");
//        URL url = new URL("file:src/META-INF/wsdl/localhost_8080/JAX-WS-RM-01_Server/echo.wsdl");
        QName qname = new QName("http://ws.raul.com/", "EchoWS");
//        QName qname2 = new QName("http://www.w3.org/2005/08/addressing", "Action");

//		EchoWS_Service service = (EchoWS_Service)EchoWS_Service.create(url, qname);
//        com.sun.xml.internal.ws.transport.http.HttpAdapter.dump=true
        Service service = Service.create(url, qname);
//		UserProfile port = service.getPort(UserProfile.class);
        EchoWS port = service.getPort(EchoWS.class);
        
//        WSBindingProvider bp = (WSBindingProvider) port;
//        bp.setOutboundHeaders(new StringHeader(qname2, "http://localhost:8080/JAX-WS-RM-01_Server/echo"));
        
        System.out.println(port.echo("xxxxxx"));
        ((Closeable)port).close();
    }
}
