package firstApp.controllers;

import javafx.fxml.FXML;

public class OptionsController {
	
	private MainController mainController ; 
	
	@FXML
	public void backMenu1() {
		mainController.loadMainScreen();
		
	}

	public void setMainController(MainController mainController) {
		this.mainController = mainController;
	}
	
	

}
