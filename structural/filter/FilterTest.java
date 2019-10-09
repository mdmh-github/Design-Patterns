package gangOfFour.structural.filter;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FilterTest {
	@Test
	public void test() {
		List<Person> persons = new ArrayList<Person>();

		persons.add(new Person("Robert", "Male", "Single"));
		persons.add(new Person("John", "Male", "Married"));
		persons.add(new Person("Laura", "Female", "Married"));
		persons.add(new Person("Diana", "Female", "Single"));
		persons.add(new Person("Mike", "Male", "Single"));
		persons.add(new Person("Bobby", "Male", "Single"));

		Criteria male = new CriteriaMale();
		Criteria female = new CriteriaFemale();
		Criteria single = new CriteriaSingle();
		Criteria singleMale = new AndCriteria(single, male);
		Criteria singleOrFemale = new OrCriteria(single, female);

		assert male.meetCriteria(persons).size() == 4;
		assert female.meetCriteria(persons).size() == 2;
		assert singleMale.meetCriteria(persons).size() == 3;
		assert singleOrFemale.meetCriteria(persons).size() == 4;		
	}

}
