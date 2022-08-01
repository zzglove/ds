public class MyHeroPlane extends Thread {
	int x;
	int y;
	private int speed;
	boolean up,down,left,right;

	public MyHeroPlane( int x,int y,int speed) {
		super();

		this.speed = speed;
		this.x= x;
		this.y = y;

	}
public  void run(){
		while (true){
			if(this.x<0||this.y<0){
				break;
			}
			else{
				if(up){
				y-=speed;
			}
			if(down){
				y+=speed;
			}
			if(left){
				x-=speed;
			}
			if(right){
				x+=speed;
				}
			}
		}
	}
}

