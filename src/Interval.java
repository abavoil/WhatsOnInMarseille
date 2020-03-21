
/*
On pourra plus tard utiliser la classe Interval de java.
 */

class Interval {
	private int start;
	private int end;

	Interval(int from, int to) {
		assert (from >= to) : "Le début d'un intervalle doit suivre la fin.";
		start = from;
		end = to;
	}

	int getStart() {
		return start;
	}

	int getEnd() {
		return end;
	}
}
