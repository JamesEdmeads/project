import javafx.application.*;
import javafx.geometry.Rectangle2D;
import javafx.scene.*;
import javafx.stage.*;

public class App extends Application  {
  private double height = 0;
  private double width = 0;

  public void start(Stage primaryStage)  {

    Rectangle2D size = Screen.getPrimary().getVisualBounds();

    width = size.getWidth();
    height = size.getHeight();

    Group root = new Group();
    MainMenu m = new MainMenu(root, height, width);
    m.setUp();
    Scene scene = new Scene(root, width - 50, height - 50); //TODO change to full screen
    //TODO change for different size media

    primaryStage.setTitle("App"); //TODO change to name
    primaryStage.setScene(scene);
    primaryStage.show();

  }





}
