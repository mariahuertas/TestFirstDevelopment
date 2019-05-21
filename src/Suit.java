
public enum Suit {
	HEARTS(Color.RED, 'h'),
	DIAMONDS(Color.RED, 'd'),
	CLOVERS(Color.BLACK, 'c'),
	PIKES(Color.BLACK, 'p');

	private char initial;
	private Color color;
	 
	Suit(Color color, char initial) {
		this.color = color;
		this.initial = initial;
	}

	
	public static char[] initials() {
		char[]initials = new char [4];
		Suit arraySuit[] = Suit.values();
		for (int i = 0; i < 4; i++) {
			initials[i] = arraySuit[i].initial;
		}
		return initials;
	}

	public static Suit find (char initial) {
		switch(initial) { 
		case 'h': 
			return Suit.HEARTS;
		case 'd': 
			return Suit.DIAMONDS;
		case 'c': 
			return Suit.CLOVERS;
		case 'p': 
			return Suit.PIKES;

		default: return null;	
		}
	}

	public Color getColor() {
		return this.color;
	}

}
