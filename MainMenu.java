import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.*;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

import java.util.*;

public class MainMenu  {

  private Group group;
  private double height;
  private double width;

  
  MainMenu(Group g, double height, double width)  {
  
    group = g;
    this.height = height;
    this.width = width;
  
  }

  public void setUp()  {

    Button b = new Button("show pictures");
    b.setStyle(
      "-fx-pref-width: 100; -fx-pref-height: 100;");
    b.setOnMousePressed(this::show);//setontouchpressed for touch screen
    group.getChildren().add(b);
  
  }

  private void show(MouseEvent e)  {

    Data d = new Data();

    ArrayList<MediaType> s = d.getData();
    
    String file = "stored/"+s.get(0).getName();
    Image image = new Image(file);
    ImageView imageV = new ImageView();
    imageV.setImage(image);
    imageV.setFitWidth(width);
    imageV.setPreserveRatio(true);
    group.getChildren().add(imageV);

    String song = "stored/"+s.get(0).getSongs()[0];
    System.out.println(song);
    Media m = new Media(new File(song).toURI().toString());
    MediaPlayer mp = new MediaPlayer(m);
    mp.setVolume(0.5);
    mp.setCycleCount(mp.INDEFINITE);
    mp.play();
    

  }


}
