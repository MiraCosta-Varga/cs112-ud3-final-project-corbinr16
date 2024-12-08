package cs112.ud3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ProfileController {

    private Character Profile1 = new Assassin("Khryz", 1640, 10);
    private Character Profile2 = new Warrior("Luis", 1630, 100000);


    @FXML
    protected void onProfileButtonClick1() throws IOException {
        String characterName = Profile1.getName();
        int characterLevel = Profile1.getItemLevel();
        int characterSilver = Profile1.getSilver();
        String catchPhrase = Profile1.catchPhrase();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(HelloApplication.class.getResource("profile-info.fxml"));
        Parent eventViewParent = loader.load();

        ProfileInfoController profileInfoController = loader.getController();
        profileInfoController.initData(characterName, characterLevel, characterSilver, catchPhrase);

        Stage popupStage = new Stage();

        popupStage.initModality(Modality.APPLICATION_MODAL); //locks screen to current popup window

        popupStage.setScene(new Scene(eventViewParent));

        popupStage.show();
    }

    @FXML
    protected void onProfileButtonClick2() throws IOException {
        String characterName = Profile2.getName();
        int characterLevel = Profile2.getItemLevel();
        int characterSilver = Profile2.getSilver();
        String catchPhrase = Profile2.catchPhrase();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(HelloApplication.class.getResource("profile-info.fxml"));
        Parent eventViewParent = loader.load();

        ProfileInfoController profileInfoController = loader.getController();
        profileInfoController.initData(characterName, characterLevel, characterSilver, catchPhrase);

        Stage popupStage = new Stage();

        popupStage.initModality(Modality.APPLICATION_MODAL); //locks screen to current popup window

        popupStage.setScene(new Scene(eventViewParent));

        popupStage.show();
    }

    @FXML
    protected void onExitButtonClick (ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }

}

