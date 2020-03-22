package event;

import java.util.Objects;

public class Event {
	// the name of the event
	private String title;

	// where the event takes place
	private String location;

	// -1 if not limited
	private int nbSeats;

	// in euros, 0 if free
	private double price;

	// when the event takes place
	private Interval interval;

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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Event event = (Event) o;
		return nbSeats == event.nbSeats &&
				Double.compare(event.price, price) == 0 &&
				title.equals(event.title) &&
				Objects.equals(location, event.location) &&
				interval.equals(event.interval);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, location, nbSeats, price, interval);
	}

	@Override
	public String toString() {
		return "**ÉVÈNEMENT**" + toStringAux();
	}

	protected String toStringAux() {
		return String.format("\nTitre : %s\nLieu : %s\nNombre de places : %s\nPrix : %s\nDate%s\n",
				title,
				location,
				(nbSeats > -1) ? nbSeats : "Places illimitées",
				(price > 0) ? String.format("%.2f €", price) : "Gratuit",
				(interval.getStart().equals(interval.getEnd())) ? String.format(" : Le %s", interval.getStart()) : String.format("s : Du %s au %s", interval.getStart(), interval.getEnd()));
	}
}
