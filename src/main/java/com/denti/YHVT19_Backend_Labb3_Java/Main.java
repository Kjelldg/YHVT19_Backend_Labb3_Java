package com.denti.YHVT19_Backend_Labb3_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * This class contains the console interface. 
 * A user can add a user to the database as well as print the users from the database to the console.
 * 
 */
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		// Classes used for submitting and viewing users in the database.
		SubmitUser submitUserClass = new SubmitUser();
		ViewUsers viewUsersClass = new ViewUsers();

		boolean loop = true; // Loop for controlling the program.

		// Reads user input.
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		/*
		 * This loop contains the program. A simple switch interface with 3 options
		 * allows the user to submit a user, view the users or quit the program.
		 */
		while (loop == true) {
			System.out.println("\nWelcome to the program. Would you like to add or view users?");
			System.out.println("Press 1 to add a user to the database.");
			System.out.println("Press 2 to view the users in the database.");
			System.out.println("Press 3 to exit the program.");

			int answer = Integer.parseInt(bufferedReader.readLine());

			switch (answer) {
			case 1:
				System.out.println("Enter user name and press enter: ");
				String name = bufferedReader.readLine();
				System.out.println("Enter user profession and press enter: ");
				String profession = bufferedReader.readLine();
				submitUserClass.userSubmit(name, profession);
				break;
			case 2:
				viewUsersClass.viewUsers();
				break;
			case 3:
				loop = false;
				System.out.println("Goodbye!");
				break;
			default:
				break;
			}

		}

	}

}
