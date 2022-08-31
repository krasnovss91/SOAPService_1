package com.service;

import javax.jws.WebService;

@WebService(endpointInterface = "com.service.DemoWebService")
public class DemoWebServiceImpl implements DemoWebService {
    @Override
    public Double getResult(Integer a, Integer b, Integer c) {
        Double d = Double.valueOf((b * b) - (4 * a * c));

        return ((b * (-1) + Math.sqrt(d)) / (2 * a));
    }

    @Override
    public Double getResultNeg(Integer a, Integer b, Integer c) {
        Double d = Double.valueOf((b * b) - (4 * a * c));

        return ((b * (-1) - Math.sqrt(d)) / (2 * a));
    }
}
