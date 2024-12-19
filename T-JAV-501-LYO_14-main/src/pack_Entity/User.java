package pack_Entity;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import Main.ControlKey;
import Main.GameScreen;

public class User extends Entity {

    GameScreen gs;
    ControlKey control;
    private String direction;

    public User(GameScreen gs, ControlKey control) {
    	super(gs);
        this.gs = gs;
        this.control = control;
		Settings();
    }

    public void Settings() {
        x = 100;
        y = 100;
        speed = 4;
        direction = "down";
        
        // need to loading sprites for Principal User here

        up1 =new Image("./ressources/UserPrite/up1.png");
        up2= new Image("./ressources/UserPrite/up2png");
        down1 = new Image("./ressources/UserSprite/down1.png");
        down2 = new Image("./ressources/UserSprite/down2.png");
        left1= new Image("./ressources/UserPrite/left1.png");
        left2 = new Image("./ressources/UserPrite/left2.png");
        right1 = new Image("./ressources/UserPrite/right1.png");
        right2 = new Image("./ressources/UserPrite/right2.png");
   
    }
    private void move(int dx, int dy) {
        x += dx; 
        y += dy; 
    }

    public void update() {
        boolean isMoving = false;

        if (control.isUpPressed()) {
            direction = "up";
            move(0, -speed);
            isMoving = true;
        } else if (control.isDownPressed()) {
            direction = "down";
            move(0, speed);
            isMoving = true;
        } else if (control.isLeftPressed()) {
            direction = "left";
            move(-speed, 0);
            isMoving = true;
        } else if (control.isRightPressed()) {
            direction = "right";
            move(speed, 0);
            isMoving = true;
        }

        if (isMoving) startAnimation();
        else stopAnimation();
    }

    public void draw(GraphicsContext gc,int cameraX, int cameraY) {
        gc.setFill(Color.GREEN); // Default color
        if (direction.equals("up")) gc.setFill(Color.BLUE);
        else if (direction.equals("down")) gc.setFill(Color.RED);
        else if (direction.equals("left")) gc.setFill(Color.YELLOW);
        else if (direction.equals("right")) gc.setFill(Color.ORANGE);

        gc.fillRect(x, y, gs.tileSize, gs.tileSize);
        
        // debug
        
        System.out.println("Direction while drawing: " + direction);
        System.out.println("User is at "+ x +","+ y);
        //I struggle for setting focus with camera > problem is in gamescreen
        System.out.println("Camera is at"+ gs.cameraX +","+ gs.cameraY);
        
    }
}


