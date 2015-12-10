package org.st.java.core.dnpattern.single;

public class FooSingleton {
    public final static FooSingleton INSTANCE = new FooSingleton();
    private static boolean           INSTANCE_CREATED;
    
    private FooSingleton() {
        System.out.println("ZHIXING");
        if (INSTANCE_CREATED) {
            try {
                throw new Exception("You must only create one instance of this class");
            } catch (Exception e) {
                
                e.printStackTrace();
            }
        } else {
            INSTANCE_CREATED = true;
        }
    }
    
    public void bar() {
    }
}
