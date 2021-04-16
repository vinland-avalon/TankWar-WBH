

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.JFrame;


public class MyFrameTank extends JFrame {
	
	
	//双缓冲技术，消除频闪  
    private Image offScreenImage = null;      //声明一个新的Image对象，即第二缓存
    private Graphics gOffScreen = null;
    private int n=7;
    private ArrayList<SpiritTank> enemyTank=new ArrayList<SpiritTank>();
    private PlayerTank myTank;
    static public int[][] TankPlant= {{100,100},{350,100},{600,100}};
    
	public MyFrameTank(String string) {
		// TODO Auto-generated constructor stub
		super("位移动画");
		//setBackground(Color.pink);
		setSize(ConVal.WEDTH,ConVal.HEIGHT);//设置窗体的宽和高
		
		myTank = new PlayerTank(50,50,2,2); //0号坦克可以通过上下左右来控制
		//myTank.setStyle(2);
		//myTank.setStyle(1);     //frome 0
		//myTank.setDir(2);		//0 for shang,1 for you,2 forxia,3 forzuo
		
		//Iterator<Tank> it=enemyTank.iterator();
//		for(int i=0;i<3;i++) {
//			for(int j=0;j<n/3;j++) {
//				enemyTank.add(new SpiritTank(TankPlant[i][0],TankPlant[i][1],5,2));
//				System.out.print("chuangzhao");
//			}
//			
//		}
		
//		enemyTank[0] = new Tank(100,100);//1号坦克每过0.5秒随机转变方向，并一直移动
//		enemyTank[0].setStyle(0);     
//		enemyTank[0].setDir(2);	
//		
//		enemyTank[1] = new Tank(150,150);//1号坦克每过0.5秒随机转变方向，并一直移动
//		enemyTank[1].setStyle(2);     
//		enemyTank[1].setDir(2);	
		
		this.addKeyListener(myTank);
		
		//设置窗体关闭行为，当用户点击窗体的关闭图标时，结束程序
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			
		setVisible(true);//设置窗体可见
		
		Thread multiThreadEnemy=new Thread(new EnemyRunnable(enemyTank));
		multiThreadEnemy.start();
		
		for(int i=0;;i++) {			
			myTank.move();  //tank 0 moves
			
			repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	
	
	//paint方法窗口重绘中自动调用,在此函数中实现双缓冲机制  
	public void paint(Graphics g){
		//第一次使用offScreenImage时创建它，即第二缓存，后续的绘制内容全部绘制在第二缓存中
        if(offScreenImage == null) {  
        	//截取窗体所在位置的图片
            offScreenImage = this.createImage(ConVal.WEDTH,ConVal.HEIGHT); 
            //获得截取图片的画布
            gOffScreen = offScreenImage.getGraphics();  
        }
        
        
        
        //清除屏幕        
        //Color c = gOffScreen.getColor();  
        //super.paint(gOffScreen); 
        super.paint(gOffScreen); 
        gOffScreen.setColor(Color.pink);  
        gOffScreen.fillRect(0, 0, ConVal.WEDTH,ConVal.HEIGHT);  
        //gOffScreen.setColor(c);
        // 调用父类的重绘方法，防止再从最底层来重绘
        
        
        gOffScreen.setColor(Color.white);
        for(int i=0;i<3;i++) {
        	gOffScreen.drawRect(TankPlant[i][0], TankPlant[i][1], 34, 34);
        }
        
        
        //绘制所有游戏对象	      
        	myTank.paint(gOffScreen);  	
        	//Iterator<Tank> it=enemyTank.iterator();
         	for(int j=0;j<enemyTank.size();j++) {
        		enemyTank.get(j).paint(gOffScreen);
        	}
        //将第二绘存中的内容一次性全部绘制到屏幕
        g.drawImage(offScreenImage, 0, 0, null);

		
	}


}
