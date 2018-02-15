package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    StackPane pane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loadMenuScreen();
    }

    public void loadMenuScreen() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("Menu.fxml"));

        Pane paneMenu = null;

        try{
            paneMenu = loader.load();
        }catch (IOException e){
            e.printStackTrace();
        }
        ControllerMenu controllerMenu = loader.getController();
        controllerMenu.setController(this);
        setScreen(paneMenu);
    }

    public void setScreen(Pane paneMenu) {
        pane.getChildren().clear();
        pane.getChildren().add(paneMenu);
    }
}
