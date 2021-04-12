import java.io.IOException;

import javax.imageio.ImageIO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ConVal.IMG=ImageIO.read(ConVal.F);
		}catch(IOException e) {
			e.printStackTrace();
		}
		MyFrameTank f=new MyFrameTank("aaaaaa");
	}

}
