package gangOfFour.behavioral.iterator;

import org.junit.Test;

public class IteratorTest {

	@Test
	public void test() {
		NameRepository namesRepository = new NameRepository();

		for (Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
			String name = (String) iter.next();
			System.out.println("Name : " + name);
		}
	}
}
