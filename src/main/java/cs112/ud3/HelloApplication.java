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
        stage.setTitle("Lost Ark Character Information");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        //MAIN CLASS FROM UD1
        Character Profile1 = new Assassin("Khryz", 1640, 10);

        System.out.println(Profile1.getName());
        System.out.println(Profile1);
        /*
        Deathblade.warCry();
        Deathblade.catchPhrase();
        Deathblade.featuredAbility();
        */


        Character Profile2 = new Warrior("Chris", 1640, 100000);

        System.out.println(Profile2);
        /*
        Destroyer.warCry();
        Destroyer.catchPhrase();
        Destroyer.featuredAbility();
        */
        launch();
    }
}