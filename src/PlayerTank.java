import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

public class PlayerTank extends Tank implements KeyListener{
	
	private Vector<Bullet> bullets;

	public PlayerTank(int _x,int _y,int _style,int _dir,Vector<Bullet> _bullets) {
		super(_x, _y, _style, _dir);
		bullets=_bullets;
		//bullets=new Vector<Bullet>();
		// TODO Auto-generated constructor stub
	}
	
	//对键盘的监听器 上右下左  重写函数
	
	@Override
		public void keyPressed(KeyEvent e) { 
			// TODO Auto-generated method stub
			int key = e.getKeyCode();
			switch(key) {
			case KeyEvent.VK_UP:setDir(0);break;
			case KeyEvent.VK_RIGHT:setDir(1);break;
			case KeyEvent.VK_DOWN:setDir(2);break;
			case KeyEvent.VK_LEFT:setDir(3);break;
			case KeyEvent.VK_SPACE:
				Bullet bullet=fire();
				bullet.setIfMy(true);
				bullets.add(bullet);
				break;
			}
		}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
//	public void paint(Graphics g) {
//		super.paint(g);
//		for(Bullet b:bullets) {
//			b.paint(g);
//		}
//	}

}
