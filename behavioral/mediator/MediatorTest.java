package gangOfFour.behavioral.mediator;

import org.junit.Test;

public class MediatorTest {
	
	@Test
	 public void test (){
	      User robert = new User("Robert");
	      User john = new User("John");

	      robert.sendMessage("Hi! John!");
	      john.sendMessage("Hello! Robert!");
	   }
}
