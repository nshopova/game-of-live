package com.proxiad.demo.helpers;

import java.util.Random;

import com.proxiad.demo.game.Cell;
import com.proxiad.demo.game.CellState;

public class RandomGenerator {
	private static final int DISTRIBUTION = 20;
	
	public Cell randomCell() {
		int x = randomInt();
		if (x < DISTRIBUTION) {
			return new Cell(CellState.ALIVE);
		} else {
			return new Cell(CellState.DEAD);
		}
	}
	
	private int randomInt() {
		return new Random().nextInt(100);
	}
}
