package event;

public class StudentEvent extends Event {
	public StudentEvent(String title, String location, int nbSeats, double price, int start, int end) {
		super(title, location, nbSeats, price, start, end);
	}

	public StudentEvent() {
		this("Test Student Event", "New Cancan", 150, 10., 13, 13);
	}
}
