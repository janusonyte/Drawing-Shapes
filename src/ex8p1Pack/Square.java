package ex8p1Pack;

public class Square extends Shape
{
	private double area;

	public Square() 
	{
		
		//blank constructor
	}

	public Square(int numSides, double lineWidth) 
	{
		super(numSides, lineWidth);
		
	}
	
	
	public void draw()
	{
		System.out.println("Drawing a square...");
		
		if(getNumSides() == 4)
		{
			for(int i = 0; i < 3; i++)
			{
				System.out.println();
				
				for(int j = 0; j < 5; j++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
			System.out.println();
		}
		else
		{
			System.out.println("Cannot draw a square. A square has 4 sides and you have given " + getNumSides() + " sides.");
		}
	}
	
	public void calculateArea()
	{
		System.out.println("Calculating the area of a square");
		this.area = (getLineWidth() * getLineWidth());
		System.out.println("The area of a square is: " + this.area);
	}
	
}//end of class
