package com.chainofresponsibility;

/**
 * Class that gets the request type
 */
public class Request {
    private String requestType;
    public Request(String requestType){
        this.requestType = requestType;
    }

    public String getRequestType(){
        return requestType;
    }
}
