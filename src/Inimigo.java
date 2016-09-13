import java.awt.image.BufferedImage;

public class Inimigo extends Personagem {

	int velx;
	int vely;
	
	public Inimigo(BufferedImage img, int x, int y, int character, int velx,int vely) {
		super(img, x, y, character);
		this.velx = velx;
		this.vely = vely;
	}
	
	@Override
	public void simulaSe(long DiffTime) {
		// TODO Auto-generated method stub
		super.simulaSe(DiffTime);
		
		x+=velx*DiffTime/1000.0;
		y+=vely*DiffTime/1000.0;
		
		if((x>GamePanel.PWIDTH-24) || x <= 0){
			velx =-velx;
		}
		if((y>GamePanel.PHEIGHT-32) || y <= 0){
			vely =-vely;
		}
	}

}
