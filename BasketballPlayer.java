public class BasketballPlayer extends Player {

    // Fields for different statistics
    private int points;
    private int rebounds;
    private int assists;
    private int steals;
    private int blocks;
    private int gamesPlayed;

    // Constructor. Calls the superclass' constructor then sets fields.
    public BasketballPlayer(String firstName, String lastName, int birthday, int number, int weight, int height) {
	super(firstName, lastName, birthday, number, weight, height);
	points = 0;
	rebounds = 0;
	assists = 0;
	steals = 0;
	blocks = 0;
	gamesPlayed = 0;
    }

    // Getter and Setter methods
    public int getPoints() {
	return points;
    }

    public void setPoints(int points) {
	this.points = points;
    }

    public int getRebounds() {
	return rebounds;
    }

    public void setRebounds(int rebounds) {
	this.rebounds = rebounds;
    }

    public int getAssists() {
	return assists;
    }

    public void setAssists(int assists) {
	this.assists = assists;
    }

    public int getSteals() {
	return steals;
    }
    
    public void setSteals(int steals) {
	this.steals = steals;
    }

    public int getBlocks() {
	return blocks;
    }

    public void setBlocks(int blocks) {
	this.blocks = blocks;
    }

    public int getGamesPlayed() {
	return gamesPlayed;
    }

    public void setGamesPlayed(int gamesPlayed) {
	this.gamesPlayed = gamesPlayed;
    }
}
