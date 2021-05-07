import java.awt.Graphics;

public class Explosion {
	private int x,y;
	private int frameNumber=0;
	private int imgX,imgY;
	public Explosion(int ax,int ay){
		imgX=20*34;
		imgY=4*34;
		x=ax;y=ay;
	}
	public void paint(Graphics g) {
		g.drawImage(ConVal.IMG, x-17, y-17, x+17, y+17, imgX+frameNumber*34, imgY, imgX+frameNumber*34+34, imgY+34, null);
		frameNumber++;
		//System.out.println("explosion");
	}
	public boolean isOver() {
		if(frameNumber==4)return true;
		else return false;
	}
}
