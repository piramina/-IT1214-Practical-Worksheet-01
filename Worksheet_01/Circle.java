class Circle extends Shape{
	double radius;
	
	Circle(double radius){
		this.radius=radius;
	}
	
	void area(){
		double result=Math.PI*radius*radius;
		System.out.println("Area of Circle: "+result);
	}
}