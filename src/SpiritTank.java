import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;

import javax.imageio.ImageIO;

public class SpiritTank extends Tank{
	
	private int frameCount=0;
	private Vector<Bullet> bullets;
	
	
	public SpiritTank(int _x,int _y,Vector<Bullet> _bullets) {
		super(_x,_y);
		bullets=_bullets;
	}
	public SpiritTank(int _x,int _y,int _style,int _dir,Vector<Bullet> _bullets) {
		super(_x,_y,_style,_dir);
		bullets=_bullets;
	}

	public void randomMove() 
	{ 
		move();
		//System.out.println(getDir());
		frameCount++;
		if(frameCount%20==0) {
			randomTurn();
		}
			
	}
	public void randomTurn() {   
		Random rand=new Random();
		
		switch(rand.nextInt(4)) {
			case 0:  setDir(0);break;
			case 1:  setDir(1);break;
			case 2:  setDir(2);break;
			case 3:  setDir(3);break;
		}
	}
	

}
