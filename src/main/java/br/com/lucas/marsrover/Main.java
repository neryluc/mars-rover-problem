package br.com.lucas.marsrover;

import java.util.LinkedList;
import java.util.Queue;

/**
 * This class process the input and shows the final Rover position (X, Y) and
 * orientation (North, South, East or Weast)
 * 
 * @author Lucas
 *
 */
public class Main {

	public static void main(String[] args) {
		Queue<String> queueInput = parseInput(args);

		// What I supposed to do with this information? The problem description
		// is not clear about that
		String plateuUpperRightCoordinate = queueInput.poll();

		while (!queueInput.isEmpty()) {
			String roverLocation = queueInput.poll();
			String roverMovement = queueInput.poll();

			Rover rover = createRover(roverLocation);
			MovementType movementType;

			for (String currentMoveType : roverMovement.split("")) {
				movementType = MovementType.getBySymbol(currentMoveType);
				rover.move(movementType);
			}

			rover.printPosition();
		}

	}

	private static Rover createRover(String roverLocation) {
		int roverX = Integer.valueOf(String.valueOf(roverLocation.charAt(0)));
		int roverY = Integer.valueOf(String.valueOf(roverLocation.charAt(1)));
		Point point = new Point(roverX, roverY);

		String cardinalSymbol = String.valueOf(roverLocation.charAt(2));
		CardinalCompass cardinalCompass = CardinalCompass.getBySymbol(cardinalSymbol);

		Position position = new Position(point, cardinalCompass);

		Rover rover = new Rover(position);
		return rover;
	}

	private static Queue<String> parseInput(String[] args) {
		LinkedList<String> listQueue = new LinkedList<String>();
		for (String arg : args) {
			listQueue.add(arg);
		}
		return listQueue;
	}
}
