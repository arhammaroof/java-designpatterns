package com.proxy;

/**
 * This is a RealSubject class that is resource-hungry and we want to use this class more efficiently
 */
public class DatabaseExecuterImpl implements DatabaseExecuter {
    public void executeDatabase(String query) throws Exception{
        System.out.println("Going to execute Query: " + query);
    }
}
