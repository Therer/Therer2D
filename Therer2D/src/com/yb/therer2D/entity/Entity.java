package com.yb.therer2D.entity;

import java.util.Random;

import com.yb.therer2D.graphics.Screen;
import com.yb.therer2D.level.Level;

public abstract class Entity {

	public int x, y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();

	public void update() {

	}

	public void render(Screen screen) {

	}

	public void remove() {
		// Remove from level
		removed = true;
	}

	public boolean isRemoved() {
		return removed;
	}
}
