import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

//将初始化的一系列敌人坦克传入，使之改变方向并移动

public class EnemyRunnable implements Runnable{

	private ArrayList<SpiritTank> t;
	//private int num;
	public EnemyRunnable(ArrayList<SpiritTank> _t){
		t=_t; 
	}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			//Iterator<Tank> its=t.iterator();
			for(int i=0;;i++) {			
				for(int j=0;j<t.size();j++) {
					
					
					//if(i%5==0) t.get(j).randomTurn();  //each 0.5 second, tank 1 change its direction randomly
				t.get(j).randomMove();   //tank 1 moves
				}
				
				//repaint();
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
}