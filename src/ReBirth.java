import java.awt.Graphics;
import java.awt.Image;

public class ReBirth {
	private int x;
	private int y;
	private int frameNumber=0; //top 4
	private int imgx;
	private int imgy;
	private Image img;
	
	public ReBirth(int ax,int ay) {
		x = ax;
		y = ay;
		imgx = 13*34;
		imgy = 7*34;
		img = ConVal.IMG;
	}
	
    public void draw(Graphics g) {
		g.drawImage(img,x-17,y-17,x+17,y+17,imgx+34*(frameNumber%3),imgy,imgx+34+34*(frameNumber%3),imgy+34,null);
		frameNumber++;
	}
    public boolean isOver() {
    	if(frameNumber>=30)
    		return true;
    	else
    		return false;
    }
    public int getX() {return x;}
    public int getY() {return y;}
	

}
