package com.dodemath.exec;

//import java.awt.event.KeyEvent;
import java.util.ArrayList;

import com.dodemath.app.Main;
import com.dodemath.app.Party;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;







public class MainExec{

	private Party party;
	private static Party actualParty;
	private final Delta dragDelta = new Delta();
    private @FXML AnchorPane firstView;
    private @FXML AnchorPane mainView;
	private @FXML Button btnOk;
	private @FXML Button btnPlay;
	private @FXML Button key1;
	private @FXML Button key2;
	private @FXML Button key3;
	private @FXML Button key4;
	private @FXML Button key5;
	private @FXML Button key6;
	private @FXML Button btnPlus;
	private @FXML Button btnMulti;
	private @FXML Button btnMoins;
	private @FXML Button btnDiv;
	private @FXML Label dpn1;
	private @FXML Label dpn2;
	private @FXML Label dpn3;
	private @FXML Label dpn4;
	private @FXML Label dpn5;
	private @FXML Label main_display;
	private @FXML Label result_display;
	private @FXML Label chronoDP;
	private @FXML Label pointsDP;
	private @FXML Label scoreDP;
	private @FXML Label bestScoreDP;
	private static Label chronoLabel;
	private static Label pointsLabel;
	private static Label scoreLabel;
	private static Label bestScoreLabel;
	private static Label dpn1Label;
	private static Label dpn2Label;
	private static Label dpn3Label;
	private static Label dpn4Label;
	private static Label dpn5Label;
	private static Label main_displayLabel;
	private static Label result_displayLabel;
	private static Button okButton;
	private static Button key1Button;
	private static Button key2Button;
	private static Button key3Button;
	private static Button key4Button;
	private static Button key5Button;
	private static Button key6Button;
	
	
	/**
	 * Listen to the keyboard (hardware). The player can use digital keys to select numbers and 'enter' key when validation is needed.
	 * 'enter' key is also used to start or stop the party.
	 * 
	 * @param event KeyEvent
	 * @see application.Party.displaySelectedNumbers(String value)
	 * @see application.Party.displayOperators(String value)
	 */
	@FXML
	private void EnterKeyPressed(KeyEvent event){
 		if(firstView.isVisible() && event.getCode().equals(KeyCode.ENTER)){
			firstAnchorpaneAction();
		}else if(!firstView.isVisible() && event.getCode().equals(KeyCode.ENTER)){
			if(btnOk.getText().equals("NO")){
				party.stop();
				firstView.setVisible(true);
			}
			startStopAction();
		}
 		if(!firstView.isVisible()){
			if(event.getCode().isDigitKey()){
				ArrayList<String> availableNumbers = new ArrayList<>();
 				availableNumbers.add(key1.getText());
 				availableNumbers.add(key2.getText());
 				availableNumbers.add(key3.getText());
 				availableNumbers.add(key4.getText());
 				availableNumbers.add(key5.getText());
 				availableNumbers.add(key6.getText());
 				ATTEMPT : for(int i = 0; i < availableNumbers.size(); i++){
 					if(event.getText().equals(availableNumbers.get(i))){
 						party.displaySelectedNumbers(event.getText());
 						break ATTEMPT;
 					}
 				}
 
 			}else if(event.getText().equals("+")){
 				party.displayOperators("+");
 			}else if(event.getText().equals("-")){
 				party.displayOperators("-");
 			}else if(event.getText().equals("/")){
 				party.displayOperators("/");
 			}else if(event.getText().equals("*")){
 				party.displayOperators("x");
 			}
 		}
		
	}
	
	/**
	 * Sets invisible the first AnchorPane when button 'play' pressed.
	 * @param event ActionEvent of button 'play' in the first AnchorPane.
	 * @see MainExec.firstAnchorpaneAction()
	 */
	@FXML
    private void readyToplay(ActionEvent event) {
		firstAnchorpaneAction();	
    }
	
	/**
	 * Sets firstView anchorpae invisible and initializes static variables.
	 */
	private void firstAnchorpaneAction(){
		firstView.setVisible(false);
		
		chronoLabel = chronoDP;
		pointsLabel = pointsDP;
		scoreLabel = scoreDP;
		bestScoreLabel = bestScoreDP;
		main_displayLabel = main_display;
		result_displayLabel = result_display;
		
		dpn1Label = dpn1;
		dpn2Label = dpn2;
		dpn3Label = dpn3;
		dpn4Label = dpn4;
		dpn5Label = dpn5;
		
		key1Button = key1;
		key2Button = key2;
		key3Button = key3;
		key4Button = key4;
		key5Button = key5;
		key6Button = key6;
		
		okButton = btnOk;
		
		startParty();
    }

