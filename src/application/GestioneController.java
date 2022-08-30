package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.layout.Region;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class GestioneController {

    @FXML
    private TextField labelG;
    
    GestFile fg = new GestFile();
    
    DentistaController d = new DentistaController();
    Rectangle rec;
    
    public void inizio(DentistaController dc, Rectangle r){
    	d = dc;
    	rec = r;
    }

    @FXML
    void elimina(ActionEvent event) {
    	
    	fg.cancella("Paziente"+ labelG.getText()+ ".txt");
    	Alert alert = new Alert(AlertType.CONFIRMATION, "Prenotazione eliminata!", ButtonType.OK);
		 	alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
		 	alert.setTitle("Dentista");
		 	alert.show();
		 	d.setVerde(rec);

    }

    @FXML
    void modifica(ActionEvent event) throws FileNotFoundException, IOException {
    	
    	fg.cancella("Paziente"+ labelG.getText()+ ".txt");
    	try {

    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Prenotazione.fxml"));
    		Parent root1 = (Parent) fxmlLoader.load();
    		Stage stage = new Stage();
    		stage.setScene(new Scene(root1,475,600));  
    		stage.show();
    	} catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    	
    	
    	

    }

}
