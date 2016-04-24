package br.com.lucas.marsrover;

/**
 * Represents a Rover and encapsulates its behavior
 * 
 * @author Lucas
 *
 */
public class Rover {
	private Position position;

	public Rover(Position position) {
		this.position = position;
	}

	public void move(MovementType movementType) {
		switch (movementType) {
		case FORWARD:
			position.moveForward();
			break;
		case LEFT:
			position.turnLeft();
			break;
		case RIGHT:
			position.turnRight();
			break;
		default:
			break;
		}
	}

	public void printPosition() {
		System.out.println(
				position.getXPosition() + " " + position.getYPosition() + " " + position.getCardinalOrientation());
	}

}
