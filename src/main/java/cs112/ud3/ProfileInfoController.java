package cs112.ud3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ProfileInfoController {

    private String name;

    public void processCharacterName(Character character) {
        String characterName = character.getName();
    }

    @FXML
    private Label characterNameLabel;

    protected void initData(String name) {
        this.name = name;

        characterNameLabel.setText(this.name);
    }



    @FXML
    protected void onExitButtonClick (ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }
}
