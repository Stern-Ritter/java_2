package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
    @FXML
    public TextArea mainTextArea;
    @FXML
    public TextField mainTextField;

    public void sendMessage(){
        mainTextArea.appendText(mainTextField.getText() + "\n");
        mainTextField.clear();
    }
}
