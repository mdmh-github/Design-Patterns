package gangOfFour.creational.abstractFactory;

import org.junit.Test;

public class AbstractFactoryTest {

	@Test
	public void Test() {

		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		assert shapeFactory.getShape("CIRCLE").draw() == "Inside Circle::draw() method.";
		assert shapeFactory.getShape("RECTANGLE").draw() == "Inside Rectangle::draw() method.";
		assert shapeFactory.getShape("SQUARE").draw() == "Inside Square::draw() method.";

		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		assert colorFactory.getColor("RED").fill() == "Inside Red::fill() method.";
		assert colorFactory.getColor("GREEN").fill() == "Inside Green::fill() method.";
		assert colorFactory.getColor("BLUE").fill() == "Inside Blue::fill() method.";
	}
}
