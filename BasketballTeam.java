import java.util.ArrayList;

public class BasketballTeam extends Team{

    // Fields for roster of players
    private Hashtable<Integer, BasketballPlayer> byPoints = new Hashtable<Integer, BasketballPlayer>(150);
    private Hashtable<Integer, BasketballPlayer> byRebounds = new Hashtable<Integer, BasketballPlayer>(150);
    private Hashtable<Integer, BasketballPlayer> byAssists = new Hashtable<Integer, BasketballPlayer>(150);
    private Hashtable<Integer, BasketballPlayer> bySteals = new Hashtable<Integer, BasketballPlayer>(150);
    private Hashtable<Integer, BasketballPlayer> byBlocks = new Hashtable<Integer, BasketballPlayer>(150);
    private Hashtable<Integer, BasketballPlayer> byGamesPlayed = new Hashtable<Integer, BasketballPlayer>(150);

    // Constructor that sets the fields
    public BasketballTeam(String name, String coach, int wins, int losses) {
	super(name, coach, wins, losses);
    }

    // Adding player to roster
    public void addPlayer(BasketballPlayer p) {
	getHTFullName().insertQuad(p.getFirstName() + " " + p.getLastName(), p);
	getHTFirstName().insertQuad(p.getFirstName(), p);
	getHTLastName().insertQuad(p.getLastName(), p);
	getHTNumber().insertQuad(p.getNumber(), p);
	getHTWeight().insertQuad(p.getWeight(), p);
	getHTHeight().insertQuad(p.getHeight(), p);
	byPoints.insertQuad(p.getPoints(), p);
	byRebounds.insertQuad(p.getRebounds(), p);
	byAssists.insertQuad(p.getAssists(), p);
	bySteals.insertQuad(p.getSteals(), p);
	byBlocks.insertQuad(p.getBlocks(), p);
	byGamesPlayed.insertQuad(p.getGamesPlayed(), p);
    }

    // Getter and Setter methods
    public ArrayList<BasketballPlayer> getByPoints(int s) {
	return byPoints.getQuad(s);
    }
    
    public ArrayList<BasketballPlayer> getByRebounds(int s) {
	return byRebounds.getQuad(s);
    }

    public ArrayList<BasketballPlayer> getByAssists(int s) {
	return byAssists.getQuad(s);
    }

    public ArrayList<BasketballPlayer> getBySteals(int i) {
	return bySteals.getQuad(i);
    }

    public ArrayList<BasketballPlayer> getByBlocks(int i) {
	return byBlocks.getQuad(i);
    }

    public ArrayList<BasketballPlayer> getByGamesPlayed(int i) {
	return byGamesPlayed.getQuad(i);
    }
}
