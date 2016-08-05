package com.yb.therer2D.entity.mob;

import com.yb.therer2D.entity.Entity;
import com.yb.therer2D.graphics.Sprite;

public abstract class Mob extends Entity {

	protected Sprite sprite;
	protected int dir = 0;
	protected boolean moving = false;

	public void move(int xa, int ya) {
	}
	
	public void update() {
	}
	
	public void render() {
	}
	
	private boolean collision() {
		return false;
	}
}
