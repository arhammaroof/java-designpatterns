package com.chainofresponsibility;

/**
 * This pattern is used to process varied requests, each of which maybe dealt with by a different handler
 * this pattern promotes the concept of loose coupling of classes by allowing a series of handlers to be created in a chain
 * The first handler in the chain takes the request of the client and process it or pass it to its successor
 * The handler responsible for the final processing of the request may process it or prompt an error mesaage
 */

/**
 * This is an interface for handling different request for concrete handlers
 * contains a member that must be implemented which holds the next handler in the chain
 * contains a member that must be implemented to handle the request of different types
 */

public interface EmailHandler {
    /**
     * Method that sets successor to handle the request if not handled by the current handler class
     * @param nextChain successor to send the request to if can't be handled
     */
    public void setNextChain(EmailHandler nextChain);

    /**
     * method that is used to handle the request
     * @param request the request that need to be handled
     */
    public void handleRequest(Request request);
}
