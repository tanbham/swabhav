package com.techlabs.anotation.test;

import java.lang.reflect.Method;

import com.techlabs.anotation.Foo;
import com.techlabs.anotation.NeedToRefactor;

public class FooTest {
	public static void main(String args[]) {
        Foo run = new Foo();
        Method[] methods = run.getClass().getMethods();
        
        for (Method method : methods) {
        	NeedToRefactor annos = method.getAnnotation(NeedToRefactor.class);
        	if(annos != null) {
        		System.out.println("Need to change "+method.getName());
        	}
        }


	}
}
