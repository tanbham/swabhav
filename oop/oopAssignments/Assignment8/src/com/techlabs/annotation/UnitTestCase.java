package com.techlabs.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


//single value annotation
//RetentionPolicy is a enum and we selected RUNTIME

@Retention(RetentionPolicy.RUNTIME)
public @interface UnitTestCase {
	boolean value();
}
