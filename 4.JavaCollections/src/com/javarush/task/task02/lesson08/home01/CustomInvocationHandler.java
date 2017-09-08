package com.javarush.task.task02.lesson08.home01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {
    public SomeInterfaceWithMethods orig;
    public CustomInvocationHandler(SomeInterfaceWithMethods orig) {
        this.orig = orig;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + " in");
        Object object = method.invoke(orig, args);
        System.out.println(method.getName() + " out");
        return object;
    }
}
