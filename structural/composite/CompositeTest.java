package gangOfFour.structural.composite;

import org.junit.Test;

public class CompositeTest {
	
	@Test
	public void test() {

		Employee CEO = new Employee("John", "CEO", 30000);
		Employee headSales = new Employee("Robert", "Head Sales", 20000);
		Employee headMarketing = new Employee("Michel", "Head Marketing", 20000);
		Employee clerk1 = new Employee("Laura", "Marketing", 10000);
		Employee clerk2 = new Employee("Bob", "Marketing", 10000);
		Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
		Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

		CEO.add(headSales);
		CEO.add(headMarketing);

		headSales.add(salesExecutive1);
		headSales.add(salesExecutive2);

		headMarketing.add(clerk1);
		headMarketing.add(clerk2);
		
		assert CEO.getAllSubordinates().size() == 4;
		assert headSales.getAllSubordinates().size() == 2;
		assert headMarketing.getAllSubordinates().size() == 2;
		assert clerk1.getAllSubordinates().size() == 0;
		assert clerk2.getAllSubordinates().size() == 0;
		assert salesExecutive1.getAllSubordinates().size() == 0;
		assert salesExecutive2.getAllSubordinates().size() == 0;

	}
}
