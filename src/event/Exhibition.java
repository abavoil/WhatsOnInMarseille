package event;

import java.util.Objects;

public class Exhibition extends Event {
	// painting, photo, sculpture...
	String art;

	public Exhibition(String title, String location, int nbSeats, double price, int start, int end, String art) {
		super(title, location, nbSeats, price, start, end);
		this.art = art;
	}

	public Exhibition() {
		this("Test Exhibition", "Vieux Port", -1, 0, 216, 243, "Divers");
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Exhibition that = (Exhibition) o;
		return art.equals(that.art);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), art);
	}

	@Override
	public String toString() {
		return "**EXPOSITION**" + super.toStringAux() + String.format("Art : %s\n", art);
	}
}
