package com.proxy;

/**
 * Subject Base class
 * defines the any members that will be implemented by proxy class and real subject classes
 */
public interface DatabaseExecuter {
    public void executeDatabase(String query) throws Exception;
}
