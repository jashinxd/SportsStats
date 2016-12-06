import java.util.ArrayList;

public class Team {

    // Fields for basic team information
    private String name;
    private String coach;
    private int wins;
    private int losses;

    // Fields for roster of players
    private Hashtable<String, Player> byFullName = new Hashtable<String, Player>(150);
    private Hashtable<String, Player> byFirstName = new Hashtable<String, Player>(150);
    private Hashtable<String, Player> byLastName = new Hashtable<String, Player>(150);
    private Hashtable<Integer, Player> byNumber = new Hashtable<Integer, Player>(150);
    private Hashtable<Integer, Player> byWeight = new Hashtable<Integer, Player>(150);
    private Hashtable<Integer, Player> byHeight = new Hashtable<Integer, Player>(150);

    // Constructor that sets the fields
    public Team(String name, String coach, int wins, int losses) {
	this.name = name;
	this.coach = coach;
	this.wins = wins;
	this.losses = losses;
    }

    // Adding player to roster
    public void addPlayer(Player p) {
	byFullName.insertQuad(p.getFirstName() + " " + p.getLastName(), p);
	byFirstName.insertQuad(p.getFirstName(), p);
	byLastName.insertQuad(p.getLastName(), p);
	byNumber.insertQuad(p.getNumber(), p);
	byWeight.insertQuad(p.getWeight(), p);
	byHeight.insertQuad(p.getHeight(), p);
    }

    // Getter and Setter methods
    public ArrayList<Player> getByFullName(String s) {
	return byFullName.getQuad(s);
    }
    
    public ArrayList<Player> getByFirstName(String s) {
	return byFirstName.getQuad(s);
    }

    public ArrayList<Player> getByLastName(String s) {
	return byLastName.getQuad(s);
    }

    public ArrayList<Player> getByNumber(int i) {
	return byNumber.getQuad(i);
    }

    public ArrayList<Player> getByWeight(int i) {
	return byWeight.getQuad(i);
    }

    public ArrayList<Player> getByHeight(int i) {
	return byHeight.getQuad(i);
    }

    public ArrayList<Player> getAllPlayers() {
	return byFirstName.getAll();
    }

    public String getName() {
	return this.name;
    }

    public String getCoach() {
	return this.coach;
    }

    public String getRecord() {
	return "" + wins + "-" + losses;
    }

    public Hashtable<String, Player> getHTFullName() {
	return byFullName;
    }
    
    public Hashtable<String, Player> getHTFirstName() {
	return byFirstName;
    }
    
    public Hashtable<String, Player> getHTLastName() {
	return byLastName;
    }

    public Hashtable<Integer, Player> getHTHeight() {
	return byHeight;
    }
    
    public Hashtable<Integer, Player> getHTWeight() {
	return byWeight;
    }
    
    public Hashtable<Integer, Player> getHTNumber() {
	return byNumber;
    }
}
