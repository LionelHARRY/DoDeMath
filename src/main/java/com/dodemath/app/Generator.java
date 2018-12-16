package com.dodemath.app;


public class Generator implements Igenerator{

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
		/* Make sure each number is different from each other */
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
		/*Make sure the number to resolve is never equal to any of*/
		/*the numbers in the keyboard*/
		do {
			
			/*Number of the operation*/
			numOp = nbMinOp + (int)(Math.random() * ((nbMaxOp - nbMinOp) + 1));
			
			/*Possible operations*/
			if(equalIntegers(numOp , 1 )){
				nbc = sum(sum(nb1 , nb4) , nb5);
			}else if(equalIntegers(numOp , 2 )){
				if(sum(nb4 , nb3) > nb5){
					nbc = substraction(sum(nb4 , nb3) , nb5);
				}else{
					nbc = substraction(sum(nb5 , nb4) , nb3);
				}
			}else if(equalIntegers(numOp , 3)){
				nbc = multiplication(sum(nb3 , nb2) , nb2);
			}else if(equalIntegers(numOp , 4) ){
				if(sum(nb6 , nb3) > nb1 && notEqualIntegers(nb1 , 0)){
					try {
						nbc = division(sum(nb6 , nb3) , nb1);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(notEqualIntegers(nb3 , 0)){
					try {
						nbc = sum(nb1 , division(nb6 , nb3));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					try {
						nbc = sum(nb1 , division(nb3 , nb6));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}else if(equalIntegers(numOp , 5)){
				if(substraction(nb2 , nb3) > nb5){
					nbc = substraction(substraction(nb2 , nb3) , nb5);
				}else{
					nbc = substraction(substraction(nb5 , nb2) , nb3);
				}
				
			}else if(equalIntegers(numOp , 6)){

				if(nb1  > nb3){
					nbc = sum(substraction(nb1 , nb3) , nb5);
				}else{
					nbc = sum(substraction(nb3 , nb1) , nb5);
				}
				
			}else if(equalIntegers(numOp , 7)){
				nbc = multiplication(substraction(nb2 , nb3) , nb5);
			}else if(equalIntegers(numOp , 8)){
				
				if(notEqualIntegers(nb6 , 0) && substraction(nb4 , nb1) > nb6){
					try {
						nbc = division(substraction(nb4 , nb1) , nb6);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					numOp = 9;
				}
				
			}else if(equalIntegers(numOp , 9)){
				
				nbc = multiplication(multiplication(nb4 , nb5) , nb5);
		
			}else if(equalIntegers(numOp , 10)){

				if(multiplication(nb5 , nb6) > nb4){
					nbc = substraction(multiplication(nb5 , nb6) , nb5);
				}else{
					nbc = substraction(multiplication(nb5 , nb4) , nb6);
				}
				
			}else if(equalIntegers(numOp , 11)){
				
				nbc = sum(multiplication(nb1 , nb3) , nb6);

			}else if(equalIntegers(numOp , 12)){
				if(notEqualIntegers(nb2 , 0) && multiplication(nb3 , nb3) > nb2){
					try {
						nbc = division(multiplication(nb3 , nb3) , nb2);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else if(notEqualIntegers(nb3 , 0)) {
					try {
						nbc = division(multiplication(nb3 , nb2) , nb3);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					nbc = sum(multiplication(nb1 , nb3) , nb6);
				}
				
			}else if(equalIntegers(numOp , 13)){

				if(notEqualIntegers(nb3 , 0) && notEqualIntegers(nb6 , 0) ){
					try {
						nbc = division(division(nb2 , nb3) , nb6);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					nbc = multiplication(multiplication(nb4 , nb5) , nb5);
				}
				
			}else if(equalIntegers(numOp , 14)){

				if(nb3 > nb2 && notEqualIntegers(nb2 , 0)){
					try {
						if(division(nb3 , nb2) > nb5 && notEqualIntegers(nb5 , 0)){
							try {
								nbc = substraction(division(nb3 , nb2) , nb5);
							} catch (Exception e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}else if(notEqualIntegers(nb3 , 0)){
					try {
						nbc = substraction(division(nb5 , nb3) , nb2);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					nbc = sum(multiplication(nb1 , nb3) , nb6);
				}
				
			}else if(equalIntegers(numOp , 15)){
				if(notEqualIntegers(nb4 , 0)){
					try {
						nbc = sum(division(nb6 , nb4) , nb1);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					nbc = sum(multiplication(nb1 , nb3) , nb6);
				}

			}else if(equalIntegers(numOp , 16)){
				if(notEqualIntegers(nb3 , 0)){
					try {
						nbc = multiplication(division(nb4 , nb3) , nb5);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}else{
					nbc = substraction(substraction(nb5 , nb2) , nb3);
				}

			}
			
		}while(equalIntegers(nbc , nb1) || equalIntegers(nbc , nb2) || equalIntegers(nbc , nb3) || equalIntegers(nbc , nb4) || equalIntegers(nbc , nb5) || equalIntegers(nbc , nb6) );
		
		
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


	/**
	 * Sum of two integers
	 * @return int
	 */
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}


	/**
	 * Multiplication of two integers
	 * @return int
	 */
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}


	/**
	 * Substration of two integers
	 * @return int
	 */
	public int substraction(int a, int b) {
		// TODO Auto-generated method stub
		return a - b;
	}


	/**
	 * Division of two integers
	 * @return int
	 */
	public int division(int a, int b) throws Exception{
		// TODO Auto-generated method stub
		if(b == 0) {
			throw new Exception();
		}
		return a / b;
	}
	

	/**
	 * Checking if two integers are equal.
	 * returns 'true' if they are
	 * @return boolean
	 */
	public boolean equalIntegers(int a, int b) {
		// TODO Auto-generated method stub
		boolean result = false;
		if(a == b) {
			result = true;
		}
		return result;
	}


	/**
	 * Checking if two integers are not equal.
	 * returns 'true' if they are not equal.
	 * @return boolean
	 */
	public boolean notEqualIntegers(int a, int b) {
		// TODO Auto-generated method stub
		boolean result = false;
		if(a != b) {
			result = true;
		}
		return result;
	}
}