	/**
	 * Starts and/or stops the game.
	 * @param event ActionEvent of the main button. 
	 */
	@FXML
	private void mainButtonPressed(ActionEvent event){
		
		startStopAction();
	}
	
	private void startStopAction(){
		
		switch(btnOk.getText()){
		case("GO"):		
			startParty();

			// A Listener for the Label chronoDP. Stops the party when the time equals 0.
			chronoDP.textProperty().addListener(new ChangeListener<String>() {
			    @Override
			    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {

			        if(newValue.equals("0")){
			        	party.stop();
			        }
			    }
			});
			break;
		case("NO"):
			party.stop();
			break;
		}
		
	}

	/**
	 * Calls a new party object
	 */
	private void startParty() {
		party = new Party();
		actualParty = party;
		party.start();
	}
	
	/**
	 * Displays values pressed on the keyboard on a screen.
	 * @param event ActionEvent of the keyboard.
	 */
	@FXML
	private void keyboardPressed(ActionEvent event){
		if(!firstView.isVisible()) {
			if(event.getTarget() == key1){
		    	party.displaySelectedNumbers(key1.getText());
			}else if(event.getTarget() == key2){
				party.displaySelectedNumbers(key2.getText());
			}else if(event.getTarget() == key3){
				party.displaySelectedNumbers(key3.getText());
			}else if(event.getTarget() == key4){
				party.displaySelectedNumbers(key4.getText());
			}else if(event.getTarget() == key5){
				party.displaySelectedNumbers(key5.getText());
			}else if(event.getTarget() == key6){
				party.displaySelectedNumbers(key6.getText());
			}else if(event.getTarget() == btnPlus){
				party.displayOperators(btnPlus.getText());
			}else if(event.getTarget() == btnMoins){
				party.displayOperators(btnMoins.getText());
			}else if(event.getTarget() == btnMulti){
				party.displayOperators(btnMulti.getText());
			}else if(event.getTarget() == btnDiv){
				party.displayOperators(btnDiv.getText());
			}
		}
	}
	
	public static Label getChronoLabel(){
		return chronoLabel;
	}
	
	public static Label getPointsLabel(){
		return pointsLabel;
	}
	
	public static Label getScoreLabel(){
		return scoreLabel;
	}
	
	public static Label getBestScoreLabel(){
		return bestScoreLabel;
	}
	
	public static Label getDpn1(){
		return dpn1Label;
	}
	
	public static Label getDpn2(){
		return dpn2Label;
	}
	
	public static Label getDpn3(){
		return dpn3Label;
	}
	
	public static Label getDpn4(){
		return dpn4Label;
	}
	
	public static Label getDpn5(){
		return dpn5Label;
	}
	
	public static Label getMain_displayLabel(){
		return main_displayLabel;
	}
	
	public static Label getResult_displayLabel(){
		return result_displayLabel;
	}
	
	public static Button getKey1(){
		return key1Button;
	}
	
	public static Button getKey2(){
		return key2Button;
	}
	
	public static Button getKey3(){
		return key3Button;
	}
	
	public static Button getKey4(){
		return key4Button;
	}
	
	public static Button getKey5(){
		return key5Button;
	}
	
	public static Button getKey6(){
		return key6Button;
	}
	
	public static Button getOkButton(){
		return okButton;
	}
	
	public static Party getParty(){
		return actualParty;
	}
	
	/**
	 * THe call of this method closes the program.
	 * @param event
	 */
	@FXML
	private void closeProgram(MouseEvent event){
		System.exit(0);		
	}

	@FXML
    void toolbarDragged(MouseEvent event){
		Main.getStage().setX(event.getScreenX() + dragDelta.x);
		Main.getStage().setY(event.getScreenY() + dragDelta.y);
    }

    @FXML
    void toolbarPressed(MouseEvent event){	
    	dragDelta.x = Main.getStage().getX() - event.getScreenX();
        dragDelta.y = Main.getStage().getY() - event.getScreenY();
    }

	
    class Delta { double x, y; } 

	
}
