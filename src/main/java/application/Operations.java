package application;

import exec.MainExec;
import application.Scores;

public class Operations{
	
	/**
	 * This method does :
	 * <u>
	 * 	<li>Arithmetical operationss</li>
	 *  <li>Displays the results on screen</li>
	 * </u>
	 */
	public static void operation(){
		String nb2 = MainExec.getDpn2().getText();
		String nb4 = MainExec.getDpn4().getText();
		String resultat;
		
		long nb1 = Integer.parseInt(MainExec.getDpn1().getText());
		long nb3a = Integer.parseInt(MainExec.getDpn3().getText());
		long nb5a = Integer.parseInt(MainExec.getDpn5().getText());
		long nb6a = Integer.parseInt(MainExec.getMain_displayLabel().getText());
		long result;
		
		if(nb2.compareTo("+") == 0 && nb4.compareTo("+") == 0 ){
			
			result = (nb1 + nb3a) + nb5a;
			if(result == nb6a){
				
				MainExec.getResult_displayLabel().setText("" + result);
				/*Give 5 points*/
				Scores.setScore5();
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(result >= nb6a + 2 || result <= nb6a - 2){
				
				MainExec.getResult_displayLabel().setText("TRY");

				
			}else{
				/*Give 1 point*/
				Scores.setScore1();
				resultat = String.valueOf(result);
				MainExec.getResult_displayLabel().setText(resultat);
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		}else if(nb2.compareTo("+") == 0 && nb4.compareTo("-") == 0 ){
			
			result = (nb1 + nb3a) - nb5a;
			if(result == nb6a){
				
				MainExec.getResult_displayLabel().setText("" + result);
				/*Give 5 points */
				Scores.setScore5();
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(result >= nb6a + 2 || result <= nb6a - 2){
				MainExec.getResult_displayLabel().setText("TRY");
			}else{
				
				/*Give 1 points*/
				Scores.setScore1();
				resultat = String.valueOf(result);
				MainExec.getResult_displayLabel().setText(resultat);
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else if(nb2.compareTo("+") == 0 && nb4.compareTo("x") == 0 ){
			
			result = (nb1 + nb3a) * nb5a;
			if(result == nb6a){
				
				MainExec.getResult_displayLabel().setText("" + result);
				/*Give 5 points*/
				Scores.setScore5();
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(result >= nb6a + 2 || result <= nb6a - 2){
				MainExec.getResult_displayLabel().setText("TRY");
			}else{
				
				/*Give 1 points*/
				Scores.setScore1();
				resultat = String.valueOf(result);
				MainExec.getResult_displayLabel().setText(resultat);
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else if(nb2.compareTo("+") == 0 && nb4.compareTo("/") == 0 ){
			
			if(nb5a != 0){
				result = (nb1 + nb3a) / nb5a;
				if(result == nb6a){
					
					MainExec.getResult_displayLabel().setText("" + result);
					/*Give 5 points*/
					Scores.setScore5();
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(result >= nb6a + 2 || result <= nb6a - 2){
					MainExec.getResult_displayLabel().setText("TRY");
				}else{
					
					/*Give 1 points*/
					Scores.setScore1();
					resultat = String.valueOf(result);
					MainExec.getResult_displayLabel().setText(resultat);
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
			
		}else if(nb2.compareTo("-") == 0 && nb4.compareTo("-") == 0 ){
			
			result = (nb1 - nb3a) - nb5a;
			if(result == nb6a){
				
				MainExec.getResult_displayLabel().setText("" + result);
				/*Give 5 points*/
				Scores.setScore5();
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(result >= nb6a + 2 || result <= nb6a - 2){
				MainExec.getResult_displayLabel().setText("TRY");
			}else{
				/*Give 1 points*/
				Scores.setScore1();
				resultat = String.valueOf(result);
				MainExec.getResult_displayLabel().setText(resultat);
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else if(nb2.compareTo("-") == 0 && nb4.compareTo("+") == 0 ){
			
			result = (nb1 - nb3a) + nb5a;
			if(result == nb6a){
				
				MainExec.getResult_displayLabel().setText("" + result);
				/*Give 5 points*/
				Scores.setScore5();
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(result >= nb6a + 2 || result <= nb6a - 2){
				MainExec.getResult_displayLabel().setText("TRY");
			}else{
				
				/*Give 1 points*/
				Scores.setScore1();
				resultat = String.valueOf(result);
				MainExec.getResult_displayLabel().setText(resultat);
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else if(nb2.compareTo("-") == 0 && nb4.compareTo("x") == 0 ){
			
			result = (nb1 - nb3a) * nb5a;
			if(result == nb6a){
				
				MainExec.getResult_displayLabel().setText("" + result);
				/*Give 5 points*/
				Scores.setScore5();
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(result >= nb6a + 2 || result <= nb6a - 2){
				MainExec.getResult_displayLabel().setText("TRY");
			}else{
				/*Give 1 points*/
				Scores.setScore1();
				resultat = String.valueOf(result);
				MainExec.getResult_displayLabel().setText(resultat);
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else if(nb2.compareTo("-") == 0 && nb4.compareTo("/") == 0 ){
			
			if(nb5a != 0){
				result = (nb1 - nb3a) / nb5a;
				if(result == nb6a){
					
					MainExec.getResult_displayLabel().setText("" + result);
					/*Give 5 points*/
					Scores.setScore5();
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(result >= nb6a + 2 || result <= nb6a - 2){
					MainExec.getResult_displayLabel().setText("TRY");
				}else{
					/*Give 1 points*/
					Scores.setScore1();
					resultat = String.valueOf(result);
					MainExec.getResult_displayLabel().setText(resultat);
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
			
		}else if(nb2.compareTo("x") == 0 && nb4.compareTo("x") == 0 ){
			
			result = (nb1 * nb3a) * nb5a;
			if(result == nb6a){
				
				MainExec.getResult_displayLabel().setText("" + result);
				/*Give 5 points*/
				Scores.setScore5();
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(result >= nb6a + 2 || result <= nb6a - 2){
				MainExec.getResult_displayLabel().setText("TRY");
			}else{
				
				/*Give 1 points*/
				Scores.setScore1();
				resultat = String.valueOf(result);
				MainExec.getResult_displayLabel().setText(resultat);
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else if(nb2.compareTo("x") == 0 && nb4.compareTo("-") == 0 ){
			
			result = (nb1 * nb3a) - nb5a;
			if(result == nb6a){
				
				MainExec.getResult_displayLabel().setText("" + result);
				/*Give 5 points*/
				Scores.setScore5();
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(result >= nb6a + 2 || result <= nb6a - 2){
				MainExec.getResult_displayLabel().setText("TRY");
			}else{
				
				/*Give 1 points*/
				Scores.setScore1();
				resultat = String.valueOf(result);
				MainExec.getResult_displayLabel().setText(resultat);
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else if(nb2.compareTo("x") == 0 && nb4.compareTo("+") == 0 ){
			
			result = (nb1 * nb3a) + nb5a;
			if(result == nb6a){
				
				MainExec.getResult_displayLabel().setText("" + result);
				/*Give 5 points*/
				Scores.setScore5();
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}else if(result >= nb6a + 2 || result <= nb6a - 2){
				MainExec.getResult_displayLabel().setText("TRY");
			}else{
				
				/*Give 1 points*/
				Scores.setScore1();
				resultat = String.valueOf(result);
				MainExec.getResult_displayLabel().setText(resultat);
				try {
					MainExec.getParty().next();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}else if(nb2.compareTo("x") == 0 && nb4.compareTo("/") == 0 ){
			
			if(nb5a != 0){
				result = (nb1 * nb3a) / nb5a;
				if(result == nb6a){
					
					MainExec.getResult_displayLabel().setText("" + result);
					/*Give 5 points*/
					Scores.setScore5();
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(result >= nb6a + 2 || result <= nb6a - 2){
					MainExec.getResult_displayLabel().setText("TRY");
				}else{
					
					/*Give 1 points*/
					Scores.setScore1();
					resultat = String.valueOf(result);
					MainExec.getResult_displayLabel().setText(resultat);
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

		}else if(nb2.compareTo("/") == 0 && nb4.compareTo("/") == 0 ){
			
			if(nb3a != 0 && nb5a != 0){
				result = (nb1 / nb3a) / nb5a;
				if(result == nb6a){
					
					MainExec.getResult_displayLabel().setText("" + result);
					/*Give 5 points*/
					Scores.setScore5();
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(result >= nb6a + 2 || result <= nb6a - 2){
					MainExec.getResult_displayLabel().setText("TRY");
				}else{
					
					/*Give 1 points*/
					Scores.setScore1();
					resultat = String.valueOf(result);
					MainExec.getResult_displayLabel().setText(resultat);
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

		}else if(nb2.compareTo("/") == 0 && nb4.compareTo("-") == 0 ){
			
			if(nb3a != 0){
				result = (nb1 / nb3a) - nb5a;
				if(result == nb6a){
					
					MainExec.getResult_displayLabel().setText("" + result);
					/*Give 5 points*/
					Scores.setScore5();
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(result >= nb6a + 2 || result <= nb6a - 2){
					MainExec.getResult_displayLabel().setText("TRY");
				}else{
					
					/*Give 1 pointst*/
					Scores.setScore1();
					resultat = String.valueOf(result);
					MainExec.getResult_displayLabel().setText(resultat);
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

		}else if(nb2.compareTo("/") == 0 && nb4.compareTo("+") == 0 ){
			
			if(nb3a != 0){
				result = (nb1 / nb3a) + nb5a;
				if(result == nb6a){
					
					MainExec.getResult_displayLabel().setText("" + result);
					/*Give 5 points*/
					Scores.setScore5();
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(result >= nb6a + 2 || result <= nb6a - 2){
					MainExec.getResult_displayLabel().setText("TRY");
				}else{
					/*Give 1 points*/
					Scores.setScore1();
					resultat = String.valueOf(result);
					MainExec.getResult_displayLabel().setText(resultat);
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
			
		}else if(nb2.compareTo("/") == 0 && nb4.compareTo("x") == 0 ){
			
			if(nb3a != 0){
				result = (nb1 / nb3a) * nb5a;
				if(result == nb6a){
					
					MainExec.getResult_displayLabel().setText("" + result);
					/*Give 5 points*/
					Scores.setScore5();
					try {
						MainExec.getParty().next();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(result >= nb6a + 2 || result <= nb6a - 2){
					MainExec.getResult_displayLabel().setText("TRY");
				}else{
					
					/*Give 1 points*/
					Scores.setScore1();
					resultat = String.valueOf(result);
					MainExec.getResult_displayLabel().setText(resultat);
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
