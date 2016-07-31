package com.yb.therer2D.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {

	private boolean[] keys = new boolean[254];
	
	public boolean up, down, left, right;
	
	public void update() {
		up = keys[KeyEvent.VK_UP] || keys[KeyEvent.VK_Z]; //note this is based on a AZERTY layout this should be W for most
		down = keys[KeyEvent.VK_DOWN] || keys[KeyEvent.VK_S]; 
		left = keys[KeyEvent.VK_LEFT] || keys[KeyEvent.VK_Q]; //note this is based on a AZERTY layout this should be A for most
		right = keys[KeyEvent.VK_RIGHT] || keys[KeyEvent.VK_D];
		
		System.out.println(up);
	}
	
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = true;
	}

	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
	}
	
	public void keyTyped(KeyEvent e) {
		
	}

}