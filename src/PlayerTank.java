import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PlayerTank extends Tank implements KeyListener{

	public PlayerTank(int _x, int _y, int _style, int _dir) {
		super(_x, _y, _style, _dir);
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

}
