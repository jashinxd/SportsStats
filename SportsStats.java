public class SportsStats {

    public static String chooser(String[] options) {
	Scanner sc = new Scanner(System.in);
	String input = "";
	while (input == "") {
	    System.out.println(options[0]);
	    for (int i = 1; i < options.length; i++) {
		System.out.println(i + ". " + options[i]);
	    }
	    input = sc.nextLine();
	}
	return input;
    }

    public static String input(String query) {
	Scanner sc = new Scanner(System.in);
	String input = "";
	while (input == "") {
	    System.out.println(query + ": ");
	    input = sc.nextLine();
	}
	return input;
    }
    
    public static void main(String[] args) {
	String[] mainOptions = {"What do you want to do?",
				    "View All Teams",
				    "Add Team",
				    "Remove Team",
				    "View Players on Team",
				    "Search For a Specific Player"};
	Scanner sc = new Scanner(System.in);
	String ret = "";
	int numTeams = 0;
	while (true) {
	    ret = chooser(mainOptions);
	    System.out.println(ret);
	}
    }
}
