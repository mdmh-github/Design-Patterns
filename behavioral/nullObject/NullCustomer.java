package gangOfFour.behavioral.nullObject;

public class NullCustomer extends AbstractCustomer {

	public String getName() {
		return "Not Available in Customer Database";
	}

	public boolean isNull() {
		return true;
	}
}