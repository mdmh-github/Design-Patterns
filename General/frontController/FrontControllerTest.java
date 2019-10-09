package general.frontController;

import org.junit.Test;

public class FrontControllerTest {

	@Test
	public void test() {

		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
	}
}
