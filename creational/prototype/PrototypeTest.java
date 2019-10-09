package gangOfFour.creational.prototype;

import org.junit.Test;

public class PrototypeTest {
	@Test
	public void test() {

		ShapeCache.loadCache();

		Shape clonedShape1 = ShapeCache.getShape("1");
		Shape clonedShape2 = ShapeCache.getShape("1");

		assert clonedShape1 != clonedShape2;
		assert clonedShape1.getId().equals(clonedShape2.getId());
		assert clonedShape1.getType().equals(clonedShape2.getType());
		assert clonedShape1.draw().equals(clonedShape2.draw());

		clonedShape1 = ShapeCache.getShape("2");
		clonedShape2 = ShapeCache.getShape("2");

		assert clonedShape1 != clonedShape2;
		assert clonedShape1.getId().equals(clonedShape2.getId());
		assert clonedShape1.getType().equals(clonedShape2.getType());
		assert clonedShape1.draw().equals(clonedShape2.draw());

		clonedShape1 = ShapeCache.getShape("3");
		clonedShape2 = ShapeCache.getShape("3");

		assert clonedShape1 != clonedShape2;
		assert clonedShape1.getId().equals(clonedShape2.getId());
		assert clonedShape1.getType().equals(clonedShape2.getType());
		assert clonedShape1.draw().equals(clonedShape2.draw());
	}
}
