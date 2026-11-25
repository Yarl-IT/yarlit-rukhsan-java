import java.util.Scanner;
public class SimpleCalculator{
		public static void main(String args[]){
			Scanner input=new  Scanner(System.in);
			
			System.out.print("Enter First Number:");
			double num1=input.nextDouble();
			
			System.out.print("Enter Second Number:");
			double num2=input.nextDouble();
			
			System.out.println("Choose Operation:");
			System.out.println("1.Addition(+)");
			System.out.println("2.Subtraction(-)");	
			System.out.println("3.Muliplication(*)");
			System.out.println("4.Division(/)");
			
			System.out.println("Enter your choice:");
			int choice =input.nextInt();
			
			switch(choice){
				case 1:
					System.out.println("Result="+(num1+num2));
					break;
				case 2:
					System.out.println("Result="+(num1-num2));
					break;
				case 3:
					System.out.println("Result="+(num1*num2));
					break;
				case 4:
				if(num2!=0){
					System.out.println("Result="+(num1/num2));
				}else{
					System.out.println("Error:Cannot divide by zero");
				}
				break;
				
				default:
					System.out.println("Invalid Choice!");
			}
			input.close();
			
			
		}	
}