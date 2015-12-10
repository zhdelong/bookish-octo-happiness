package org.st.java.core.dnpattern.single.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import org.st.java.core.dnpattern.single.FooSingleton;

public class SingleTest {
    public static void main(String[] args) throws IllegalArgumentException, InstantiationException,
            IllegalAccessException, InvocationTargetException, SecurityException, NoSuchFieldException {
        Field f = FooSingleton.class.getDeclaredField("INSTANCE_CREATED");
        f.setAccessible(true);
        f.set(null, false);
        Constructor[] constructors = FooSingleton.class.getDeclaredConstructors();
        Constructor constructor = constructors[0];
        constructor.setAccessible(true);
        FooSingleton spu = (FooSingleton) constructor.newInstance(new Object[0]);
        
    }
}
