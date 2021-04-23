import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;

import javax.imageio.ImageIO;

public class Tank {
	private int x,y,style=0;
	private int imgX;
	private int imgY;
	//private Image img;
	//public File f;
	private int dir=0;
	private int frameCount=0;
	private Vector<Bullet> bullets;
	private int v=1;
	
	public Tank(int _x,int _y) {
		x=_x;
		y=_y;
		
		Calculate();
	}
//	public Tank(int _x,int _y,Vector<Bullet> _bullets) {
//		x=_x;
//		y=_y;
//		bullets=_bullets;
//		Calculate();
//	}
	public Tank(int _x,int _y,int _style,int _dir) {
		this(_x,_y);
		style=_style;
		dir=_dir;
		Calculate();
	}
//	public Tank(int _x,int _y,Vector<Bullet> _bullets,int _style,int _dir) {
//		this(_x,_y,_bullets);
//		style=_style;
//		dir=_dir;
//		Calculate();
//	}
	public void setStyle(int t) {
		style=t;
		Calculate();
	}
	private void Calculate() {
		imgX=style*68*4+dir*68;
		imgY=style/4*34;
		if(imgY==34) {
			imgX-=16*68;
		}
				
	}
	public void setDir(int t) {dir=t;Calculate();}
	public int getDir() {return dir;}
	
	public void setX(int _x) {x=_x;}
	public int getX() {return x;}
	
	public void setY(int _y) {y=_y;}
	public int getY() {return y;}
	
	public void setV(int _y) {v=_y;}
	public int getV() {return v;}
	
	//移动，每次一格
	public void move() 
	{ 
		
		switch(dir) 
		{
			case 0: y-=v; break;
			case 1: x+=v; break;
			case 2: y+=v; break;
			case 3: x-=v; break;
		}
	}
	
	public Bullet fire() {
		return new Bullet(x,y,dir);
	}
	

	
	//将该块图像用g来绘制
	public void paint(Graphics g) {
		
		
			
			
		
		frameCount++;
		
		if(frameCount%2==0) {
			g.drawImage(ConVal.IMG, x, y,x+34, y+34, imgX, imgY, imgX+34, imgY+34,null);//the last is null?
		}
		else {
			g.drawImage(ConVal.IMG, x, y,x+34, y+34, imgX+34, imgY, imgX+68, imgY+34,null);
		}
		
		

	}
	
	
	
	
}
