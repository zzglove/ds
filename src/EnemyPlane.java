import java.util.Vector;

public class EnemyPlane extends Thread {
	private int bloods;
	private int x, y;
	private int speed;
	Vector<EnemyPlane> enemyPlanes = new Vector<>();

	public EnemyPlane(int x, int y, int speed) {


		this.x = x;
		this.y = y;
		this.speed = speed;


	}

	public void run() {
		while (true) {
			while (bloods >= 0 ) {
				enemyPlanes.add(new EnemyPlane(0, 0, 10));
				if (this.getY() < 0) {//
					break;
				}
				if (hit()) {
					this.speed = 0;
					break;
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				y += speed;
			}
		}
	}

	public boolean hit() {
		for (int i = 0; i < MyHeroBullets.getY(); i++) {
			if (MyHeroBullets.getY() == this.getY()) {
				return true;
			}
		}
		return false;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getSpeed() {
		return speed;
	}

}
