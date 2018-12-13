package com.dodemath.app;

import com.dodemath.exec.MainExec;

public class Scores{

	
	public static void setScore5(){


		/*Displays the score*/
		int points = 5;
		String stPoints = String.valueOf(points);
		MainExec.getPointsLabel().setText(stPoints);
		
		/*Initial score*/
		String ScoreIni = MainExec.getScoreLabel().getText();
		int intScoreIni = Integer.parseInt(ScoreIni);
		
		/*Total score*/
		int score5 = intScoreIni + points;
		String stscore = String.valueOf(score5);
		MainExec.getScoreLabel().setText(stscore);
		
	}
	
	
	/**Sum all the score
	 * 
	 * @see Score#score
	 * @param pt
	 */
	public static void setScore1(){

		int points = 1;
		String stPoints = String.valueOf(points);
		MainExec.getPointsLabel().setText(stPoints);
		
		/*Initial score*/
		String ScoreIni = MainExec.getScoreLabel().getText();
		int intScoreIni = Integer.parseInt(ScoreIni);
		
		/*Total score*/
		int score1 = intScoreIni + points;
		String stscore = String.valueOf(score1);
		MainExec.getScoreLabel().setText(stscore);

	}

}
