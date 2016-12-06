public class Player {

    // Fields for basic player information
    private String firstName;
    private String lastName;
    private int birthday;
    private int number;
    private int weight;
    private int height;

    // Constructor that sets the fields
    public Player(String firstName, String lastName, int birthday, int number, int weight, int height) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.birthday = birthday;
	this.number = number;
	this.weight = weight;
	this.height = height;
    }

    // Getter and Setter methods
    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
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
