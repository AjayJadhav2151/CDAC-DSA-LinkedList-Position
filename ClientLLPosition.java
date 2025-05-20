package linkedListPosition;

import java.util.Scanner;

public class ClientLLPosition {

	public static void main(String[] args) {
		LinkedListPosition lp = new LinkedListPosition();
		Scanner sc = new Scanner(System.in);
		
		int option = 0,position=0,value;
		
		do {
			System.out.println(">>>>>>>>>>>>>>>>MENU<<<<<<<<<<<<<<<<<<<");
			System.out.println("\n 1.Add by Position"+
								"\n 2.delete by Position"+
								"\n 3.display"+
								"\n 0.exit");
			System.out.println("Enter your choice:: ");
			option=sc.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Enter the position: ");
				position = sc.nextInt();
				lp.AddPosition(position);
				break;
			case 2: 
				System.out.println("Enter the position: ");
				position = sc.nextInt();
				lp.deletebyposition(position);
				break;
			case 3:
				System.out.println("...................................");
				lp.display();
				System.out.println("...................................");
				break;
			case 0:
				System.out.println("End.....................");
				System.exit(0);
			
			}
		}while(option != 0);


	}

}
