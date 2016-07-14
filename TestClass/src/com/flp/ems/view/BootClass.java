package com.flp.ems.view;
import java.util.Scanner;
public class BootClass 
{
	public static void main(String args[])
	{
		System.out.println("Hello, Welcome to Employee Management System :-");
		System.out.println("Kindly enter the task to be performed\n");
		System.out.println("1. Add an Employee.");
		System.out.println("2. Modify an Employee.");
		System.out.println("3. Remove an Employee.");
		System.out.println("4. Search for an Employee.");
		System.out.println("5. Display all.");
		System.out.println("6. Exit.");
		BootClass boot=new BootClass();
		boot.menuSelection();
	}
	private void menuSelection()
	{
		Scanner s = new Scanner(System.in);
		int ch=s.nextInt();
		UserInteraction u=new UserInteraction();
		switch(ch)
		{
		case 1:
			System.out.println("ADD");
			u.addEmployee();
		case 2:
			System.out.println("MODIFY");
			u.modifyEmployee();
		case 3:
			System.out.println("REMOVE");
			u.removeEmployee();
		case 4:
			System.out.println("SEARCH");
			u.searchEmployee();
		case 5:
			System.out.println("DISPLAY");
			u.getAllEmployee();
		case 6:
			System.out.println("THANK YOU");
			System.exit(0);
		default:
			System.out.println("Invalid Choice!!!");
		}
		s.close();
	}

}
