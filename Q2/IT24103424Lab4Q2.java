import java.util.Scanner;

public class IT24103424Lab4Q2{
	public static void main(String[] args){

		double examMarks,labMarks,examPercentage,labPercentage,finalMarks;
			
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter exam marks (out of 100): ");
		examMarks = input.nextDouble();
		
		if(examMarks>=0 && examMarks<=100){
			System.out.print("Please enter lab submission marks (out of 100): ");
			labMarks = input.nextDouble();
		
			if(labMarks>=0 && labMarks<=100){
				System.out.print("Please enter the percentage given for the exam: ");
				examPercentage = input.nextDouble();

				System.out.print("Please enter the percentage given for the lab submission: ");
				labPercentage = input.nextDouble();

				if(examPercentage+labPercentage==100){
					finalMarks = (examMarks*examPercentage+labMarks*labPercentage)/100;
					System.out.println("");
					System.out.println("Final exam marks is : "+finalMarks);
				}
				else{
					System.out.println("The percentage must add up to 100. Terminating program.");
				}
			}
			else{
				System.out.println("Invalid input for exam marks. Terminating program.");
			}
		}
		else{
			System.out.println("Invalid input for exam marks. Terminating program.");	
		}

	}
}