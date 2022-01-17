package com.mycompany.eb.myproject;
import com.mycompany.eb.myproject.MenuOptions;

public class LockedMeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create "main" folder if not present in current folder structure
		FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("Locker", "Manoj");
		
		HandleOption.handleWelcomeScreenInput();


	}

}