package gangOfFour.behavioral.template;

import org.junit.Test;

public class TemplateTest {
	
	@Test
	 public void test() {

	      Game game = new Cricket();
	      game.play();
	
	      System.out.println();
	      
	      game = new Football();
	      game.play();		
	   }
}
