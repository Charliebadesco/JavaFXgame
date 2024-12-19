package Map;
import javafx.scene.image.Image;

public class Mapping {
	 public final int row = 20;
	 public final int col = 30;
	 public final int[][] map = new int[row][col];
	 
	 public Mapping() {
		 //for test 0 is a default Tile (used this since it nit working with a premade map)
		 
		 for(int r=0; r < row; r++) {
			 for (int c = 0; c< col; c++) {
				 map[r][c]=0;
			 } 
		 }
		 //can be setted automatically, while see that
		 //test for other tiles > can be used for collision testing
		 map[2][2]=1;
		 map[6][6]=2;
	 } 
	 
	 //setting for Tiles, maybe change var names because risky for 
	 
	 public class Tile{
		 public Image image;
		 public boolean collision;
		 
		 public Tile(Image image, boolean collision) {
			 this.image = image;
			 this.collision = collision;
		 }
	 }

	 public Tile[] tiles;
	 
	 //permet de load les tiles	 
	 public void loadTileImages() {
		 tiles = new Tile[3];
		 tiles[0] = new Tile(new Image("INSERER PATH HERBE"),false);
		 tiles[1] = new Tile(new Image("INSERER PATH EAU"), true);
		 tiles[2] = new Tile(new Image("INSERER PATH MUR"), true);
	 }
 
}
