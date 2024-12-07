package cs112.ud3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        //MAIN CLASS FROM UD1
        Character Deathblade = new Assassin("Corbin", 1640, 10);
        /*
        System.out.println(Deathblade);
        Deathblade.warCry();
        Deathblade.catchPhrase();
        Deathblade.featuredAbility();
        */


        Character Destroyer = new Warrior("Chris", 1640, 100000);
        /*
        System.out.println(Destroyer);
        Destroyer.warCry();
        Destroyer.catchPhrase();
        Destroyer.featuredAbility();
        */

        /*System.out.println();
        Character Shadowhunter = new Assassin();
        System.out.println(Shadowhunter);
        */




        launch();
    }
}