import java.util.ArrayList;
import java.util.Vector;

public class BulletsRunnable implements Runnable{

	private Tank myTank;
	private Vector<SpiritTank> enemyTank;
	private Vector<Bullet> bullets;
	
	
	BulletsRunnable(Tank _myTank,Vector<SpiritTank> _enemyTank,Vector<Bullet> _bullets){
		myTank=_myTank;
		enemyTank=_enemyTank;
		bullets=_bullets;
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
			while(true) {
				try {
					Thread.sleep(100);
					for(Bullet b:bullets) {
						b.move();
					}
				}
				catch(InterruptedException e) {
					System.out.println(e.toString());
				}
		
		
	}

}
}
