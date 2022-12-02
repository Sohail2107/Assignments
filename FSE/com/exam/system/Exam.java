package com.exam.system;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {

       Question[] qs= new Question[10];
       qs[0]=new Question("1", "What is capital of india?", "delhi", "mumbai", "kolkata", "chennai", 1);
       qs[1]=new Question("2", "What comes after A?", "C", "B", "A", "D", 2);
       qs[2]=new Question("3", "What comes after B?", "C", "B", "A", "D", 1);
       qs[3]=new Question("4", "What comes after C?", "C", "B", "A", "D", 4);
       qs[4]=new Question("5", "What comes after E?", "F", "B", "A", "D", 1);
       qs[5]=new Question("6", "What comes after F?", "C", "G", "A", "D", 2);
       qs[6]=new Question("7", "What comes after G?", "C", "B", "A", "H", 4);
       qs[7]=new Question("7", "What comes after P?", "C", "B", "Q", "D", 3);
       qs[8]=new Question("8", "What comes after R?", "C", "B", "A", "S", 4);
       qs[9]=new Question("9", "What comes after X?", "Y", "B", "A", "D", 1);
       
       System.out.println("Welcome to Exam.Are you Ready?");
       Scanner input = new Scanner(System.in);
       System.out.println("yes or no");
       String value=input.next();
       
       if(value.equalsIgnoreCase("yes")) {
    	   
    	   for(int i=0;i<qs.length;i++) {
    		   
    	   System.out.println(qs[i]);
    	   System.out.println("choose the right answer:");
    	   int ans=input.nextInt();
    	   if(ans==qs[i].getRightOption()) {
    		   System.out.println("Right Answer");
    		  }else {
    			  System.out.println("Your answer is not correct. Do you want to try again? (Type:y-yes,n-no)");
    			  String reply=input.next();
    			  if(reply.equalsIgnoreCase("y")) {
    				  System.out.println(qs[i]);
    		    	   System.out.println("choose the right answer:");
    		    	   int ans1=input.nextInt();
    		    	   if(ans1!=qs[i].getRightOption()) {
    		    		   System.out.println("Wrong answer again-Next question");
    		    	   }
    			  }else {
    				  System.out.println("next question");
    			  }
    		  }
       }
	}
	}
}
