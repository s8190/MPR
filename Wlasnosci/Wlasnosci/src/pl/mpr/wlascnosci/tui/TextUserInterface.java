package pl.mpr.wlascnosci.tui;

import java.util.InputMismatchException;
import java.util.Scanner;

import pl.mpr.wlascnosci.db.WlasnosciManager;

public class TextUserInterface {
	
	private Scanner in = null;
	private WlasnosciManager wm = new WlasnosciManager();

	public void start() {
		printWelcomeMsg();
		while (true) {
			printMenu();
			switch (readchoice()) {
			case ADDOWNER: wm.dodajWlasciciela(); break;
			case DELOWNER: wm.usunWlasciciela(); break;
			case SHOWOWNER: wm.pokarzWlascicieli(); break;
			case ADDTHING: wm.dodajRzecz(); break;
			case DELTHING: wm.usunRzecz(); break;
			case DELALL: wm.usunWszytsko(); break;
			case END: printGoodbyeMsg(); return;
			case NONE: continue;
			}
		}
	}
	
	private Action readchoice() {
		in = new Scanner(System.in);
		int choice = -1;
		try {
			choice = in.nextInt();
		} catch (InputMismatchException e) {
			System.err.println("Wprowadzona wartość jest błędna, spróbuj ponownie.");
			return Action.NONE;
		}
		switch (choice) {
		case 1: return Action.ADDOWNER;
		case 2: return Action.DELOWNER;
		case 3: return Action.SHOWOWNER;
		case 4: return Action.ADDTHING;
		case 5: return Action.DELTHING;
		case 6: return Action.DELALL;
		case 0: return Action.END;
		default: return Action.NONE;
		}
	}
	
	private void printWelcomeMsg() {
		System.out.println("Witamy w menedżerze własności\n");
	}

	private void printMenu() {
		System.out.print("Wybierz :\n" + "1. Dodaj właściciela\n"
				+ "2. Usuń właściciela\n" + "3. Wyświetl właścicielów\n"
				+ "4. Dodaj rzecz\n" + "5. Usuń rzecz\n"
				+ "6. Usun wszytsko\n" + "0. Wyście\n" + "> ");
	}
	
	private void printGoodbyeMsg() {
		System.out.println("Miłego dnia\n");
	}
	
}
