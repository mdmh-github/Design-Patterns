package gangOfFour.behavioral.visitor;

import org.junit.Test;

public class VisitorTest {

	@Test
	public void test() {

		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}
