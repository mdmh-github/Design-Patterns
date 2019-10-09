package gangOfFour.creational.singleton;

import org.junit.Test;

public class SingletonTest {

	@Test
	public void test() {

		SingleObject objectRequest1 = SingleObject.getInstance();
		SingleObject objectRequest2 = SingleObject.getInstance();
		
		assert objectRequest1 == objectRequest2;
	}
}
