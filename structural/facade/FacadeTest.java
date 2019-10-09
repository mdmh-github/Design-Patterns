package gangOfFour.structural.facade;

import org.junit.Test;

public class FacadeTest {

	@Test
	public void test() {
		ShapeMaker shapeMaker = new ShapeMaker();

		assert shapeMaker.drawCircle().equals(new Circle().draw());
		assert shapeMaker.drawRectangle().equals(new Circle().draw());
		assert shapeMaker.drawSquare().equals(new Circle().draw());
	}
}
