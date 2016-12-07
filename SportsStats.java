import java.util.Scanner;
import java.util.ArrayList;

public class SportsStats {

    // Returns a users' choice from a number of options
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

    // Returns the users' input from a query
    public static String inputer(String query) {
	Scanner sc = new Scanner(System.in);
	String input = "";
	while (input == "") {
	    System.out.println(query + ": ");
	    input = sc.nextLine();
	}
	return input;
    }

    // Returns the value of a string by addition of ASCII values of
    // each character in the string
    public static int turnToInt(String s) {
	int stringVal = 0;
	for (int i = 0; i < s.length(); i++) {
	    stringVal += (int)(s.charAt(i));
	}
	return stringVal;
    }
    
    public static void main(String[] args) {
	String[] mainOptions = {"What do you want to do? Enter a number",
				"View All Teams",
				"View Specific Team",
				"Add Team",
				"Add/View Players on Team",
				"Search for a Specific Player",
				"Quit"};
	int numTeams = 0;
	Hashtable<String, Team> teamByName = new Hashtable<String, Team>(150);
	Hashtable<String, Team> teamByRecord = new Hashtable<String, Team>(150);
	
	boolean on = true;
	while (on) {
	    String ret = chooser(mainOptions);
	    if (ret.compareTo("1") == 0) {
		ArrayList<Team> allTeams;
		allTeams = teamByName.getAll();
		for (int i = 0; i < allTeams.size(); i++) {
		    Team t = allTeams.get(i);
		    System.out.println(t.getName());
		    System.out.println("Coach: " + t.getCoach());
		    System.out.println("Record: " + t.getRecord());
		    System.out.println();
		}
	    }
	    if (ret.compareTo("2") == 0) {
	    }
	    if (ret.compareTo("3") == 0) {
		String teamName = inputer("Team Name");
		String coachName = inputer("Coach Name");
		String record = inputer("Record (Please enter as \"W-L\")");
		int indOfH = record.indexOf("-");
		int wins = Integer.parseInt(record.substring(0,indOfH));
		int losses = Integer.parseInt(record.substring(indOfH + 1));
		BasketballTeam t = new BasketballTeam(teamName, coachName, wins, losses);
		teamByName.insertQuad(teamName, t);
		numTeams++;
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
