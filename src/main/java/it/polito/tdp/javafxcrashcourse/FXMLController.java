package it.polito.tdp.javafxcrashcourse;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextField txtNome;

	@FXML
	private TextField txtEta;

	@FXML
	private Button btnOK;

	@FXML
	private Label lblRisposta;

	@FXML
	void handleOK(ActionEvent event) {
//    	System.out.println("OK") ;
		String nome = txtNome.getText();
		if(nome.length()==0) {
			lblRisposta.setText("Devi inserire il nome");
			return ;
		}

		String etaS = txtEta.getText();
		if(etaS.length()==0) {
			lblRisposta.setText("Devi inserire l'età");
			return ;
		}

		int eta ;
		try {
			eta = Integer.parseInt(etaS);
		}catch (NumberFormatException e) {
			lblRisposta.setText("L'età deve essere un numero");
			return ;
		}

		String saluto;
		if (eta < 18) {
			saluto = "Ciao, " + nome + "!";
		} else {
			saluto = "Buongiorno, " + nome + "!";
		}

		lblRisposta.setText(saluto);

	}

	@FXML
	void initialize() {
		assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'Scene.fxml'.";
		assert txtEta != null : "fx:id=\"txtEta\" was not injected: check your FXML file 'Scene.fxml'.";
		assert btnOK != null : "fx:id=\"btnOK\" was not injected: check your FXML file 'Scene.fxml'.";
		assert lblRisposta != null : "fx:id=\"lblRisposta\" was not injected: check your FXML file 'Scene.fxml'.";

	}
}
