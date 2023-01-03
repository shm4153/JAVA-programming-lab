package practice;

import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle object = new rectangle(5,5);
		rectangle[] array = new rectangle[5];// prints 5 rectangles at once 
		for (int i = 0; i< array.length; i++) 
		{
			array[i] = new rectangle(2,2);
			System.out.println(array[i]);
		}
		System.out.println(object);

	}

	

}
