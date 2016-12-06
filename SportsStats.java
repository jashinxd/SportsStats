import java.util.Scanner;

public class SportsStats {

    public static String chooser(String[] options) {
	Scanner sc = new Scanner(System.in);
	String input = "";
	while (input == "") {
	    System.out.println(options[0]);
	    for (int i = 1; i < options.length; i++) {
		System.out.println(i + ". " + options[i]);
	    }
	    input = "" + sc.nextLine();
	}
	return input;
    }

    public static String inputer(String query) {
	Scanner sc = new Scanner(System.in);
	String input = "";
	while (input == "") {
	    System.out.println(query + ": ");
	    input = sc.nextLine();
	}
	return input;
    }
    
    public static void main(String[] args) {
	String[] mainOptions = {"What do you want to do? Enter a number",
				"View All Teams",
				"Add Team",
				"Remove Team",
				"View Players on Team",
				"Search For a Specific Player",
				"Quit"};
	Scanner sc = new Scanner(System.in);
	int numTeams = 0;
	boolean on = true;
	while (on) {
	    String ret = chooser(mainOptions);
	    if (ret.compareTo("1") == 0) {
		String teamName = inputer("Team Name");
		String coachName = inputer("Coach Name");
		String record = inputer("Record (Please enter as \"W-L\")");
	    }
	    if (ret.compareTo("2") == 0) {
	    }
	    if (ret.compareTo("3") == 0) {
	    }
	    if (ret.compareTo("4") == 0) {
	    }
	    if (ret.compareTo("5") == 0) {
	    }
	    if (ret.compareTo("6") == 0) {
		on = false;
	    }
	}
    }
}
