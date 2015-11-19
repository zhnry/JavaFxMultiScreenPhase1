/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

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
  private void bntLogOffMouseClickedHandler(MouseEvent event) {
    System.out.println("You clicked the logoff button!");
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
