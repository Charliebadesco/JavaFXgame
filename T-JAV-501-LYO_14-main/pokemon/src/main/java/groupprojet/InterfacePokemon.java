import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class InterfacePokemon extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Layout principal
        AnchorPane root = new AnchorPane();

        // Ajout du background
        ImageView background = new ImageView(new Image("/resources/images/background.png"));
        background.setFitWidth(800);
        background.setFitHeight(600);
        root.getChildren().add(background);

        // Sprite Pokémon joueur
        ImageView joueurPokemon = new ImageView(new Image("/resources/images/salameche.png"));
        joueurPokemon.setFitWidth(150);
        joueurPokemon.setFitHeight(150);
        joueurPokemon.setLayoutX(100);
        joueurPokemon.setLayoutY(350);
        root.getChildren().add(joueurPokemon);

        // Sprite Pokémon adverse
        ImageView adversairePokemon = new ImageView(new Image("/resources/images/carapuce.png"));
        adversairePokemon.setFitWidth(150);
        adversairePokemon.setFitHeight(150);
        adversairePokemon.setLayoutX(550);
        adversairePokemon.setLayoutY(100);
        root.getChildren().add(adversairePokemon);

        // Barre de vie Pokémon joueur
        Rectangle joueurBarreVie = new Rectangle(150, 20, Color.GREEN);
        joueurBarreVie.setLayoutX(100);
        joueurBarreVie.setLayoutY(320);
        root.getChildren().add(joueurBarreVie);

        // Barre de vie Pokémon adverse
        Rectangle adversaireBarreVie = new Rectangle(150, 20, Color.GREEN);
        adversaireBarreVie.setLayoutX(550);
        adversaireBarreVie.setLayoutY(70);
        root.getChildren().add(adversaireBarreVie);

        // Zone de dialogue
        Label dialogue = new Label("Que doit faire Salamèche ?");
        dialogue.setLayoutX(50);
        dialogue.setLayoutY(500);
        dialogue.setPrefWidth(700);
        dialogue.setStyle("-fx-background-color: white; -fx-padding: 10px; -fx-border-color: black;");
        root.getChildren().add(dialogue);

        // Boutons pour les actions
        Button btnAttaque1 = new Button("Charge");
        Button btnAttaque2 = new Button("Flamme");
        Button btnPotion = new Button("Potion");
        Button btnFuir = new Button("Fuir");

        btnAttaque1.setLayoutX(100);
        btnAttaque1.setLayoutY(550);
        btnAttaque2.setLayoutX(200);
        btnAttaque2.setLayoutY(550);
        btnPotion.setLayoutX(300);
        btnPotion.setLayoutY(550);
        btnFuir.setLayoutX(400);
        btnFuir.setLayoutY(550);

        root.getChildren().addAll(btnAttaque1, btnAttaque2, btnPotion, btnFuir);

        // Configuration de la scène
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Combat Pokémon");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


btnAttaque1.setOnAction(e -> {
    dialogue.setText("Salamèche utilise Charge !");
    // Logique d'attaque ici
});
btnAttaque2.setOnAction(e -> {
    dialogue.setText("Salamèche utilise Lance-flamme !");
    // Logique d'attaque ici
});
btnPotion.setOnAction(e -> {
    dialogue.setText("Salamèche utilise une Potion !");
    // Logique de soin ici
});
btnFuir.setOnAction(e -> {
    dialogue.setText("Salamèche fuit le combat !");
    // Logique pour quitter le combat
});

joueurBarreVie.setWidth(pokemonJoueur.getPointsDeVie() * 150 / pokemonJoueur.getMaxPointsDeVie());
