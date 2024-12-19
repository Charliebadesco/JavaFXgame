package pack_Entity;
import Main.GameScreen;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Entity {
	
	//ENtity modified to work for every sprite 
	
    final int originalTileSize = 16;
    final int scaling = 2;
    public final int tileSize = originalTileSize * scaling;
	
    //Sprite settings position and speed
    //I need to modify for making move thought the world and not just the screen (see in gamescreen where I put focus camera)
	public int x;
	public int y;
	public int speed;
	//sprite settings view and animation
	public ImageView spriteView;
    public Image up1, up2, down1, down2, left1, left2, right1, right2;
	public String direction = "down";
    public int spriteNum = 1;
	public GameScreen gs;
	private boolean moving = false;
	
	//PUTTING (don't know what it was)
	
	private Timeline animationTL;

    public Entity(GameScreen gs) {
    	this.gs = gs;
    	spriteView = new ImageView();
    	spriteView.setFitHeight(tileSize);
    	spriteView.setFitWidth(tileSize);
    	
    	animationSetting();
	}
    //Launching animation of moving entities
    
    protected void animationSetting() {
    	animationTL = new Timeline (new KeyFrame(Duration.millis(150),e-> toggleSprite()));
    }
    
    protected void startAnimation() {
    	moving = true;
    	if (animationTL != null) 
    		animationTL.stop();
    }
    
    protected void stopAnimation() {
    	moving = false;
    	if(animationTL != null)
    		animationTL.stop();
    }
    private void toggleSprite() {
        if (!moving) return;
        System.out.println("not moving");
        //walking animation ternary operator basic if sprite=1 then 1=2 and if =2 then =1
        spriteNum = spriteNum == 1 ? 2 : 1;
            // Update the sprite image based on direction and spriteNum
            switch (direction) {
                case "up":
                    spriteView.setImage(spriteNum == 1 ? up1 : up2);
                    break;
                case "down":
                    spriteView.setImage(spriteNum == 1 ? down1 : down2);
                    break;
                case "left":
                	spriteView.setImage(spriteNum == 1 ? left1 : left2);
                	break;
                case "right":
                	spriteView.setImage(spriteNum == 1 ? right1 : right2);
                	break;             
            }
    }
}
    


