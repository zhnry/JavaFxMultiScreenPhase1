/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

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
  private void bthLoginMouseClickedHandler(MouseEvent event) {
    System.out.println("You clicked the login button!");
  }
  
}
