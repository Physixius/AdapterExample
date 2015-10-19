
public class AdapterTest {

	public static void main(String[] args) {
		EUSocket eu = new EUSocket();
		USSocket us = new USSocket();
		
		EU adapter = new SocketAdapter(us);
		
		System.out.println("eu: ");
		eu.power230();
		
		System.out.println("us: ");
		us.power120();

		System.out.println("us in eu: ");
		testSocket(adapter);
	}
	
	static void testSocket(EU eu){
		eu.power230();
	}

}
