package gangOfFour.structural.flyweight;

import org.junit.Test;

public class FlyweightDemo {

	private static final String colors[] = { "Red", "Green", "Blue", "White",
			"Black" };

	@Test
	public void test() {

		for (int i = 0; i < 30; ++i)
			draw(i);

		assert ShapeFactory.Size() == 5;
	}

	private void draw(int i) {
		Circle circle = (Circle) ShapeFactory.getCircle(colors[i
				% colors.length]);
		circle.setX(getRandomX());
		circle.setY(getRandomY());
		circle.setRadius(100);
		circle.draw();
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}
