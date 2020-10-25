package ex8p1Pack;

public class MainEx8p1 
{

	public static void main(String[] args) 
	{
		Shape c = new Circle(0, 3);
		c.calculateArea();
		c.draw();
		
		Shape s = new Square(4,4);
		s.calculateArea();
		s.draw();
		
		Shape h = new Hexagon(6,2);
		h.calculateArea();
		h.draw();

	}

}
