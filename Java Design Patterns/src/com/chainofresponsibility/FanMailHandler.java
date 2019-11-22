package com.chainofresponsibility;

/**
 * Concrete handler
 * Contains the Handler base i.e Email Handler object which will be set in the setNextChain() method to pass on the successor
 */
public class FanMailHandler implements EmailHandler {
    /**
     * Handler Base object
     */
    private EmailHandler nextInChain;

    /**
     * @param nextChain successor to be set for the if request type is different
     */
    @Override
    public void setNextChain(EmailHandler nextChain) {
        nextInChain = nextChain;
    }

    /**
     * check if the request can be handled
     * if it can't be handled then prompt the error message because the end of chain is reached
     * @param request the request that need to be handled
     */
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
