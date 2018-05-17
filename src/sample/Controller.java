package sample;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;


public class Controller {
    @FXML
    private Label dummyLabel;
    @FXML
    private TextField nameTextField;

public void SayHi(ActionEvent event){

        dummyLabel.setText("Labas Nerijau");
}
public void ChangeName(ActionEvent event){
    String name = nameTextField.getText();
    dummyLabel.setText("Labas "+name);
}
public void ChangeNameOnEnter(javafx.scene.input.KeyEvent event){
    if (event.getCode() == KeyCode.ENTER){
        dummyLabel.setText("Labas "+nameTextField.getText());
    }
}

}
