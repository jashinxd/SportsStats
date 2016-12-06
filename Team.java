import java.io.*;
import java.util.*;

public class Team {

    private String name;
    private String coach;
    private int wins;
    private int losses;
    
    private Hashtable<String, Player> byName = new Hashtable<String, Player>();
    private Hashtable<Integer, Player> byNumber = new Hashtable<Integer, Player>();

    public Team(String name, String coach) {
	this.name = name;
	this.coach = coach;
    }

    public void addPlayer(Player p) {
	byName.put(p.getName(), p);
	byNumber.put(p.getNumber(), p);
    }

    public Player getByName(String s) {
	return byName.get(s);
    }

    public Player getByNumber(int i) {
	return byNumber.get(i);
    }

    public Collection<Player> getAllPlayers() {
	return byName.values();
    }
}
