package gangOfFour.behavioral.state;

import org.junit.Test;

public class StateTest {
	@Test
	public void test() {

		Context context = new Context();

		new StartState().doAction(context);

		print(context);

		new StopState().doAction(context);

		print(context);
	}

	private void print(Context context) {
		System.out.println(context.getState().toString());
	}
}
