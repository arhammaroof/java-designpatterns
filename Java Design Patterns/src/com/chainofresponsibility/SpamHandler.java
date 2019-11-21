package com.chainofresponsibility;

public class SpamHandler implements EmailHandler {
    private EmailHandler nextInChain;
    @Override
    public void setNextChain(EmailHandler nextChain) {
        nextInChain = nextChain;
    }

    @Override
    public void handleRequest(Request request) {
        if(request.getRequestType().equals("spam")){
            System.out.println("spam are moved to trash");
        }else
        {
            nextInChain.handleRequest(request);
        }
    }
}
