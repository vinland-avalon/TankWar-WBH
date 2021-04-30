
public class Wall {
	private int x;
	private int y;
	private int style;
	private Boolean ifLife =true;
	
	public int getX() {return x;}
	public void setX(int _x) {x=_x;}
	public int getY(){return y;}
	public void setY(int _y) {y=_y;}
	
	public Wall(int _x,int _y) {
		x=_x;y=_y;
	}
	public void disappear() {
		ifLife=false;
	}
	public Boolean getIfLife() {
		return ifLife;
	}
}
