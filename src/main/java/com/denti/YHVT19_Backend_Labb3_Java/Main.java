package com.denti.YHVT19_Backend_Labb3_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		SubmitUser submitUserClass = new SubmitUser();
		ViewUsers viewUsersClass = new ViewUsers();
		boolean loop = true;
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		while (loop == true) {
			System.out.println("\nWelcome to the program. Would you like to add or view users?");
			System.out.println("Press 1 to add a user to the database.");
			System.out.println("Press 2 to view the users in the database.");
			System.out.println("Press 3 to exit the program.");

			int answer = Integer.parseInt(bufferedReader.readLine());

			switch (answer) {
			case 1:
				System.out.println("Enter name and press enter: ");
				String name = bufferedReader.readLine();
				System.out.println("Enter profession and press enter: ");
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
