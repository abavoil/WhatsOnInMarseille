package event;

public class Event {
	// the name of the event
	protected String title;

	// where the event takes place
	protected String location;

	// -1 if not limited
	protected int nbSeats;

	// in euros, 0 if free
	protected double price;

	// when the event takes place
	protected Interval interval;

	public Event(String title, String location, int nbSeats, double price, int start, int end) {
		this.title = title;
		this.location = location;
		this.nbSeats = nbSeats;
		this.price = price;
		interval = new Interval(start, end);
	}

	public Event() {
		this("Test Event", "Vieux Port", -1, 0, 272, 314);
	}
}
