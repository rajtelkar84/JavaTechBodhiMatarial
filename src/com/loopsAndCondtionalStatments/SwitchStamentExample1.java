package com.loopsAndCondtionalStatments;

import java.util.Scanner;

public class SwitchStamentExample1 {
	
	public static void main(String[] args) 
    { 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a no");
		int day = sc.nextInt();
     //   int day = 1; 
        String dayString; 
  
        // switch statement with int data type 
        switch (day) { 
        case 1: 
            dayString = "Monday"; 
            break;
        case 2: 
            dayString = "Tuesday"; 
          break;
        case 3: 
            dayString = "Wednesday"; 
            break; 
        case 4: 
            dayString = "Thursday"; 
            break; 
        case 5: 
            dayString = "Friday"; 
            break; 
        case 6: 
            dayString = "Saturday"; 
            break; 
        case 7: 
            dayString = "Sunday"; 
            break; 
        default: 
            dayString = "Invalid day"; 
            break; 
        } 
        System.out.println(dayString); 
    } 

}
