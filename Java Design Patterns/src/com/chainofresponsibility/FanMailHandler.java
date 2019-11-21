package com.chainofresponsibility;

public class FanMailHandler implements EmailHandler {
    private EmailHandler nextInChain;
    @Override
    public void setNextChain(EmailHandler nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType().equals("Fan mail")){
            System.out.println("Fan mail sent to CEO");
        }else
        {
            System.out.println("This request could not be handled");
        }
    }
}
