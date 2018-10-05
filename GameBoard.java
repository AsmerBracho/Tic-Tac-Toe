/*
* Public Class GameBoard
*
* Author: Asmer Bracho 
* Student Number: 2016328 
* Date: 23/11/2016
*
* All rights Reserved 
*/

public class GameBoard {
	// Variables
	int row; 
	int col;
	//-------------------------------------------------------------------------
	
	// Constructor
	public GameBoard() { // constructor give space to all my Arrays 
		
	} // End of constructor 

	// Methos
	//-------------------------------------------------------------------------
	
	//-------------------------------------------------------------------------
	public void printBetterGame(int a[][]) { 
		System.out.println();
		for (row = 0; row < a.length ; row++) { // Start of rowa
		 	for (col = 0; col < a.length ; col++) { // Start of colmns
		 		
		 		if (col == 1) { // This is to print the lines on the middle
					switch (a[row][col]) { // switch # 1
						case -1: 
							System.out.print("|    |");
							break;
						case 1: 
							System.out.print("|  X |");
							break; 
						case 0: 
							System.out.print("|  O |");
							break; 
					} // End of switch # 1

		 		} else { 

			 		switch (a[row][col]) { // switch # 2 
						case -1: 
							System.out.print("     ");
							break; 
						case 1: 
							System.out.print("  X  ");
							break; 
						case 0: 
							System.out.print("  O  ");
							break;	
					} // End of swith # 2 
				}
		 	} // End of Colmns
		 	System.out.println();
		 	if (row < 2) { // Start of If line
		 		System.out.println("----------------");	
		 	} // End of if line

		 } // End os rows 

	} // End of printGame

	public void printGameOver() {
		System.out.println("\n\n||''' ||''|| ||\\//|| ||'''   ||'''|| \\    // ||''' ||'''.");
		System.out.println("||    ||''|| ||   || ||=     ||   ||  \\  //  ||=   ||...:");
	  System.out.println("||..| ||  || ||   || ||...   ||...||   \\//   ||... ||  \\ .");
	}

}// End of PrintGame