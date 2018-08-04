//Display details of persons and find older one of two persons
public class PersonTest {

	public static void main(String[] args) {
		
		Person Ram=new Person("Ram",5,6,1980);
		Person Shayam=new Person("Shayam",2,3,1987);
		
		//Display details of Ram and Shayam
		Ram.display();
		Shayam.display();
		
		//Display who is older between Ram and Shayam
		Ram.olderOne(Shayam);
	}
}