import java.util.Vector;
public class MyHeroBullets extends Thread{
	private int x;
	private static int y;
	Vector<MyHeroBullets> myHeroBullets=new Vector<>();
	private int speed;

	public MyHeroBullets(int x, int y,int speed) {
		super();
		this.x = x;
		this.y = y;


		this.speed = speed;
	}

	public void run() {
		while(true){

		{if(this.getY()<0) {//
			this.speed = 0;
			break;
		}
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			y-=speed;
		}
	}}



	public int getX() {
		return x;
	}

	public static int getY() {
		return y;
	}


	public int getSpeed() {
		return speed;
	}


}



