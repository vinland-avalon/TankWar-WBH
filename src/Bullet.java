import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Bullet {
	private int x,y;
	private int v=10;
	private int dir=0;
	private int frameCount=0;
	private boolean no=false;
	private boolean ifMy;
	
	
	public Bullet(int _x,int _y,int _dir) {
		x=_x;
		y=_y;
		dir=_dir;
	}
	
	public int getX() {return x;};
	public int getY() {return y;};
	public void setIfMy(boolean _ifMy) {ifMy=_ifMy;}
	public boolean getIfMy() {return ifMy;};
	public boolean checkNo() {return no;}
	public void move() 
	{ 
		if(no) return;
		switch(dir) 
		{
			case 0: y-=v; break;
			case 1: x+=v; break;
			case 2: y+=v; break;
			case 3: x-=v; break;
		}
	}
	
	
	public void paint(Graphics g) {
			//if(no) g.drawImage(ConVal.IMG, x-8, y-8,x+34-8, y+34-8, 20*34, 4*34, 21*34, 5*34,null);
			if(ifMy) g.drawImage(ConVal.IMG, x, y,x+17, y+17, 5*34+8, 6*34+8, 6*34-8, 7*34-8,null);
			else g.drawImage(ConVal.IMG, x, y,x+17, y+17, 6*34+8, 6*34+8, 7*34-8, 7*34-8,null);

	} 
	public void explode() {
		no=true;
	}
	


	
	
	
	
}
