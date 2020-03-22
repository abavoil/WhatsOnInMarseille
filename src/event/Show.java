package event;

import java.util.Objects;

public class Show extends Event {
	private String theme;

	public Show(String title, String location, int nbSeats, double price, int start, int end, String theme) {
		super(title, location, nbSeats, price, start, end);
		this.theme = theme;
	}

	public Show() {
		this("Test Show", "Vieux Port", -1, 0, 200, 200, "Dance contemporaine");
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Show show = (Show) o;
		return theme.equals(show.theme);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), theme);
	}

	@Override
	public String toString() {
		return "**SPECTACLE**" + super.toStringAux() + String.format("Thème : %s\n", theme);
	}
}
