package com.Builder;

/**
 * Builder pattern is used to chain the members of our concrete class together so that it is easier to understand what the object that is being initialized is creating
 */
public class Account {

    /**
     * member variable for our concrete class
     */
    private int id;
    private String email;

    /**
     *
     * @param builder builder object that sets the member of the concrete class accordingly
     */
    private Account(Builder builder){
        this.id = builder.id;
        this.email = builder.email;
    }

    public String getEmail() { return email; }
    public int getId() { return id; }

    /**
     * inner static class that is used to build the concrete Class's object
     */
    public static class Builder{
        private int id;
        private String email;

        /**
         *
         * @param id
         * @return the current builder object
         */
        public Builder id(int id)
        {
            this.id=id;
            return this;
        }

        /**
         *
         * @param email
         * @return current builder object
         */
        public Builder email(String email)
        {
            this.email=email;
            return this;
        }

        /**
         * to instantiate concrete class
         * @return Concrete Class's object
         */
        public Account build(){
            return new Account(this);
        }

    }
}
