/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.raul.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author rc
 */
@WebService(serviceName = "EchoWS")
public class EchoWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod
    public String echo(String txt) {
        return "echoing from NB " + txt + " !";
    }
}
