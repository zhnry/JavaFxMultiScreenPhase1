/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
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
 *
 * @author Phil O'Connell <pxo4@psu.edu>
 */
public class FxmlLoginController implements Initializable {
  
  @FXML
  private Button btnLogin;
  
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }  

  @FXML
  private void btnLoginMouseClickedHandler(MouseEvent event) throws IOException {
    System.out.println("You clicked the login button!");
    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    
    String resource ="/fx/screen/FxmlHome.fxml";
    FXMLLoader loader = new FXMLLoader(getClass().getResource(resource));
    Parent homeScreen = (Parent) loader.load();
    
    Scene scene = new Scene(homeScreen);
    stage.setScene(scene);
  }
  
}
