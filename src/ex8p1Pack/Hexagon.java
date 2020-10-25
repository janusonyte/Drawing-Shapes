package ex8p1Pack;
import java.lang.Math;

public class Hexagon extends Shape
{
	private double area;

	public Hexagon() 
	{
		//blank constructor
	}

	public Hexagon(int numSides, double lineWidth) 
	{
		super(numSides, lineWidth);
	}
	
	
	public void draw()
	{
		System.out.println("Drawing the hexagon...");
		System.out.println();
		
		if(getNumSides() == 6)
		{

			
			int length = 3; 
			int i=0;
			int j=0; 
			int k; 
			int l;
		
		 
		    for(i = 1, k=length, l=2*length-1; i<length; i++, k--, l++)
		    {
		        for(j = 0; j < 3*length; j++)
		        {
		            if(j>=k && j<=l)
		            {
		                System.out.print("*");
		            }
		            else 
		            {
		            	System.out.print(" ");
		            }
		        }
		        System.out.print("\n");
		    }
		             
		    for(i = 0, k=1, l=3*length-2; i<length; i++, k++, l--)
		        {
		            for(j=0; j<3*length;j++)
		            {
		                if(j>=k && j<=l) 
		                {
		                	System.out.print("*");
		                }
		                else 
		                {
		                	System.out.print(" ");
		                }
		            }
		            System.out.print("\n");
		        }
		}
		else 
		{
			System.out.println("Please check the number of sides on your hexagon.");
		}
		
	}
	

	public void calculateArea()
	{
		System.out.println("Calculating the area of a hexagon");
		if(getNumSides() == 6)
		{
			this.area = (getNumSides()*(getLineWidth()*getLineWidth()))/(4*Math.tan(Math.PI/6));
			System.out.println("The area of a hexagon is: " + this.area);
		}
		else
		{
			System.out.println("Please check the number of sides given. A hexagon has 6 sides. You have given + " + getNumSides() + " sides.");
		}
	}
}//end of class
