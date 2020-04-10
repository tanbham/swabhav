package com.techlabs.annotation.test;

import java.lang.reflect.Method;
import com.techlabs.annotation.Foo;
import com.techlabs.annotation.UnitTestCase;

public class Test {
	public static void main(String args[]) {
		Foo run = new Foo();
        Method[] methods = run.getClass().getMethods();
        int countOfMethodsWithAnno = 0;
        int a[] = {0,0};
        
        for (Method method : methods) {
        	UnitTestCase anno = method.getAnnotation(UnitTestCase.class);
        	if(anno != null) {
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
