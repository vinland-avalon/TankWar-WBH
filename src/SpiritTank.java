import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class SpiritTank extends Tank{
	public int x,y,style;
	public Image img;
	//public File f;
	public int dir;
	private int frameCount=0;
	
	public SpiritTank(int _x,int _y) {
		super(_x,_y);
	}
	public SpiritTank(int _x,int _y,int _style,int _dir) {
		super(_x,_y,_style,_dir);
	}

	//移动，每次一格
	public void randomMove() 
	{ 
		move();
		System.out.println(getDir());
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
