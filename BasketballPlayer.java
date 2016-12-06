public class BasketballPlayer extends Player {

    private int points;
    private int rebounds;
    private int assists;
    private int steals;
    private int blocks;
    private int gamesPlayed;

    public BasketballPlayer(String name, int birthday, int number, int weight, int height) {
	super(name, birthday, number, weight, height);
	points = 0;
	rebounds = 0;
	assists = 0;
	steals = 0;
	blocks = 0;
	gamesPlayed = 0;
    }

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

    public void setSteals(int steals) {
	this.steals = steals;
    }

    public int getBlocks() {
	return blocks;
    }

    public void setBlocks(int blocks) {
	this.blocks = blocks;
    }  

    
}
