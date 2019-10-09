package gangOfFour.structural.decorator;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void test() {

		Shape circle = new Circle();
		Shape rectangle = new Rectangle();

		Shape redCircle = new RedShapeDecorator(circle);
		Shape redRectangle = new RedShapeDecorator(rectangle);

		assert circle.draw().equals("Shape: Circle");
		assert rectangle.draw().equals("Shape: Rectangle");
		assert redCircle.draw().equals("Shape: Circle Border Color: Red");
		assert redRectangle.draw().equals("Shape: Rectangle Border Color: Red");
	} 
}
