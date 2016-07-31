package com.yb.therer2D.level.tile;

import com.yb.therer2D.graphics.Screen;
import com.yb.therer2D.graphics.Sprite;

public class VoidTile extends Tile {
	
	public VoidTile(Sprite sprite) {
		super(sprite);
	}
	
	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4,y << 4, this);
	}
}
