package sample;

import javafx.fxml.FXML;

/**
 * Created by User on 2018-02-15.
 */
public class OptionController {

    private Controller controller;

    @FXML
    public void returnToMenu(){
        controller.loadMenuScreen();
    }

    public void setController(Controller controller) {
        this.controller = controller;
    }
}
