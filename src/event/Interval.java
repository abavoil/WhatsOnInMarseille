package event;
/*
On pourra plus tard utiliser la classe event.Interval de java.
 */

public class Interval {
	private static final int MIN_START = 1;
	private static final int MAX_END = 365;
	private int start;
	private int end;

	Interval(int from, int to) {
		// On vérifie bien que 0 < from <= to <= 365
		assert (from >= MIN_START) : "Jour min : 0";
		assert (to <= MAX_END) : "Jour max : 365";
		assert (from >= to) : "Le début d'un intervalle doit suivre la fin.";
		start = from;
		end = to;
	}

	Interval() {
		this(MIN_START, MAX_END);
	}

	int getStart() {
		return start;
	}

	int getEnd() {
		return end;
	}
}
