
public class Player implements IPlayer{
	
	int id;
	String firstName;
	String lastName;
	int birtOfYear;
	String nationalityId;
	
	public Player(int id, String firstName, String lastName, int birtOfYear, String nationalityId) {
		this.id= id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birtOfYear = birtOfYear;
		this.nationalityId = nationalityId;
				
	} 
	
}
