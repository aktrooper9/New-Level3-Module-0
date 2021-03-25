/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

// Fill in the code to return the [col, row] coordinate position of the
// head (letter 'c') of the wrong way cow!
//int[]ints = new int [2];
//int direction;
//  	for(int row = 0; row<field.length; row++) {
//		for(int col =0; col < field[row].length;col++) {
//		chara+=1;
//	if(col==3) {
//	chara=0;
//if(field[row][col]=='c') {
//if(field[row-1][col]=='c')
//ints[0]=col;
//ints[1]=row;
//  				return ints;
//		}

//			}
//	}
//	}
//  return null;

package _07_The_Wrong_Way_Cow;

import _06_Conways_Game_of_Life.Cell;

public class TheWrongWayCow {
	static int chara = 0;
	static int rightwaycow;
	static int waycowisfacingdown = 0;
	static int waycowisfacingup = 0;
	static int waycowisfacingleft = 0;
	static int waycowisfacingright = 0;

	public static int[] findWrongWayCow(final char[][] field) {
		int[] ints = new int[2];
		int direction;
		System.out.println(field.length);
		System.out.println(field[0].length);
		for (int row = 0; row < field.length; row++) {
			for (int col = 0; col < field[row].length; col++) {
System.out.print(field[row][col]);
			if (field[row][col] == 'c') {
				System.out.println(row+" "+col);
					if (row >= 2) {
						if (field[row - 1][col] == 'o') { // looking up
							if (field[row - 2][col] == 'w') {
								waycowisfacingup += 1;
							}
						}
					}
					if (col >= 2) {  
						if (field[row][col - 1] == 'o') { // looking left
							if (field[row][col - 2] == 'w') {
								waycowisfacingleft += 1;

							}
						}
					}
					
			if (col <= field[0].length - 2) {

						if (field[row][col + 1] == 'o') { // looking right
							if (field[row][col + 2] == 'w') {
							waycowisfacingright += 1;
						}
						}
					}

					if (row <= field[0].length - 2) { // looking down
						if (field[row + 1][col] == 'o') {
							if (field[row + 2][col] == 'w') {
								waycowisfacingdown += 1;
							}
						}

					}

				}

			}

		}
		System.out.println("up " + waycowisfacingup + "left " + waycowisfacingleft + "down " + waycowisfacingdown
				+ "right " + waycowisfacingright);
		if(waycowisfacingup==1) {
			
		}
		else if(waycowisfacingleft==1) {
			
		}
		else if(waycowisfacingdown==1) {
			
		}
		else {
			
		}
		
		
//		if(waycowisfacingup>waycowisfacingdown&&waycowisfacingup>waycowisfacingleft&&waycowisfacingup>waycowisfacingright) {
//			
//		}
//		else if (waycowisfacingleft>waycowisfacingdown&&waycowisfacingleft>waycowisfacingup&&waycowisfacingleft>waycowisfacingright) {
//			
//		}
//		else if(waycowisfacingright>waycowisfacingdown&&waycowisfacingright>waycowisfacingup&&waycowisfacingright>waycowisfacingleft) {
//			
//		}
//		else {
//			
//		}
		return ints;
	}
}
