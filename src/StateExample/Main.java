package StateExample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {

        Game g1 = new ExampleGame();
        g1.playGame();
        g1.installGame();
        g1.buyGame();
        System.out.println("---");

        Game g2 = new ExampleGame();
        g2.buyGame();
        g2.playGame();
        g2.installGame();
        System.out.println("---");

        Game g3 = new ExampleGame();
        g3.buyGame();
        g3.installGame();
        g3.playGame();
        g3.playGame();
        g3.buyGame();
        g3.installGame();
        g3.buyGame();
        System.out.println("---");


        //launch(args);
    }
}
