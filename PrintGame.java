/*
* Main Method
* Public Class PrintGame 
*
* Author: Asmer Bracho 
* Student Number: 2016328 
* Date: 23/11/2016
*
* All rights Reserved 
*/

import java.util.Scanner;

public class PrintGame {
	public static void main(String[] args) {
		String line = "----------------------------------------------------------------------------------------";
		GameBoard theOldLady = new GameBoard();
		Scanner sc1 = new Scanner(System.in);
	
		//-----------------------EMPTY BOARD-----------------------
		// My Arrays
		int[][] emptyGame = {{-1,-1,-1}, {-1,-1,-1}, {-1,-1,-1}}; // Empty Board
		//--------------------------------------------------------------
		System.out.println("\n" + line);
		System.out.println("\n\t    '''||''' || ||''' __ '''||''' ||'''|| ||''' __ '''||''' ||'''|| ||'''\n\t       ||    || ||...       ||    ||'''|| ||...       ||    ||...|| ||... " + "\n\n  \t\t\t\t     INSTRUCTIONS \n");
		
		//-------------------INSTRUCTIONS-----------------------------
		System.out.println("On the Right Hand Side you can see the positions" + "\t\t __1__|__2__|__3__");
		System.out.println("1. Choose the Spot you would like to Play in your go" + "\t\t __4__|__5__|__6__");
		System.out.println("DO NOT Try to play in a spot already filled. if you do so" + "\t   7  |  8  |  9  ");
		System.out.println("you can MISS YOUR TURN");
		System.out.print("\n\n\t\t\t -- Press (Any Number) + Enter to START the Game --");
		int start = sc1.nextInt();
		System.out.println("\n" + line);

		theOldLady.printBetterGame(emptyGame); 

		int ipos;
		int jpl;

		int track = 0; 

		int[] position = new int[9];
		int[] player = new int[9];
		for (ipos = 0; ipos < 9; ipos++) { // start of position 
			track++;
			if (track%2 == 1) {
				System.out.print("\n\nX is playing Now");
			} else {
				System.out.print("\n\n0 is playing Now");
			}
			System.out.print("\nWhat Spot would you like to play in?: ");
			position[ipos] = sc1.nextInt();

			// Defining parameter to avoid rewriting position
			// First Warning
			if (position[ipos] == 1) { 
				if (emptyGame[0][0] != -1) {
					System.out.print("\nNOT ALLOWED.\nWARNING. If you try to do this again you will MISS YOUR TURN\nPlease Select another Spot: ");
					position[ipos] = sc1.nextInt();
				}
			} else if (position[ipos] == 2) {
				if (emptyGame[0][1] != -1) {
					System.out.print("\nNOT ALLOWED.\nWARNING. If you try to do this again you will MISS YOUR TURN\nPlease Select another Spot: ");
					position[ipos] = sc1.nextInt();
				}
			} else if (position[ipos] == 3) {
				if (emptyGame[0][2] != -1) {
					System.out.print("\nNOT ALLOWED.\nWARNING. If you try to do this again you will MISS YOUR TURN\nPlease Select another Spot: ");
					position[ipos] = sc1.nextInt();
				}
			} else if (position[ipos] == 4) {
				if (emptyGame[1][0] != -1) {
					System.out.print("\nNOT ALLOWED.\nWARNING. If you try to do this again you will MISS YOUR TURN\nPlease Select another Spot: ");
					position[ipos] = sc1.nextInt();
				}
			} else if (position[ipos] == 5) {
				if (emptyGame[1][1] != -1) {
					System.out.print("\nNOT ALLOWED.\nWARNING. If you try to do this again you will MISS YOUR TURN\nPlease Select another Spot: ");
					position[ipos] = sc1.nextInt();
				}
			} else if (position[ipos] == 6) {
				if (emptyGame[1][2] != -1) {
					System.out.print("\nNOT ALLOWED.\nWARNING. If you try to do this again you will MISS YOUR TURN\nPlease Select another Spot: ");
					position[ipos] = sc1.nextInt();
				}
			} else if (position[ipos] == 7) {
				if (emptyGame[2][0] != -1) {
					System.out.print("\nNOT ALLOWED.\nWARNING. If you try to do this again you will MISS YOUR TURN\nPlease Select another Spot: ");
					position[ipos] = sc1.nextInt();
				}
			} else if (position[ipos] == 8) {
				if (emptyGame[2][1] != -1) {
					System.out.print("\nNOT ALLOWED.\nWARNING. If you try to do this again you will MISS YOUR TURN\nPlease Select another Spot: ");
					position[ipos] = sc1.nextInt();
				}
			} else if (position[ipos] == 9) {
				if (emptyGame[2][2] != -1) {
					System.out.print("\nNOT ALLOWED.\nWARNING. If you try to do this again you will MISS YOUR TURN\nPlease Select another Spot: ");
					position[ipos] = sc1.nextInt();
				}
			} 
			// end of Defining Parameter to avoid Rewriting 

			for (jpl = 0; jpl < 1 ; jpl++) { // Start of player		
				if (position[ipos] == 1) {
					if (emptyGame[0][0] != -1) {
						System.out.print("\nNOT ALLOWED. YOU HAVE MISSED YOUR TURN \n");
					}
					switch (track%2) { // Start Switch 1
						case 1:
							emptyGame[0][0] = 1;
							break;
						case 0:
							emptyGame[0][0] = 0;
							break;
					} // End of Switch 1 
				} else if (position[ipos] == 2) {
					if (emptyGame[0][1] != -1) {
						System.out.print("\nNOT ALLOWED. YOU HAVE MISSED YOUR TURN \n");
					}
					switch (track%2) { // Start Switch 2
						case 1:
							emptyGame[0][1] = 1;
							break;
						case 0:
							emptyGame[0][1] = 0;
							break;
					} // End of Switch 2
				} else if (position[ipos] == 3) {
					if (emptyGame[0][2] != -1) {
						System.out.print("\nNOT ALLOWED. YOU HAVE MISSED YOUR TURN \n");
					}
					switch (track%2) { // Start Switch 3
						case 1:
							emptyGame[0][2] = 1;
							break;
						case 0:
							emptyGame[0][2] = 0;
							break;
					} // End of Switch 3
				} else if (position[ipos] == 4) {
					if (emptyGame[1][0] != -1) {
						System.out.print("\nNOT ALLOWED. YOU HAVE MISSED YOUR TURN \n");
					}
					switch (track%2) { // Start Switch 4
						case 1:
							emptyGame[1][0] = 1;
							break;
						case 0:
							emptyGame[1][0] = 0;
							break;
					} // End of Switch 4
				} else if (position[ipos] == 5) {
					if (emptyGame[1][1] != -1) {
						System.out.print("\nNOT ALLOWED. YOU HAVE MISSED YOUR TURN \n");
					}
					switch (track%2) { // Start Switch 5
						case 1:
							emptyGame[1][1] = 1;
							break;
						case 0:
							emptyGame[1][1] = 0;
							break;
					} // End of Switch 5
				} else if (position[ipos] == 6) {
					if (emptyGame[1][2] != -1) {
						System.out.print("\nNOT ALLOWED. YOU HAVE MISSED YOUR TURN \n");
					}
					switch (track%2) { // Start Switch 6
						case 1:
							emptyGame[1][2] = 1;
							break;
						case 0:
							emptyGame[1][2] = 0;
							break;
					} // End of Switch 6
				} else if (position[ipos] == 7) {
					if (emptyGame[2][0] != -1) {
						System.out.print("\nNOT ALLOWED. YOU HAVE MISSED YOUR TURN \n");
					}
					switch (track%2) { // Start Switch 7
						case 1:
							emptyGame[2][0] = 1;
							break;
						case 0:
							emptyGame[2][0] = 0;
							break;
					} // End of Switch 7
				} else if (position[ipos] == 8) {
					if (emptyGame[2][1] != -1) {
						System.out.print("\nNOT ALLOWED. YOU HAVE MISSED YOUR TURN \n");
					}
					switch (track%2) { // Start Switch 8
						case 1:
							emptyGame[2][1] = 1;
							break;
						case 0:
							emptyGame[2][1] = 0;
							break;
					} // End of Switch 8
				} else if (position[ipos] == 9) {
					if (emptyGame[2][2] != -1) {
						System.out.print("\nNOT ALLOWED. YOU HAVE MISSED YOUR TURN \n");
					}
					switch (track%2) { // Start Switch 9
						case 1:
							emptyGame[2][2] = 1;
							break;
						case 0:
							emptyGame[2][2] = 0;
							break;
					} // End of Switch 9
				}
				theOldLady.printBetterGame(emptyGame);

				//----------------------------------GAME OVER--------------------------------------------
				if (emptyGame[0][0] == 1  && emptyGame[0][1] == 1 && emptyGame[0][2] == 1 || emptyGame[1][0] == 1  && emptyGame[1][1] == 1 && emptyGame[1][2] == 1 || emptyGame[2][0] == 1  && emptyGame[2][1] == 1 && emptyGame[2][2] == 1  
				 	|| emptyGame[0][0] == 1  && emptyGame[1][0] == 1 && emptyGame[2][0] == 1 || emptyGame[0][1] == 1  && emptyGame[1][1] == 1 && emptyGame[2][1] == 1 || emptyGame[0][2] == 1  && emptyGame[1][2] == 1 && emptyGame[2][2] == 1
					|| emptyGame[0][0] == 1  && emptyGame[1][1] == 1 && emptyGame[2][2] == 1 || emptyGame[0][2] == 1  && emptyGame[1][1] == 1 && emptyGame[2][0] == 1 ) {
					
					System.out.println("\nX HAVE WON");
					theOldLady.printGameOver();
					ipos = 10;
				} else if (emptyGame[0][0] == 0  && emptyGame[0][1] == 0 && emptyGame[0][2] == 0 || emptyGame[1][0] == 0  && emptyGame[1][1] == 0 && emptyGame[1][2] == 0 || emptyGame[2][0] == 0  && emptyGame[2][1] == 0 && emptyGame[2][2] == 0  
				 	|| emptyGame[0][0] == 0  && emptyGame[1][0] == 0 && emptyGame[2][0] == 0 || emptyGame[0][1] == 0  && emptyGame[1][1] == 0 && emptyGame[2][1] == 0 || emptyGame[0][2] == 0  && emptyGame[1][2] == 0 && emptyGame[2][2] == 0
					|| emptyGame[0][0] == 0  && emptyGame[1][1] == 0 && emptyGame[2][2] == 0 || emptyGame[0][2] == 0  && emptyGame[1][1] == 0 && emptyGame[2][0] == 0 ) {
					
					System.out.println("\nO HAVE WON");
					theOldLady.printGameOver();
					ipos = 10; 
				} else if (ipos==8) {
					theOldLady.printGameOver();
				}
			} // End of player
		} // End of position
	} // End Main Method		
} // End PrintGame