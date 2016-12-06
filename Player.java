public class Player {
    
    private String name;
    private int birthday;
    private int number;
    private int weight;
    private int height;

    public Player(String name, int birthday, int number, int weight, int height) {
	this.name = name;
	this.birthday = birthday;
	this.number = number;
	this.weight = weight;
	this.height = height;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getBirthday() {
	return birthday;
    }

    public void setBirthday(int birthday) {
	this.birthday = birthday;
    }

    public int getNumber() {
	return number;
    }

    public void setNumber(int number) {
	this.number = number;
    }
    
    public int getWeight() {
	return weight;
    }

    public void setWeight(int weight) {
	this.weight = weight;
    }

    public int getHeight() {
	return height;
    }

    public void setHeight(int height) {
	this.height = height;
    }
}
