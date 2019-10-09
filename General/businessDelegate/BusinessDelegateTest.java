package general.businessDelegate;

import org.junit.Test;

public class BusinessDelegateTest {
	@Test
	public void test() {

		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");

		Client client = new Client(businessDelegate);
		client.doTask();

		businessDelegate.setServiceType("JMS");
		client.doTask();
	}

}
