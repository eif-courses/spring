/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stiliauskeitimasfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SkinBase;
import javafx.scene.control.TextArea;

/**
 *
 * @author Marius
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private TextArea output;

    @FXML
    private TextArea input;

    @FXML
    private Button clearBtn;

    @FXML
    private Button changeStyle;

    @FXML
    private Button saveBtn;

    @FXML
    void clearText(ActionEvent event) {

    }

    @FXML
    void changeStyle(ActionEvent event) {

     
    }

    @FXML
    void saveToSettingsFile(ActionEvent event) {

    }

    @FXML
    void previewInBrowser(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
