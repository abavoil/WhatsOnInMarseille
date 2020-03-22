package event;

import java.util.Objects;

public class StudentEvent extends Event {
	private String type;

	public StudentEvent(String title, String location, int nbSeats, double price, int start, int end, String type) {
		super(title, location, nbSeats, price, start, end);
		this.type = type;
	}

	public StudentEvent() {
		this("Test Student Event", "New Cancan", 150, 10., 13, 13, "Soirée");
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		StudentEvent that = (StudentEvent) o;
		return type.equals(that.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(super.hashCode(), type);
	}

	@Override
	public String toString() {
		return "**ÉVÈNEMENT ÉTUDIANT**" + super.toStringAux() + String.format("Type : %s\n", type);
	}
}
