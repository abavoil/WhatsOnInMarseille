package event;

public class Show extends Event {
	private String type;

	public Show(String title, String location, int nbSeats, double price, int start, int end, String type) {
		super(title, location, nbSeats, price, start, end);
		this.type = type;
	}

	public Show() {
		this("Test Show", "Vieux Port", -1, 0, 200, 200, "Dance contemporaine");
	}
}
