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
		ArrayList<Team> tArray;
		Team t;
		int numPlayers;
		String teamName = inputer("Enter team name");
		tArray = teamByName.getQuad(teamName);
		t = tArray.get(0);
		numPlayers = t.getHTFullName().getInArray();
		System.out.println(t.getName());
		System.out.println("Coach: " + t.getCoach());
		System.out.println("Record: " + t.getRecord());
		System.out.println("Number of Players: " + numPlayers);
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
		String addP = "y";
		ArrayList<Team> tArray;
		Team t;
		ArrayList<Player> pArray;
		Player p;
		String pFirstName;
		String pLastName;
		int pNumber;
		String pBirthday;
		int pHeight;
		int pFeet;
		int pInches;
		String pHeightS;
		int pWeight;
		String teamName = inputer("Enter team name");
		tArray = teamByName.getQuad(teamName);
		t = tArray.get(0);
		pArray = t.getAllPlayers();
		while (addP.compareTo("y") == 0) {
		    System.out.println(t.getName());
		    for (int i = 0; i < pArray.size(); i++) {
			p = pArray.get(i);
			pFirstName = p.getFirstName();
			pLastName = p.getLastName();
			pNumber = p.getNumber();
			pBirthday = p.getBirthday();
			pHeight = p.getHeight();
			pFeet = pHeight / 12;
			pInches = pHeight - (pFeet * 12);
			pHeightS = pFeet + "'" + pInches + "\"";
			pWeight = p.getWeight();
			System.out.println(i+". "+pFirstName + " " + pLastName + " -- " + "Number: " + pNumber + ", Birthday: " + pBirthday + ", Height: " + pHeightS + ", Weight: " +  pWeight);
		    }
		
		    addP = inputer("Would you like to add a player? (y/n)");
		    if (addP.compareTo("y") == 0) {
			Player newP;
			String newPFirstName = inputer("First Name");
			String newPLastName = inputer("Last Name");
			String newPBirthday = inputer("Birthday (MM/DD/YYYY)");
			int newPNumber = Integer.parseInt(inputer("Number"));
			String newPHeight = inputer("Height (X'Y\")");
			int indOfA = newPHeight.indexOf("'");
			int indOfQ = newPHeight.indexOf("\"");
			int feet = Integer.parseInt(newPHeight.substring(0, indOfA));
			int inches = Integer.parseInt(newPHeight.substring(indOfA + 1, indOfQ));
			inches += feet * 12;
			int newPHeightInt = inches;
			int newPWeight = Integer.parseInt(inputer("Weight (in pounds, no units)"));
			newP = new Player(newPFirstName, newPLastName, newPBirthday, newPNumber, newPWeight, newPHeightInt);
			teamByName.getQuad(teamName).get(0).addPlayer(newP);
		    }
		}
	    }
	    if (ret.compareTo("5") == 0) {
		on = false;
	    }
	}
    }
}
