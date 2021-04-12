import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Tank {
	private int x,y,style;
	//private Image img;
	//public File f;
	private int dir;
	private int frameCount=0;
	
	public Tank(int _x,int _y) {
		x=_x;
		y=_y;
	}
	public Tank(int _x,int _y,int _style,int _dir) {
		this(_x,_y);
		style=_style;
		dir=_dir;
	}
	public void setStyle(int t) {
		style=t;
	}
	public void setDir(int t) {dir=t;}
	public int getDir() {return dir;}
	
	public void setX(int _x) {x=_x;}
	public int getX() {return x;}
	
	public void setY(int _y) {y=_y;}
	public int getY() {return y;}
	
	//移动，每次一格
	public void move() 
	{ 
		switch(dir) 
		{
			case 0: y-=1; break;
			case 1: x+=1; break;
			case 2: y+=1; break;
			case 3: x-=1; break;
		}
	}
	

	
	//将该块图像用g来绘制
	public void paint(Graphics g) {
		frameCount++;
		if(frameCount%2==0) {
			g.drawImage(ConVal.IMG, x, y,x+34, y+34, 34*(2*dir), style*34, 34*(2*dir+1), (style+1)*34,null);//the last is null?
		}
		else {
			g.drawImage(ConVal.IMG, x, y,x+34, y+34, 34*(2*dir+1), style*34, 34*(2*dir+2), (style+1)*34,null);
		}

	}
	
	
	
	
}
