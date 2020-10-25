package ex8p1Pack;
import java.lang.Math;

public class Circle extends Shape
{
	
	private double area;

	public Circle() 
	{
		
		//blank constructor
	}

	public Circle(int numSides, double lineWidth) 
	{
		super(numSides, lineWidth);
	}
	
	public void draw()
	{
		System.out.println("Drawing the circle...");
		System.out.println("Cannot draw a circle with these parameters");
	}
	
	public void calculateArea()
	{
		System.out.println("Calculating the area of a circle");
		this.area = Math.PI * (getLineWidth() * getLineWidth());
		System.out.println("The area of a circle is: " + this.area);
		
	}

	public double getArea() 
	{
		return this.area;
	}
	
	
	
	
	
	
	
}//end of class
