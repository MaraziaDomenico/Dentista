package application;

import java.io.FileNotFoundException;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Region;

public class PrenotazioneController {

    @FXML
    private TextField nome;

    @FXML
    private TextField cognome;

    @FXML
    private TextField patologia;

    @FXML
    private TextField prestazione;

    @FXML
    private TextField telefono;

    @FXML
    private TextField durata;
    
    GestFile fg = new GestFile();
    
    @FXML
    void invia(ActionEvent event) throws FileNotFoundException, IOException {
    	
    	Paziente p = new Paziente(nome.getText(), cognome.getText(), patologia.getText(), prestazione.getText(), telefono.getText(), durata.getText());
    	if (nome.getText().length() == 0) {
    		Alert alert = new Alert(AlertType.ERROR, "Inserire un nome valido!", ButtonType.OK);
   		 	alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
   		 	alert.setTitle("Dentista");
   		 	alert.show();
    	}else if (cognome.getText().length() == 0) {
    		Alert alert = new Alert(AlertType.ERROR, "Inserire un cognome valido!", ButtonType.OK);
   		 	alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
   		 	alert.setTitle("Dentista");
   		 	alert.show();
    	}else if (patologia.getText().length() == 0) {
    		Alert alert = new Alert(AlertType.ERROR, "Inserire una patologia valida!", ButtonType.OK);
   		 	alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
   		 	alert.setTitle("Dentista");
   		 	alert.show();
    	}else if (prestazione.getText().length() == 0) {
    		Alert alert = new Alert(AlertType.ERROR, "Inserire una prestazione valida!", ButtonType.OK);
   		 	alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
   		 	alert.setTitle("Dentista");
   		 	alert.show();
    	}else if (telefono.getText().length() == 0) {
    		Alert alert = new Alert(AlertType.ERROR, "Inserire un numero valido!", ButtonType.OK);
   		 	alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
   		 	alert.setTitle("Dentista");
   		 	alert.show();
    	}else if (durata.getText().length() == 0) {
    		Alert alert = new Alert(AlertType.ERROR, "Inserire una durata valida!", ButtonType.OK);
   		 	alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
   		 	alert.setTitle("Dentista");
   		 	alert.show();
    	}else {
    	
    	fg.apri("Paziente"+cognome.getText() + ".txt", 'w');
    	fg.scriviRecord("Nome: "+nome.getText() +"\r\nCognome: "+cognome.getText()+"\r\nPatologia: "+patologia.getText().length()+"\r\nPrestazione: "+prestazione.getText()+"\r\nTelefono: "+telefono.getText().length()+"\r\nDurata: "+durata.getText().length());   	
    	fg.chiudi('w');
    	
    	Alert alert = new Alert(AlertType.CONFIRMATION, "Visita prenotata!", ButtonType.OK);
		 alert.getDialogPane().setMinHeight(Region.USE_PREF_SIZE);
		 alert.setTitle("Dentista");
		 alert.show();
    	}

    }

}
