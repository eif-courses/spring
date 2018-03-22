/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;


import java.awt.Color;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import javafx.scene.shape.Rectangle;
import javax.swing.JOptionPane;


/**
 *
 * @author Marius
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ListView<Studentas> sarasas;

    @FXML
    private DatePicker kalendorius;

    
    @FXML
    private TitledPane nustatymuPanele;
     @FXML
    private VBox tabo_stilius;
    @FXML
    private Pane antraste;
    @FXML
    private Rectangle spalvosDaugiakampis;
    
    @FXML
    private ColorPicker palete;
    
    @FXML
    private PieChart skritulineDiagrama;
    @FXML
    private TextArea tekstinisLaukelis;
    
    @FXML
    private Button mygtukas;
    private List<Studentas> studentai;

    @FXML
    private void handleButtonAction(ActionEvent event) {

        ObservableList<PieChart.Data> data = FXCollections.observableArrayList(new PieChart.Data("", 0));

        for (int i = 0; i < studentai.size(); i++) {
            data.add(1, new PieChart.Data(studentai.get(i).getVardas(), studentai.get(i).getBalas()));
        }
        data.remove(0);
        skritulineDiagrama.setData(data);

        for (Studentas selectedItem : sarasas.getSelectionModel().getSelectedItems()) {
            if (selectedItem.getBalas() >= 20) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Studento egzamino rezultatai");
                alert.setHeaderText("Elektronikos ir informatikos fakultetas");
                alert.setContentText(selectedItem.getVardas()
                        + ", jūs sėkmingai išlaikėte egzaminą!" + "\n jūs surinkote "
                        + selectedItem.getBalas() + " Balų" + " iš 50");

                alert.showAndWait();
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Studento egzamino rezultatai");
                alert.setHeaderText("Elektronikos ir informatikos fakultetas");
                alert.setContentText(selectedItem.getVardas()
                        + ", deja jūs neišlaikėte egzamino!" + "\n jūs surinkote "
                        + selectedItem.getBalas() + " Balų" + " iš 50");

                alert.showAndWait();
            }
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        studentai = new ArrayList<>();
        studentai.add(new Studentas("Petras", "Jonaitis", 10, 23));
        studentai.add(new Studentas("Kazimieras", "Kazimieraitis", 30, 21));
        studentai.add(new Studentas("Ona", "Onaitytė", 10, 19));
        studentai.add(new Studentas("Paulius", "Jonaitis", 10, 24));
        studentai.add(new Studentas("Tomas", "Tomaitis", 10, 21));
        studentai.add(new Studentas("Saulius", "Saulaitis", 10, 21));
        studentai.add(new Studentas("Antanas", "Jonaitis", 20, 20));

        ObservableList<Studentas> items = FXCollections.observableArrayList(studentai);
        sarasas.setItems(items);

    }
    @FXML
    void pakeistiSpalva(ActionEvent event) {
        
        spalvosDaugiakampis.setFill(palete.getValue());
        
        String spalva = ""+ palete.getValue();
        
        String rgb = spalva.substring(2, 8);

        antraste.setStyle("-fx-background-color:#"+ rgb);
      
       //JOptionPane.showMessageDialog(null, rgb);

        
    }
    
}
