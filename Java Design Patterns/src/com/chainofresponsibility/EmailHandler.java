package com.chainofresponsibility;

public interface EmailHandler {
    public void setNextChain(EmailHandler nextChain);
    public void handleRequest(Request request);
}
