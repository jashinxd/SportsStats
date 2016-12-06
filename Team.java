import java.util.ArrayList;

public class Team {

    private String name;
    private String coach;
    private int wins;
    private int losses;
    
    private Hashtable<String, Player> byFirstName = new Hashtable<String, Player>();
    private Hashtable<String, Player> byLastName = new Hashtable<String, Player>();
    private Hashtable<Integer, Player> byNumber = new Hashtable<Integer, Player>();

    public Team(String name, String coach, int wins, int losses) {
	this.name = name;
	this.coach = coach;
	this.wins = wins;
	this.losses = losses;
    }

    public void addPlayer(Player p) {
	byFirstName.insertQuad(p.getFirstName(), p);
	byLastName.insertQuad(p.getLastName(), p);
	byNumber.insertQuad(p.getNumber(), p);
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
}
