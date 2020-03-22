package event;

import java.util.Objects;

public class SportEvent extends Event {
	private String sport;

	public SportEvent(String title, String location, int nbSeats, double price, int start, int end, String sport) {
		super(title, location, nbSeats, price, start, end);
		this.sport = sport;
	}

	public SportEvent() {
		this("Test SportEvent", "Stade Vélodrome", 67394, 50.50, 150, 150, "Soccer");
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		SportEvent that = (SportEvent) o;
		return sport.equals(that.sport);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), sport);
	}

	@Override
	public String toString() {
		return "**ÉVÈNEMENT SPORTIF**" + super.toStringAux() + String.format("Sport : %s\n", sport);
	}
}
