package application;


public class Generator {

	private int nb1, nb2, nb3, nb4, nb5, nb6;
	private static String stnb1, stnb2, stnb3,stnb4, stnb5, stnb6;
	private int nbMaxbtn;
	private int nbMinbtn;
	private String[] keyNumbers;
	private int nbc;
	private static String stnbc;
	private final int nbMaxOp;
	private final int nbMinOp;
	private int numOp;
	
	public Generator(){
		
		nbMaxbtn = 9;
		nbMinbtn = 1;
		
		nbMaxOp = 16;
		nbMinOp = 1;
		
		keyNumbers = new String[6];
		
		numbers();
		
	}
	
	/**
	 * <p>Generate randomly numbers that will be calculated 
	 * but also numbers that will be displayed on the keyboard.</p>
	 * 
	 *<p> Makes sure that there is at least one solution of with numbers given 
	 * on the keyboard.</p>
	 * 
	 */
	private void numbers(){

		/* Random numbers that will be displayed on the keyboard */
		/* Make sure each number is different from an other */
		nb1 =  nbMinbtn + (int)(Math.random() * ((nbMaxbtn - nbMinbtn) + 1));
		
		do{
			nb2 =  nbMinbtn + (int)(Math.random() * ((nbMaxbtn - nbMinbtn) + 1));
		}while(nb1 == nb2);
		
		do{
			nb3 =  nbMinbtn + (int)(Math.random() * ((nbMaxbtn - nbMinbtn) + 1));
		}while(nb1 == nb3 || nb2 == nb3);
		
		do{
			nb4 =  nbMinbtn + (int)(Math.random() * ((nbMaxbtn - nbMinbtn) + 1));
		}while(nb1 == nb4 || nb2 == nb4 || nb3 == nb4 );
		
		do{
			nb5 =  nbMinbtn + (int)(Math.random() * ((nbMaxbtn - nbMinbtn) + 1));
		}while(nb1 == nb5 || nb2 == nb5 || nb3 == nb5 || nb4 == nb5);
		
		do{
			nb6 =  nbMinbtn + (int)(Math.random() * ((nbMaxbtn - nbMinbtn) + 1));
		}while(nb1 == nb6 || nb2 == nb6 || nb3 == nb6 || nb4 == nb6 || nb5 == nb6);
		
		
		/* Converting integers into strings */
		stnb1 = Integer.toString(nb1);
		stnb2 = Integer.toString(nb2);
		stnb3 = Integer.toString(nb3);
		stnb4 = Integer.toString(nb4);
		stnb5 = Integer.toString(nb5);
		stnb6 = Integer.toString(nb6);
		
		/* Put strings in an array */
		keyNumbers[0] = stnb1;
		keyNumbers[1] = stnb2;
		keyNumbers[2] = stnb3;
		keyNumbers[3] = stnb4;
		keyNumbers[4] = stnb5;
		keyNumbers[5] = stnb6;
		
		/*Number to resolve*/
		numOp = nbMinOp + (int)(Math.random() * ((nbMaxOp - nbMinOp) + 1));
		
		/*Possible operations*/
		if(numOp == 1 ){
			nbc = (nb1 + nb4) + nb5;
		}else if(numOp == 2 ){
			if((nb4 + nb3) > nb5){
				nbc = (nb4 + nb3) - nb5;
			}else{
				nbc = (nb5 + nb4) - nb3;
			}
		}else if(numOp == 3){
			nbc = (nb3 + nb2) * nb2;
		}else if(numOp == 4 ){
			if((nb6 + nb3) > nb1 && nb1 !=0){
				nbc = (nb6 + nb3) / nb1;
			}else if(nb3 !=0){
				nbc = nb1 + (nb6 / nb3);
			}else{
				nbc = nb1 + (nb3 / nb6);
			}
		}else if(numOp == 5){
			if((nb2 - nb3) > nb5){
				nbc = (nb2 - nb3) - nb5;
			}else{
				nbc = (nb5 - nb2) - nb3;
			}
			
		}else if(numOp == 6){

			if(nb1  > nb3){
				nbc = (nb1 - nb3) + nb5;
			}else{
				nbc = (nb3 - nb1) + nb5;
			}
			
		}else if(numOp == 7){
			nbc = (nb2 - nb3) * nb5;
		}else if(numOp == 8){
			
			if(nb6 != 0 && (nb4- nb1) > nb6){
				nbc = (nb4 - nb1) / nb6;
			}else{
				numOp = 9;
			}
			
		}else if(numOp == 9){
			
			nbc = (nb4 * nb5) * nb5;
	
		}else if(numOp == 10){

			if((nb5 * nb6) > nb4){
				nbc = (nb5 * nb6) - nb5;
			}else{
				nbc = (nb5 * nb4) - nb6;
			}
			
		}else if(numOp == 11 ){
			
			nbc = (nb1 * nb3) + nb6;

		}else if(numOp == 12){
			if(nb2 != 0 && (nb3 * nb3) > nb2){
				nbc = (nb3 * nb3) / nb2;
			}else if(nb3 != 0) {
				nbc = (nb3 * nb2) / nb3;
			}else{
				nbc = (nb1 * nb3) + nb6;
			}
			
		}else if(numOp == 13){

			if(nb3 != 0 && nb6 != 0 ){
				nbc = (nb2 / nb3) / nb6;
			}else{
				nbc = (nb4 * nb5) * nb5;
			}
			
		}else if(numOp == 14){

			if(nb3 > nb2 && nb2 !=0){
				if((nb3 / nb2) > nb5 && nb5 != 0){
					nbc = (nb3 / nb2) - nb5;
				}
				
			}else if(nb3 != 0){
				nbc = (nb5 / nb3) - nb2;
			}else{
				nbc = (nb1 * nb3) + nb6;
			}
			
		}else if(numOp == 15){
			if(nb4 != 0){
				nbc = (nb6 / nb4) + nb1;
			}else{
				nbc = (nb1 * nb3) + nb6;
			}

		}else if(numOp == 16){
			if(nb3 != 0){
				nbc = (nb4 / nb3) * nb5;
			}else{
				nbc = (nb5 - nb2) - nb3;
			}

		}
		stnbc = Integer.toString(nbc);

	}
	
	/**
	 * The number to be found by the player
	 * 
	 * @return String
	 */
	public String getMainNumber(){
		return stnbc;
	}
	
	
	/**
	 *  Numbers to be displayed on the keyboard 
	 *  
	 * @return Array of Strings
	 */
	public String[] getKeyNumbers(){
		return keyNumbers;
	}
}
