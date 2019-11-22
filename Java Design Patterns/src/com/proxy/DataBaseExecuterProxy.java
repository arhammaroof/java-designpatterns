package com.proxy;

/**
 * Proxy pattern is used when we need to limit or control access of a class
 * i.e You might want only user with admin role to run a DELETE query on DB
 * Following is a proxy class of RealSubject i.e DatabaseExecuterImpl
 * Proxy class contains the Subject class obj
 * client objects execute actions on the proxy that are passed to the RealSubject object
 * The result from the RealSubject are returned to the client via the proxy class
 */
public class DataBaseExecuterProxy implements DatabaseExecuter {
    boolean ifAdmin;
    /**
     * RealSubject class object
     */
    DatabaseExecuterImpl dbExecuter;

    /**
     * Proxy class constructor
     * Database credentials
     * @param name username
     * @param passwd password
     * check if the user is admin or not
     */
    public DataBaseExecuterProxy(String name, String passwd){
        if(name.equals("Admin") && passwd.equals("Admin@123")){
            ifAdmin=true;
        }
        dbExecuter = new DatabaseExecuterImpl();
    }

    /**
     * Checks to see if the user is admin or some other user and run database query accordingly
     * @param query database query
     * @throws Exception throws exception if the user is not admin and tries to run the delete query
     */
    public void executeDatabase (String query) throws Exception{
        if (ifAdmin){
            dbExecuter.executeDatabase(query);
        }else{
            if(query.contains("DELETE")){
                throw new Exception("DELETE not allowed for non-admin user");
            }else {
                dbExecuter.executeDatabase(query);
            }
        }
    }
}
