/*
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;

//将初始化的一系列敌人坦克传入，使之改变方向并移动

public class EnemyRunnable implements Runnable{

	private Vector<SpiritTank> t;
	private Vector<Bullet> bullets;
	//private int num;
	public EnemyRunnable(Vector<SpiritTank> _t,Vector<Bullet> _bullets){
		t=_t; 
		bullets=_bullets;
	}
		
		@Override
		public void run() {
			int createTime=0;
			// TODO Auto-generated method stub
//			//Iterator<Tank> its=t.iterator();
//			for(int i=0;;i++) {			
//				for(int j=0;j<t.size();j++) {
//					
//					
//					//if(i%5==0) t.get(j).randomTurn();  //each 0.5 second, tank 1 change its direction randomly
//				t.get(j).randomMove();   //tank 1 moves
//				}
//				
//				//repaint();
//				
//				try {
//					Thread.sleep(100);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
			Random rd=new Random();
			SpiritTank atank;
			while(true) {
				try {
					Thread.sleep(100);
					for(SpiritTank tank:t) {
						tank.randomMove();
					}
					createTime++;
					if(createTime>=10) {
						for(SpiritTank tank:t) {
							bullets.add(tank.fire());
						}
						
						if(rd.nextInt(2)==1) {
							int pt=rd.nextInt(3);
							atank=new SpiritTank(MyFrameTank.TankPlant[pt][0],MyFrameTank.TankPlant[pt][1],4,2,bullets);
							t.add(atank);
						}
						createTime=0;
					}
				}catch(InterruptedException e) {
					System.out.println(e.toString());
				}
			}
			
		}
}
*/