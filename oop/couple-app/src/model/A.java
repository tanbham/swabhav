package model;

public class A {
	private IFoo var;
	
	public A(IFoo var) {
		this.var = var;
	}
	
	public void bar() {
		var.foo();
	}
	
}
