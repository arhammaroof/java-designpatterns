package com.singletonpattern;

/**
 * has a private constructor
 * creates one object using static function
 * early initialization - Initializes the object when the class is being loaded so that no other thread can create another object
 * late initialization - object is initialized in the static function which can be an issue when multiple threads are executing the same class
 * There are multiple ways to make the class thread secure
 * 1 By early initialization
 * 2 By using synchronized function so that even if the thread execute the function one after the other, the next thread will not be able to access the function.
 * 3 By Enumerations
 * 4 By double Checked locking - adding an extra if condition which will reduce the possibility of threads to create two different objects
 */
public class Singleton {
    //early initialization
    //for thread safety
    /**
     * Singleton object initialization - early initialization
     * making the object static - shared object
     */
    private static  Singleton obj = new Singleton() ;

    /**
     * Private Constructor
     */
    private Singleton() {}

    /**
     * static function to return SingletonObj without object creation
     * @return singletonObj
     */
    public static Singleton getInstance()
    {
        /**
         * if condition to make late initialization
         */
//        if (obj==null)
//            obj = new Singleton();
        return obj;
    }
}

