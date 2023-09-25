package multilevelinheri;

public class Classtwo extends Classone{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Classtwo m=new Classtwo();
    m.tyres();
    m.rpm();
    m.engine();
    m.breaks();
    
	}
public void tyres() {
	System.out.println("tyres are good");
}
public void rpm() {
	System.out.println("rpm condition good");
}
}
