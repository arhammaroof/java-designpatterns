package com.Builder;

public class Account {

    private int id;
    private String email;

    private Account(Builder builder){
        this.id = builder.id;
        this.email = builder.email;
    }

    public String getEmail() {
        return email;
    }
    public int getId() { return id; }

    public static class Builder{
        private int id;
        private String email;

        public Builder id(int id)
        {
            this.id=id;
            return this;
        }
        public Builder email(String email)
        {
            this.email=email;
            return this;
        }
        public Account build(){
            return new Account(this);
        }





    }
}
