package calculator;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField mainTextField;
    @FXML
    public TextArea mainTextArea;

    public void getSymbol(javafx.event.ActionEvent actionEvent) {
        Button btn = (Button) actionEvent.getSource();
        mainTextField.appendText(btn.getText());
    }

    public void getResult(ActionEvent actionEvent) throws ScriptException {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String expression = mainTextField.getText();
        mainTextArea.appendText(expression+ " = " + engine.eval(expression) + "\n");
        mainTextField.clear();
    }
}

