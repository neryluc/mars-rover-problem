package br.com.lucas.marsrover;

/**
 * Represents a Position and encapsulates its behavior
 * 
 * @author Lucas Nery
 *
 */
public class Position {
	private Point point;
	private CardinalCompass cardinalOrientation;

	public Position(Point point, CardinalCompass cardinalOrientation) {
		this.point = point;
		this.cardinalOrientation = cardinalOrientation;
	}

	public int getXPosition() {
		return point.getX();
	}

	public int getYPosition() {
		return point.getY();
	}

	public String getCardinalOrientation() {
		return cardinalOrientation.getSymbol();
	}

	public void moveForward() {
		switch (cardinalOrientation) {
		case NORTH:
			point.increaseY(1);
			break;
		case SOUTH:
			point.descreaseY(1);
			break;
		case EAST:
			point.increaseX(1);
			break;
		case WEAST:
			point.descreaseX(1);
			break;
		default:
			throw new IllegalArgumentException();
		}
	}

	public void turnLeft() {
		cardinalOrientation = cardinalOrientation.getLeftDirection();
	}

	public void turnRight() {
		cardinalOrientation = cardinalOrientation.getRightDirection();
	}
}
