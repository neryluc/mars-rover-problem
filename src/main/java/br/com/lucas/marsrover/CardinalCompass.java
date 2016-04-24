package br.com.lucas.marsrover;

/**
 * Represents a Compass and encapsulates its behavior
 * 
 * @author Lucas Nery
 *
 */
public enum CardinalCompass {
	NORTH("N"), EAST("E"), WEAST("W"), SOUTH("S");

	private String symbol;

	private CardinalCompass(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbol() {
		return symbol;
	}
	
	public static CardinalCompass getBySymbol(String symbol){
		CardinalCompass cardinalReturn = null;
		for (CardinalCompass currentCardinalCompass : values()) {
			if(currentCardinalCompass.getSymbol().equals(symbol)){
				cardinalReturn = currentCardinalCompass;
				break;
			}
		}
		return cardinalReturn;
	}

	public CardinalCompass getRightDirection() {
		switch (this) {
		case NORTH:
			return CardinalCompass.EAST;
		case SOUTH:
			return CardinalCompass.WEAST;
		case EAST:
			return CardinalCompass.SOUTH;
		case WEAST:
			return CardinalCompass.NORTH;
		default:
			return null;
		}
	}

	public CardinalCompass getLeftDirection() {
		switch (this) {
		case NORTH:
			return CardinalCompass.WEAST;
		case SOUTH:
			return CardinalCompass.EAST;
		case EAST:
			return CardinalCompass.NORTH;
		case WEAST:
			return CardinalCompass.SOUTH;
		default:
			return null;
		}
	}
}
