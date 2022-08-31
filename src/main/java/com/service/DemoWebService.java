package com.service;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface DemoWebService {

    @WebMethod
    public Double getResult(Integer a, Integer b, Integer c);

    @WebMethod
    public Double getResultNeg(Integer a, Integer b, Integer c);
}
