package model;



public class AreaCalculator {
	private IShape shape;
	
	public AreaCalculator(IShape shape){
		this.shape = shape;
	}
	
	public double calculateArea(){
		return shape.area();
	}
}
