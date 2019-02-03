import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;
/*
 * Ritesh Thapa
 * CS 250
 * 
 * Finals part 1 
 * 
 */
public class finals_part1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		int[] data = new int [10]; 
		
		Scanner infile = new Scanner (new File("inp.dat")); // reading the value from "input.dat" file
		
		for (int i = 0; i<data.length; i++){
			data[0] = infile.nextInt();
			int x = data[0]%10;
			
			System.out.println(data[0]+": "+ x);
			
			for(int j=0; j<x; j++) 
				   System.out.print("*");
				System.out.println();
			}
			
		}
		
//		data[0] = infile.nextInt();
//		System.out.println(data[0]+":"+ data[0]%10);
		
//		int x = data[0]%10;
//		System.out.println(x);
		
//		int x;
//		for(int i=0; i<x; i++) 
//		   System.out.print("*");
//		System.out.println();
}