package Main;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import pack_Entity.User;

public class GameScreen extends Pane {
    final int originalTileSize = 32;
    final int scaling = 2;
    public final int tileSize = originalTileSize * scaling;

    //setting of visible screen
    final int maxMatriceC = 90;
    final int maxMatriceR = 60;
    public final int screenW = tileSize * maxMatriceC;
    public final int screenH = tileSize * maxMatriceR;
    
    //setting for world
    final int maxWorldC = 300;
    final int mawWorldR = 200; 
    
    //Setting for camera to focus
    public int cameraX = 0;
    public int cameraY= 0;

    private Canvas canvas;  // For drawing
    private GraphicsContext gc;
    private boolean isRunning = true;
    private ControlKey control;
    private User user;
    
  

    public GameScreen() {
        control = new ControlKey();
        user = new User(this, control);

        canvas = new Canvas(screenW, screenH);
        gc = canvas.getGraphicsContext2D();
        this.getChildren().add(canvas);


        startGameTime();
    }
    
    public void cameraFocus(int x, int y) {
    	cameraX = user.x - screenW / 2;
        cameraY = user.y - screenH / 2;

        //Avoid camera to go outside world  
        cameraX = Math.max(0, Math.min(cameraX, maxWorldC * tileSize - screenW));
        cameraY = Math.max(0, Math.min(cameraY, mawWorldR * tileSize - screenH));

    }

    public void startGameTime() {
 
        AnimationTimer gameLoop = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (isRunning) {
                    update(); 
                    render(); 
                }
            }
        };
        gameLoop.start();
    }

    public void update(){

        user.update();
        cameraFocus(user.x, user.y);
        this.setFocusTraversable(true);
        this.requestFocus();
        this.setOnKeyPressed(e-> control.onKeyPressed(e));
        this.setOnKeyReleased(e-> control.onKeyReleased(e));
    }

    public void render(){
        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, screenW, screenH);
        
        
        user.draw(gc, cameraX, cameraY);
    }

    public void stopGame(){
        isRunning = false;
    }
}



