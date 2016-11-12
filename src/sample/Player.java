package sample;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * Created by vineet on 30-Oct-16.
 */

public class Player extends BorderPane {

    Media media;
    MediaPlayer player;
    MediaView view;
    Pane spane;
    MediaBar bar;

    public Player(String file){
        media =new Media(file);
        player=new MediaPlayer(media);
        view=new MediaView(player);
        spane=new Pane();

        spane.getChildren().add(view);

        setCenter(spane);

        bar=new MediaBar(player);
        setBottom(bar);
        setStyle("-fx-background-color: #bfc2c7");
        player.play();
    }
}
