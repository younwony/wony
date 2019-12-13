/**
 * @작성자 wony
 * @작성일 2019. 11. 12.
 * @사용처
 *
 */
package Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @작성자 wony
 * @작성일 2019. 11. 12.
 * @사용처 보물
 * 
 */
public class a1026 {

	/**
	 * @작성자 wony
	 * @작성일 2019. 11. 12.
	 * @사용처
	 * @Todo
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		int testCount = scanner.nextInt();
		
		Integer[] arrayA = new Integer[testCount];
		Integer[] arrayB = new Integer[testCount];
		
		for(int i = 0; i < testCount; i++)
			arrayA[i] = scanner.nextInt();
		
		for(int i = 0; i < testCount; i++)
			arrayB[i] = scanner.nextInt();
		
		Arrays.sort(arrayB);
		Arrays.sort(arrayA, Collections.reverseOrder());
		
		int minSum = 0;
		
		for(int i = 0; i < testCount; i++)
			minSum += arrayB[i]*arrayA[i];
		
		System.out.println(minSum);
	}

}