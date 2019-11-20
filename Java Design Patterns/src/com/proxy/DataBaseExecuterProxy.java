package com.proxy;

public class DataBaseExecuterProxy implements DatabaseExecuter {
    boolean ifAdmin;
    DatabaseExecuterImpl dbExecuter;

    public DataBaseExecuterProxy(String name, String passwd){
        if(name.equals("Admin") && passwd.equals("Admin@123")){
            ifAdmin=true;
        }
        dbExecuter = new DatabaseExecuterImpl();
    }

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
