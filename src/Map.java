import java.awt.Graphics;
import java.util.Vector;

public class Map {
	private Vector<Wall> walls;
	public Map() {
		walls=new Vector<Wall>();
		for(int i=0;i<ConVal.WEDTH;i+=17) {
			walls.add(new Wall(i,34));
			walls.add(new Wall(i,ConVal.HEIGHT-34));
		}
		for(int i=17;i<ConVal.HEIGHT-17;i+=17) {
			walls.add(new Wall(8,i));
			walls.add(new Wall(ConVal.WEDTH-25,i));
		}
	}
	
	public Vector<Wall> getWalls(){
		return walls;
	}
	
	public void paint(Graphics g) {
		for(Wall w:walls)
		g.drawImage(ConVal.IMG, w.getX(), w.getY(),w.getX()+17, w.getY()+17, 18*34,5*34 , 18*34+17, 5*34+17,null);
	}
}
