package com.dodemath.app;

import com.dodemath.exec.MainExec;
import com.dodemath.app.Scores;

public class Operations{
	
	/**
	 * This method does :
	 * <u>
	 * 	<li>Arithmetical operationss</li>
	 *  <li>Displays the results on screen</li>
	 * </u>
	 */
	public static void operation(){
		String operator_1 = MainExec.getDpn2().getText();
		String operator_2 = MainExec.getDpn4().getText();
		String stringResult;
		
		long number_1 = Integer.parseInt(MainExec.getDpn1().getText());
		long number_2 = Integer.parseInt(MainExec.getDpn3().getText());
		long number_3 = Integer.parseInt(MainExec.getDpn5().getText());
		long screenResult = Integer.parseInt(MainExec.getMain_displayLabel().getText());
		long result;
		
		if(operator_1.compareTo("+") == 0 && operator_2.compareTo("+") == 0 ){
			
			result = (number_1 + number_2) + number_3;
			if(result == screenResult){
				
				MainExec.getResult_displayLabel().setText("" + result);
				/*Give 5 points*/
				Scores.setScore5();
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(result >= screenResult + 2 || result <= screenResult - 2){
				
				MainExec.getResult_displayLabel().setText("TRY");

				
			}else{
				/*Give 1 point*/
				Scores.setScore1();
				stringResult = String.valueOf(result);
				MainExec.getResult_displayLabel().setText(stringResult);
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		}else if(operator_1.compareTo("+") == 0 && operator_2.compareTo("-") == 0 ){
			
			result = (number_1 + number_2) - number_3;
			if(result == screenResult){
				
				MainExec.getResult_displayLabel().setText("" + result);
				/*Give 5 points */
				Scores.setScore5();
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(result >= screenResult + 2 || result <= screenResult - 2){
				MainExec.getResult_displayLabel().setText("TRY");
			}else{
				
				/*Give 1 points*/
				Scores.setScore1();
				stringResult = String.valueOf(result);
				MainExec.getResult_displayLabel().setText(stringResult);
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else if(operator_1.compareTo("+") == 0 && operator_2.compareTo("x") == 0 ){
			
			result = (number_1 + number_2) * number_3;
			if(result == screenResult){
				
				MainExec.getResult_displayLabel().setText("" + result);
				/*Give 5 points*/
				Scores.setScore5();
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(result >= screenResult + 2 || result <= screenResult - 2){
				MainExec.getResult_displayLabel().setText("TRY");
			}else{
				
				/*Give 1 points*/
				Scores.setScore1();
				stringResult = String.valueOf(result);
				MainExec.getResult_displayLabel().setText(stringResult);
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else if(operator_1.compareTo("+") == 0 && operator_2.compareTo("/") == 0 ){
			
			if(number_3 != 0){
				result = (number_1 + number_2) / number_3;
				if(result == screenResult){
					
					MainExec.getResult_displayLabel().setText("" + result);
					/*Give 5 points*/
					Scores.setScore5();
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(result >= screenResult + 2 || result <= screenResult - 2){
					MainExec.getResult_displayLabel().setText("TRY");
				}else{
					
					/*Give 1 points*/
					Scores.setScore1();
					stringResult = String.valueOf(result);
					MainExec.getResult_displayLabel().setText(stringResult);
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}else{
				MainExec.getResult_displayLabel().setText("TRY");
			}
			
		}else if(operator_1.compareTo("-") == 0 && operator_2.compareTo("-") == 0 ){
			
			result = (number_1 - number_2) - number_3;
			if(result == screenResult){
				
				MainExec.getResult_displayLabel().setText("" + result);
				/*Give 5 points*/
				Scores.setScore5();
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(result >= screenResult + 2 || result <= screenResult - 2){
				MainExec.getResult_displayLabel().setText("TRY");
			}else{
				/*Give 1 points*/
				Scores.setScore1();
				stringResult = String.valueOf(result);
				MainExec.getResult_displayLabel().setText(stringResult);
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else if(operator_1.compareTo("-") == 0 && operator_2.compareTo("+") == 0 ){
			
			result = (number_1 - number_2) + number_3;
			if(result == screenResult){
				
				MainExec.getResult_displayLabel().setText("" + result);
				/*Give 5 points*/
				Scores.setScore5();
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(result >= screenResult + 2 || result <= screenResult - 2){
				MainExec.getResult_displayLabel().setText("TRY");
			}else{
				
				/*Give 1 points*/
				Scores.setScore1();
				stringResult = String.valueOf(result);
				MainExec.getResult_displayLabel().setText(stringResult);
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else if(operator_1.compareTo("-") == 0 && operator_2.compareTo("x") == 0 ){
			
			result = (number_1 - number_2) * number_3;
			if(result == screenResult){
				
				MainExec.getResult_displayLabel().setText("" + result);
				/*Give 5 points*/
				Scores.setScore5();
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(result >= screenResult + 2 || result <= screenResult - 2){
				MainExec.getResult_displayLabel().setText("TRY");
			}else{
				/*Give 1 points*/
				Scores.setScore1();
				stringResult = String.valueOf(result);
				MainExec.getResult_displayLabel().setText(stringResult);
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else if(operator_1.compareTo("-") == 0 && operator_2.compareTo("/") == 0 ){
			
			if(number_3 != 0){
				result = (number_1 - number_2) / number_3;
				if(result == screenResult){
					
					MainExec.getResult_displayLabel().setText("" + result);
					/*Give 5 points*/
					Scores.setScore5();
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(result >= screenResult + 2 || result <= screenResult - 2){
					MainExec.getResult_displayLabel().setText("TRY");
				}else{
					/*Give 1 points*/
					Scores.setScore1();
					stringResult = String.valueOf(result);
					MainExec.getResult_displayLabel().setText(stringResult);
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}else{
				MainExec.getResult_displayLabel().setText("TRY");
			}
			
		}else if(operator_1.compareTo("x") == 0 && operator_2.compareTo("x") == 0 ){
			
			result = (number_1 * number_2) * number_3;
			if(result == screenResult){
				
				MainExec.getResult_displayLabel().setText("" + result);
				/*Give 5 points*/
				Scores.setScore5();
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(result >= screenResult + 2 || result <= screenResult - 2){
				MainExec.getResult_displayLabel().setText("TRY");
			}else{
				
				/*Give 1 points*/
				Scores.setScore1();
				stringResult = String.valueOf(result);
				MainExec.getResult_displayLabel().setText(stringResult);
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else if(operator_1.compareTo("x") == 0 && operator_2.compareTo("-") == 0 ){
			
			result = (number_1 * number_2) - number_3;
			if(result == screenResult){
				
				MainExec.getResult_displayLabel().setText("" + result);
				/*Give 5 points*/
				Scores.setScore5();
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(result >= screenResult + 2 || result <= screenResult - 2){
				MainExec.getResult_displayLabel().setText("TRY");
			}else{
				
				/*Give 1 points*/
				Scores.setScore1();
				stringResult = String.valueOf(result);
				MainExec.getResult_displayLabel().setText(stringResult);
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else if(operator_1.compareTo("x") == 0 && operator_2.compareTo("+") == 0 ){
			
			result = (number_1 * number_2) + number_3;
			if(result == screenResult){
				
				MainExec.getResult_displayLabel().setText("" + result);
				/*Give 5 points*/
				Scores.setScore5();
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(result >= screenResult + 2 || result <= screenResult - 2){
				MainExec.getResult_displayLabel().setText("TRY");
			}else{
				
				/*Give 1 points*/
				Scores.setScore1();
				stringResult = String.valueOf(result);
				MainExec.getResult_displayLabel().setText(stringResult);
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else if(operator_1.compareTo("x") == 0 && operator_2.compareTo("/") == 0 ){
			
			if(number_3 != 0){
				result = (number_1 * number_2) / number_3;
				if(result == screenResult){
					
					MainExec.getResult_displayLabel().setText("" + result);
					/*Give 5 points*/
					Scores.setScore5();
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(result >= screenResult + 2 || result <= screenResult - 2){
					MainExec.getResult_displayLabel().setText("TRY");
				}else{
					
					/*Give 1 points*/
					Scores.setScore1();
					stringResult = String.valueOf(result);
					MainExec.getResult_displayLabel().setText(stringResult);
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}else{
				MainExec.getResult_displayLabel().setText("TRY");
			}

		}else if(operator_1.compareTo("/") == 0 && operator_2.compareTo("/") == 0 ){
			
			if(number_2 != 0 && number_3 != 0){
				result = (number_1 / number_2) / number_3;
				if(result == screenResult){
					
					MainExec.getResult_displayLabel().setText("" + result);
					/*Give 5 points*/
					Scores.setScore5();
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(result >= screenResult + 2 || result <= screenResult - 2){
					MainExec.getResult_displayLabel().setText("TRY");
				}else{
					
					/*Give 1 points*/
					Scores.setScore1();
					stringResult = String.valueOf(result);
					MainExec.getResult_displayLabel().setText(stringResult);
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}else{
				MainExec.getResult_displayLabel().setText("TRY");
			}

		}else if(operator_1.compareTo("/") == 0 && operator_2.compareTo("-") == 0 ){
			
			if(number_2 != 0){
				result = (number_1 / number_2) - number_3;
				if(result == screenResult){
					
					MainExec.getResult_displayLabel().setText("" + result);
					/*Give 5 points*/
					Scores.setScore5();
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(result >= screenResult + 2 || result <= screenResult - 2){
					MainExec.getResult_displayLabel().setText("TRY");
				}else{
					
					/*Give 1 pointst*/
					Scores.setScore1();
					stringResult = String.valueOf(result);
					MainExec.getResult_displayLabel().setText(stringResult);
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}else{
				MainExec.getResult_displayLabel().setText("TRY");
			}

		}else if(operator_1.compareTo("/") == 0 && operator_2.compareTo("+") == 0 ){
			
			if(number_2 != 0){
				result = (number_1 / number_2) + number_3;
				if(result == screenResult){
					
					MainExec.getResult_displayLabel().setText("" + result);
					/*Give 5 points*/
					Scores.setScore5();
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(result >= screenResult + 2 || result <= screenResult - 2){
					MainExec.getResult_displayLabel().setText("TRY");
				}else{
					/*Give 1 points*/
					Scores.setScore1();
					stringResult = String.valueOf(result);
					MainExec.getResult_displayLabel().setText(stringResult);
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}else{
				MainExec.getResult_displayLabel().setText("TRY");
			}
			
		}else if(operator_1.compareTo("/") == 0 && operator_2.compareTo("x") == 0 ){
			
			if(number_2 != 0){
				result = (number_1 / number_2) * number_3;
				if(result == screenResult){
					
					MainExec.getResult_displayLabel().setText("" + result);
					/*Give 5 points*/
					Scores.setScore5();
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(result >= screenResult + 2 || result <= screenResult - 2){
					MainExec.getResult_displayLabel().setText("TRY");
				}else{
					
					/*Give 1 points*/
					Scores.setScore1();
					stringResult = String.valueOf(result);
					MainExec.getResult_displayLabel().setText(stringResult);
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}else{
				MainExec.getResult_displayLabel().setText("TRY");
			}

		}
	}
}
