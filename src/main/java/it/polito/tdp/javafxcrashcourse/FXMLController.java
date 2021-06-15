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
	private TextField textName;

	@FXML
	private TextField textAge;

	@FXML
	private Button btnOK;

	@FXML
	private Label lblResponse;

	@FXML
	void handleOK(ActionEvent event) {
//    	System.out.println("OK") ;
		String name = textName.getText();
		if(name.length()==0) {
			lblResponse.setText("Devi inserire il nome");
			return ;
		}

		String ageS = textAge.getText();
		if(ageS.length()==0) {
			lblResponse.setText("Devi inserire l'età");
			return ;
		}

		int age ;
		try {
			age = Integer.parseInt(ageS);
		}catch (NumberFormatException e) {
			lblResponse.setText("L'età deve essere un numero");
			return ;
		}

		String saluto;
		if (age < 18) {
			saluto = "Ciao, " + name + "!";
		} else {
			saluto = "Buongiorno, " + name + "!";
		}
		lblResponse.setText(saluto);

	}

	@FXML
	void initialize() {
		assert textName != null : "fx:id=\"textname\" was not injected: check your FXML file 'Scene.fxml'.";
		assert textAge != null : "fx:id=\"textAge\" was not injected: check your FXML file 'Scene.fxml'.";
		assert btnOK != null : "fx:id=\"btnOK\" was not injected: check your FXML file 'Scene.fxml'.";
		assert lblResponse != null : "fx:id=\"lblResponse\" was not injected: check your FXML file 'Scene.fxml'.";
	}
}
