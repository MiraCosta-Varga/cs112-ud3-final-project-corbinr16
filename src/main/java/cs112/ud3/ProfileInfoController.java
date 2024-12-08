package cs112.ud3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ProfileInfoController {

    private String name;

    @FXML
    private Label characterNameLabel, classLevelLabel, silverLabel, featuredAbilityLabel;

    protected void initData(String name, int level, int silver, String catchPhrase) {
        characterNameLabel.setText(name);
        classLevelLabel.setText(String.valueOf(level));
        silverLabel.setText(String.valueOf(silver));
        featuredAbilityLabel.setText(catchPhrase);
    }



    @FXML
    protected void onExitButtonClick (ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }
}
