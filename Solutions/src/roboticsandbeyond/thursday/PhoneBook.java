package roboticsandbeyond.thursday;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PhoneBook {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Integer> phonebook = new HashMap<String, Integer>();
		String input = scan.nextLine();
		while (input != "stop") {
			if (input.equals("add")) {
				System.out.println("Enter a name:");
				String name = scan.nextLine();
				System.out.println("Enter a number:");
				int number = scan.nextInt();
				scan.nextLine();
				phonebook.put(name, number);
				System.out.println(name + " has been added to the phone book.");
			} else if (input.equals("remove")) {
				System.out.println("Enter a name:");
				String name = scan.nextLine();
				Integer number = phonebook.remove(name);
				if (number != null) {
					System.out.println(name + " has been removed from the phone book.");
				} else {
					System.out.println(name + " was not in the phone book.");
				}
			} else if (input.equals("search")) {
				System.out.println("Enter a name to search for:");
				String name = scan.nextLine();
				Integer number = phonebook.get(name);
				if (number != null) {
					System.out.println(name + "\'s number is " + number + ".");
				} else {
					System.out.println(name + " does not have a number in the phone book.");
				}
			} else if (input.equals("print")) {
				for (Entry<String, Integer> entry : phonebook.entrySet()) {
					System.out.println(entry.getKey() + ": " + entry.getValue());
				}
			}
			
			input = scan.nextLine();
		}
		
		scan.close();
	}

}
