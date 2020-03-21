package event;

public class Festival extends Event {
	private String[] artists;

	public Festival(String title, String location, int nbSeats, double price, int start, int end, String[] artists) {
		super(title, location, nbSeats, price, start, end);
		this.artists = artists;
	}

	public Festival() {
		this("Test Festival", "Vieux Port", -1, 0, 2, 359, new String[]{"Didier Super", "Salut c'est cool"});
	}
}
