package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

/**
 * Created by User on 2018-02-15.
 */
public class AppController {

    private Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    @FXML
    public void returnToMenu(){
        controller.loadMenuScreen();
    }

}
