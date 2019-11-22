package com.chainofresponsibility;

/**
 * Concrete handler
 * Contains the Handler base i.e Email Handler object which will be set in the setNextChain() method to pass on the successor
 */
public class ComplaintHandler implements EmailHandler {
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
     * if it can't be handled then call the handleRequest() Method of the next succesor
     * @param request the request that need to be handled
     */
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
