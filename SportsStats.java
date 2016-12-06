import java.util.Scanner;
import java.util.ArrayList;

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
				"Add Team",
				"Remove Team",
				"View Players on Team",
				"Search For a Specific Player",
				"Quit"};
	Scanner sc = new Scanner(System.in);
	int numTeams = 0;

	Hashtable<Integer, Team> teamByName = new Hashtable<Integer, Team>(150);
	Hashtable<Integer, Team> teamByRecord = new Hashtable<Integer, Team>(150);
	
	boolean on = true;
	while (on) {
	    String ret = chooser(mainOptions);
	    if (ret.compareTo("1") == 0) {
		ArrayList<Team> allTeams;
		allTeams = teamByName.getAll();
		for (int i = 0; i < allTeams.size(); i++) {
		    System.out.println(allTeams.get(i).getName());
		}
	    }
	    if (ret.compareTo("2") == 0) {
		String teamName = inputer("Team Name");
		String coachName = inputer("Coach Name");
		String record = inputer("Record (Please enter as \"W-L\")");
		int indOfH = record.indexOf("-");
		int wins = Integer.parseInt(record.substring(0,indOfH));
		int losses = Integer.parseInt(record.substring(indOfH + 1));
		Team t = new Team(teamName, coachName, wins, losses);
		System.out.println(turnToInt(teamName));
		teamByName.insertQuad(turnToInt(teamName), t);
		System.out.println(wins);
		System.out.println(losses);
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
