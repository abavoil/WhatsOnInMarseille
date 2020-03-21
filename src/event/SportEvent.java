package event;

public class SportEvent extends Event {
	private String sport;

	public SportEvent(String title, String location, int nbSeats, double price, int start, int end, String sport) {
		super(title, location, nbSeats, price, start, end);
		this.sport = sport;
	}

	public SportEvent() {
		this("Test SportEvent", "Stade Vélodrome", 67394, 50.50, 150, 150, "Soccer");
	}
}
