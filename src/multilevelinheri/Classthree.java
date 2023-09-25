package multilevelinheri;

public class Classthree extends Classtwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Classthree l = new Classthree();
   l.bike();
   l.car();
   l.tyres();
   l.breaks();
   l.rpm();
	}
public void bike() {
	System.out.println("tyres are good");
	
}
public void car() {
	System.out.println("rpm condition good");
}
}
