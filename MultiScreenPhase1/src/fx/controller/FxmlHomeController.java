/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Phil O'Connell <pxo4@psu.edu>
 */
public class FxmlHomeController implements Initializable {
  @FXML
  private Label lblName;
  @FXML
  private Button btnLogOff;

  /**
   * Initializes the controller class.
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  

  @FXML
  private void bntLogOffMouseClickedHandler(MouseEvent event) throws IOException {
    System.out.println("You clicked the logoff button!");
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    
    String resource ="/fx/screen/FxmlLogin.fxml";
    FXMLLoader loader = new FXMLLoader(getClass().getResource(resource));
    Parent homeScreen = (Parent) loader.load();
    
    Scene scene = new Scene(homeScreen);
    stage.setScene(scene);
  }

  @FXML
  private void boardMouseClicked(MouseEvent event) {
    System.out.println("You clicked a button!");
    Button b = (Button) event.getSource();
    String currentMark = b.getText();
    String newMark = null;

    switch (currentMark) {
      case " ":
        newMark = "X";
        break;
      case "X":
        newMark = "O";
        break;
      case "O":
        newMark = " ";
        break;
    }
    b.setText(newMark);
  }
  
}
