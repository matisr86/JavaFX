package firstApp.controllers;

import javafx.fxml.FXML;


public class AppController {

	private MainController mainController ; 
	
	@FXML
	public void backMenu() {
		mainController.loadMainScreen();
	}



	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}




}
