package roboticsandbeyond.thursday;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
	
	public static void Main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> phonebook = new HashMap<String, Integer>();
		String input = scan.nextLine();
		while (input != "stop") {
			if (input == "add") {
				System.out.println("Enter a name:");
				String name = scan.nextLine();
				System.out.println("Enter a number:");
				int number = scan.nextInt();
				phonebook.put(name, number);
				System.out.println(name + " has been added to the phone book.");
			} else if (input == "remove") {
				System.out.println("Enter a name:");
				String name = scan.nextLine();
				Integer number = phonebook.remove(name);
				if (number != null) {
					System.out.println(name + " has been removed from the phone book.");
				} else {
					System.out.println(name + " was not in the phone book.");
				}
			} else if (input == "search") {
				System.out.println("Enter a name to search for:");
				String name = scan.nextLine();
				Integer number = phonebook.get(name);
				if (number != null) {
					System.out.println(name + "\'s number is " + number);
				} else {
					System.out.println(name + " does not have a number in the phone book.");
				}
			}
		}
		
		scan.close();
	}

}
