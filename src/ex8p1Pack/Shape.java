package ex8p1Pack;

public abstract class Shape 
{
	private int numSides;
	private double lineWidth;
	

	public Shape()
	{
		//this is a blank constructor
	}
	
	public Shape(int numSides, double lineWidth) 
	{
		
		this.numSides = numSides;
		this.lineWidth = lineWidth;
	}
    
	//abstract methods
	public abstract void draw();
	
	
	public abstract void calculateArea();
	
	//getters and setters
	public int getNumSides() 
	{
		return numSides;
	}

	public void setNumSides(int numSides) 
	{
		this.numSides = numSides;
	}

	public double getLineWidth() 
	{
		return lineWidth;
	}

	public void setLineWidth(double lineWidth) 
	{
		this.lineWidth = lineWidth;
	}
	
	
	
	
}//end of class
