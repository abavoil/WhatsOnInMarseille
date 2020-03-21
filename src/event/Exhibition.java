package event;

public class Exhibition extends Event {
	// painting, photo, sculpture...
	String art;

	public Exhibition(String title, String location, int nbSeats, double price, int start, int end, String art) {
		super(title, location, nbSeats, price, start, end);
		this.art = art;
	}

	public Exhibition() {
		this("Test Exhibition", "Vieux Port", -1, 0, 216, 243, "Diverse");
	}
}
