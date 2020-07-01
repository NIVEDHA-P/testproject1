package project1;

import java.util.Scanner;
import java.io.IOException;


public class MainClass {
	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to LockedMe.com");
        try(Scanner sc=new Scanner(System.in)){
		Files fi=new FilesImpl();
		int ch=0;
		do
		{
			System.out.println(" LockedME.com menu"); 
			System.out.println("------------------------");
			System.out.println("1) Create a file");
			
			System.out.println("2)search file");
			System.out.println("3)delete file");
			System.out.println("4)sort file");
			System.out.println("5)Exit");
			System.out.println("Enter the choice");
			 
			ch = Integer.parseInt(sc.nextLine());
			
			switch(ch)
			{
			case 1:
				  fi.createFile();
				  break;
				  
			case 2: 
				
				Scanner s1= new Scanner(System.in);
				String filename1=s1.nextLine();
				fi.getFilesByName(filename1);
				break;
			case 3:
				
				Scanner s2=new Scanner(System.in);
				String filename2=s2.nextLine();
				fi.removeFile(filename2); 
				break;
			case 4:
				fi.getAllFiles();
				break;
			case 5:
				System.out.println("thank you  for using LockedMe.com");
				break;
			default:
				System.out.println("Invalid option .....choose again!!");
			}
		}while(ch!=5);
		

	}
}
}
