package com.main;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter{
	
	
	private Handler handler;
	
	public KeyInput(Handler handler) {
		this.handler = handler;
	}
	
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		//System.out.println(key);
		
		for(int i = 0; i < handler.object.size(); i ++) {
			GameObject temp = handler.object.get(i);
			
			if(temp.getId() == ID.Player){
				//Key Events for player 1
				if(key == KeyEvent.VK_W) temp.setVely(-5);
				if(key == KeyEvent.VK_D) temp.setVelx(5);
				if(key == KeyEvent.VK_S) temp.setVely(5);
				if(key == KeyEvent.VK_A) temp.setVelx(-5);
			}
		}
	}
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		
		
		for(int i = 0; i < handler.object.size(); i ++) {
			GameObject temp = handler.object.get(i);
			
			if(temp.getId() == ID.Player){
				//Key Events for player 1
				if(key == KeyEvent.VK_W) temp.setVely(0);
				if(key == KeyEvent.VK_D) temp.setVelx(0);
				if(key == KeyEvent.VK_S) temp.setVely(0);
				if(key == KeyEvent.VK_A) temp.setVelx(0);
			}
		}
	}
	
}	
