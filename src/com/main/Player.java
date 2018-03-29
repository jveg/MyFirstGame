package com.main;

import java.awt.Color;
import java.awt.Graphics;

public class Player extends GameObject{

	public Player(int x, int y, ID id) {
		super(x, y, id);
	}


	public void tick() {
		x += velX;
		y += velY;
	}

	
	public void render(Graphics g) {
		if(id == ID.Player) {
			g.setColor(Color.CYAN);
			g.fillRect(x, y, 32, 32);
		}
		else if(id == ID.Player2) {
			g.setColor(Color.white);
			g.fillRect(x, y, 32, 32);
		}
		else {
			g.setColor(Color.red);
			g.fillRect(x, y, 32, 32);
		}
	
	}
}
