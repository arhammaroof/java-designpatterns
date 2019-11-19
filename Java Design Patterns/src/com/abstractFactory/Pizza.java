package com.abstractFactory;

public abstract class Pizza {
    public void Prepare(){
        System.out.println("Preparing");
    }
    public void Bake(){
        System.out.println("Baking");
    }
    public void Box(){
        System.out.println("Boxing");
    }
    public abstract void make();
}
