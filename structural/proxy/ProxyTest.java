package gangOfFour.structural.proxy;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void test() {
		 Image image = new ProxyImage("test_10mb.jpg");

	      //image will be loaded from disk
	      image.display(); 
	      System.out.println("");
	      
	      //image will not be loaded from disk
	      image.display(); 	
	}
}
