package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.io.IOException;

/**
 * Created by User on 2018-02-15.
 */
public class ControllerMenu {

    private Controller controller;

    public void setController(Controller controller) {
        this.controller = controller;
    }

    @FXML
    public void goToApp(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Application.fxml"));
        Pane pane=null;

        try{
            pane= loader.load();
        }catch (IOException e){
            e.printStackTrace();
        }
        AppController appController = loader.getController();
        appController.setController(controller);
        controller.setScreen(pane);
    }
    @FXML
    public void goToOption(){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Options.fxml"));

        Pane pane =null;

        try{
            pane=loader.load();
        }catch (IOException e){
            e.printStackTrace();
        }
        OptionController optionController = loader.getController();
        optionController.setController(controller);
        controller.setScreen(pane);
    }
    @FXML
    public void exit(){
        Platform.exit();
    }
}
