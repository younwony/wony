package Java;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

/**
 * @작성자 wony
 * @작성일 2019. 10. 24.
 * @사용처
 * @Todo
 */

public class Main {

	/**
	 * @작성자 wony
	 * @작성일 2019. 10. 24.
	 * @사용처
	 * @param args 
	 * @Todo
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String inputData = scanner.nextLine();
		scanner.close();
		int[] outputData = new int[26];
		
		for(int i = 0; i < outputData.length; i++)
			outputData[i] = -1;
		
		for(int i = 0; i < inputData.length(); i++){
			if(outputData[(int)inputData.charAt(i)%97] == -1)
				outputData[(int)inputData.charAt(i)%97] = i;
		}
		
		for(int i = 0; i < outputData.length; i++)
			System.out.print(outputData[i] + " ");
	}
}
