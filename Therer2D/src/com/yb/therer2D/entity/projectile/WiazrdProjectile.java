package com.yb.therer2D.entity.projectile;

import com.yb.therer2D.graphics.Screen;
import com.yb.therer2D.graphics.Sprite;

public class WiazrdProjectile extends Projectile {

	public WiazrdProjectile(int x, int y, double dir) {
		super(x, y, dir);
		range = 2;
		speed = 4;
		damage = 20;
		rateOfFire = 15;
		sprite = Sprite.projectile_wizard;
		nx = speed * Math.cos(angle);
		ny = speed * Math.sin(angle);
	}

	public void update() {
		move();
	}

	protected void move() {
		x += nx;
		y += ny;
		if (distance() > range)
			remove();
	}

	private double distance() {
		double dist = 0;
		dist = Math.sqrt(Math.abs((xOrigin - x) * (xOrigin - x) + (yOrigin - y) * (xOrigin - y)));
		return dist;
	}

	public void render(Screen screen) {
		screen.renderProjectile((int) x - 12, (int) y - 2, this);
	}

}
