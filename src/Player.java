import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player implements KeyListener {
    public Player(MyHeroPlane heroPlane) {
        this.heroPlane = heroPlane;
    }

    MyHeroPlane heroPlane;
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode=e.getKeyCode();
        switch (keyCode){
            case 38:
                heroPlane.left=true;
                break;
                 case 40:
                heroPlane.down=true;
                break;
                case 37:
                heroPlane.up=true;
                break;
            case 39:
                heroPlane.right=true;
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode=e.getKeyCode();
    switch (keyCode){
        case 38:
            heroPlane.left=false;
            break;
        case 40:
            heroPlane.down=false;
            break;
        case 37:
            heroPlane.up=false;
            break;
        case 39:
            heroPlane.right=false;
            break;
    }
    }
}
