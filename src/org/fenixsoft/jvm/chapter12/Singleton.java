package org.fenixsoft.jvm.chapter12;

public class Singleton {

    private  volatile  static  Singleton instance;

    public static Singleton getSingleton(){
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton.getSingleton();
    }
}
