package gangOfFour.behavioral.command;

import org.junit.Test;

public class CommandTest {

	@Test
	public void test() {
		Stock abcStock = new Stock();

		Broker broker = new Broker();
		broker.takeOrder(new BuyStock(abcStock));
		broker.takeOrder(new SellStock(abcStock));
		broker.placeOrders();
	}

}
