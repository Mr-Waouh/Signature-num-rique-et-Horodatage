package Sign_Verify;//default package
	//importation des packets annexes
import RSA.*;
	//mportation des librairies
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.err.println("Start");
		Scanner clavier=new Scanner(System.in);
		System.out.println("####Tappez votre texte a signer####");
		String input=new String();
		input=clavier.nextLine();
		digest dig=new digest(input);
		System.out.println("message to sign:"+dig.getMessageToSign());
		try {
			RSA toCrypt=new RSA(dig.getHashNumber());
		}catch(Exception e) {
			System.err.println("ERROR:\n"+e.getMessage());
		}
		
		System.err.println("End");
	}

}
