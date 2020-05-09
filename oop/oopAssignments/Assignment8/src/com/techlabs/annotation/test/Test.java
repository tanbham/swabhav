package com.techlabs.annotation.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.annotation.BeforeUnitTestCase;
import com.techlabs.annotation.Foo;
import com.techlabs.annotation.UnitTestCase;

public class Test {
	public static void main(String args[]) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		Foo run = new Foo();
		Class clss = run.getClass();
        Method[] methods = run.getClass().getMethods();
        int countOfMethodsWithAnno = 0;
        int a[] = {0,0};
        Method callToMethod;
        
        for (Method method : methods) {
        	
        	UnitTestCase anno = method.getAnnotation(UnitTestCase.class); 
        	if(anno != null) {
        		for (Method everymethod : methods) {
        			BeforeUnitTestCase annotation = everymethod.getAnnotation(BeforeUnitTestCase.class);
        			if(annotation != null) {
        				callToMethod = clss.getDeclaredMethod(everymethod.getName());
            		    callToMethod.invoke(run);
        			}   	
        		}
        		
				countOfMethodsWithAnno ++;
        		checkAnnotationValue(anno , method , a);	
        	}	
        }
        
        System.out.println("Total number of testcases = "+countOfMethodsWithAnno);
        System.out.println("Number of passing test cases = "+a[0]);
		System.out.println("Number of failing test cases = "+a[1]);
	}

	private static void checkAnnotationValue(UnitTestCase anno, Method method, int[] a) {
		if(anno.value() == true) {
			a[0] += 1;
    		System.out.println(method.getName()+" is a passing testcase");
    	}else{
    		a[1] += 1;
    		System.out.println(method.getName()+" is a failing testcase");
    	}
	}
}
