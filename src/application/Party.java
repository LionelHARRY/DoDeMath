package application;


import java.io.IOException;

import application.Chrono;
import application.Generator;
import exec.MainExec;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.EventHandler;


public class Party {
	private Generator generator;
	private Chrono chrono;
	private EditFile file;
	private String score;
	private int scoreInt;
	private String recordedScore;
	private int recordedScoreInt;
	
	public Party(){
		file = new EditFile();
	}

	
	/**
	 * Start a new party
	 */
	public void start(){
		MainExec.getOkButton().setText("NO");
		MainExec.getScoreLabel().setText("0");
		MainExec.getPointsLabel().setText("0");
		try {
			recordedScore = file.readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		MainExec.getBestScoreLabel().setText(recordedScore);
		displayKeyboard();
		chrono = new Chrono();
		chrono.start();
	}
	
	/**
	 * Stops the current party
	 */
	public void stop(){
		chrono.stop();
		
		score = MainExec.getScoreLabel().getText();
		if(score.equals("")){
			score = "0";
		}
		scoreInt = Integer.parseInt(score);
		try {
			recordedScore = file.readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		recordedScoreInt = Integer.parseInt(recordedScore);
		
		if(scoreInt > recordedScoreInt){
			try {
				file.writeFile(score);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		MainExec.getOkButton().setText("GO");
		MainExec.getMain_displayLabel().setText("");
		MainExec.getResult_displayLabel().setText("");
		MainExec.getScoreLabel().setText("");
		MainExec.getPointsLabel().setText("");
		MainExec.getDpn1().setText("");
		MainExec.getDpn2().setText("");
		MainExec.getDpn3().setText("");
		MainExec.getDpn4().setText("");
		MainExec.getDpn5().setText("");
		MainExec.getKey1().setText("");
		MainExec.getKey2().setText("");
		MainExec.getKey3().setText("");
		MainExec.getKey4().setText("");
		MainExec.getKey5().setText("");
		MainExec.getKey6().setText("");
		
	}
	
	public void next() throws InterruptedException{
		chrono.stop();

		Task<Void> sleeper = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
                return null;
            }
        };
        sleeper.setOnSucceeded(new EventHandler<WorkerStateEvent>() {
            @Override
            public void handle(WorkerStateEvent event) {
            	score = MainExec.getScoreLabel().getText();
        		scoreInt = Integer.parseInt(score);
        		try {
        			recordedScore = file.readFile();
        		} catch (IOException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        		recordedScoreInt = Integer.parseInt(recordedScore);
        		
        		if(scoreInt > recordedScoreInt){
        			MainExec.getBestScoreLabel().setText(score);
        			try {
        				file.writeFile(score);
        			} catch (IOException e) {
        				// TODO Auto-generated catch block
        				e.printStackTrace();
        			}
        		}else{
        			MainExec.getBestScoreLabel().setText(recordedScore);
        		}
        		
            	MainExec.getResult_displayLabel().setText("");
            	MainExec.getPointsLabel().setText("");
        		MainExec.getDpn1().setText("");
        		MainExec.getDpn2().setText("");
        		MainExec.getDpn3().setText("");
        		MainExec.getDpn4().setText("");
        		MainExec.getDpn5().setText("");
        		
        		displayKeyboard();
        		
        		if(scoreInt < 50){
        			chrono = new Chrono();
        		}else if(scoreInt > 50 && scoreInt < 70){
        			chrono = new Chrono(20);
        		}else if(scoreInt > 70){
        			chrono = new Chrono(15);
        		}
        		
        		chrono.start();
            }
        });
        new Thread(sleeper).start();

	}

	
	/**
	 * Displays the number to find in the main screen.<br>
	 * Displays numbers on the keyboard.<br>
	 * Uses the setText() to set the text in the screen and keyboard.
	 * 
	 * 
	 */
	private void displayKeyboard(){
		generator = new Generator();
		String number = generator.getMainNumber();
		String[] keyNumbers = generator.getKeyNumbers();
		
		MainExec.getMain_displayLabel().setText(number);
		
		MainExec.getKey1().setText(keyNumbers[0]);
		MainExec.getKey2().setText(keyNumbers[1]);
		MainExec.getKey3().setText(keyNumbers[2]);
		MainExec.getKey4().setText(keyNumbers[3]);
		MainExec.getKey5().setText(keyNumbers[4]);
		MainExec.getKey6().setText(keyNumbers[5]);
	}
	
	/**
	 * Once the player presses the keyboard, the number selected is displayed
	 * in a screen. This method displays does numbers.
	 * 
	 * @param value String
	 * @see operations()
	 * 
	 */
	public void displaySelectedNumbers(String value){
		if(MainExec.getDpn1().getText().equals("")){
			MainExec.getDpn1().setText(value);
    	}else if(!MainExec.getDpn1().getText().equals("") && !MainExec.getDpn2().getText().equals("") && MainExec.getDpn3().getText().equals("")){
    		MainExec.getDpn3().setText(value);
    	}else if(!MainExec.getDpn4().getText().equals("") && MainExec.getDpn5().getText().equals("") ){
    		MainExec.getDpn5().setText(value);

			Operations.operation();
    	}
	}
	
	/**
	 * Once the player presses arithmetic operators , these operators selected are is displayed
	 * in a screen. This method displays the operators.
	 * @param value String
	 */
	public void displayOperators(String value){
		if(!MainExec.getDpn1().getText().equals("") && MainExec.getDpn2().getText().equals("")){
			MainExec.getDpn2().setText(value);
    	}else if(!MainExec.getDpn3().getText().equals("") && MainExec.getDpn4().getText().equals("")){
    		MainExec.getDpn4().setText(value);
    	}
	}

}
