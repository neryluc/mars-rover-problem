package br.com.lucas.marsrover;

/**
 * Represents a type of movement which a Rover can do
 * 
 * @author Lucas Nery
 *
 */
public enum MovementType {

	LEFT("L"), RIGHT("R"), FORWARD("M");

	private String symbol;

	private MovementType(String symbol) {
		this.symbol = symbol;
	}

	public String getSymbol() {
		return symbol;
	}

	public static MovementType getBySymbol(String pSymbol) {
		MovementType movType = null;
		for (MovementType currMovType : values()) {
			if (currMovType.getSymbol().equals(pSymbol)) {
				movType = currMovType;
				break;
			}
		}
		return movType;
	}
}
