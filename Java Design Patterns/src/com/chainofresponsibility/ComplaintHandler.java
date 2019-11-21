package com.chainofresponsibility;

public class ComplaintHandler implements EmailHandler {
    private EmailHandler nextInChain;
    @Override
    public void setNextChain(EmailHandler nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType().equals("complain")){
            System.out.println("Complains have been sent relative Department");
        }else
        {
            nextInChain.handleRequest(request);
        }
    }
}
