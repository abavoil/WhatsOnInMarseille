package event;

import java.util.Arrays;

public class Festival extends Event {
	private String[] artists;

	public Festival(String title, String location, int nbSeats, double price, int start, int end, String[] artists) {
		super(title, location, nbSeats, price, start, end);
		this.artists = artists;
	}

	public Festival() {
		this("Test Festival", "Vieux Port", -1, 0, 2, 359, new String[]{"Didier Super", "Salut c'est cool"});
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		if (!super.equals(o)) return false;
		Festival festival = (Festival) o;
		return Arrays.equals(artists, festival.artists);
	}

	@Override
	public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + Arrays.hashCode(artists);
		return result;
	}

	@Override
	public String toString() {
		return "**FESTIVAL**" + super.toStringAux() + String.format("Artistes : %s\n", String.join(", ", artists));
	}
}
