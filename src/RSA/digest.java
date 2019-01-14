package RSA;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class digest {
	
	// ATTRIBUTS
	
	private String message;
	private BigInteger output;
	
	//ACCESSEURS
	
	public String getMessageToSign() {    //Retourne l'attribut Message
		return this.message;
	}
	
	public BigInteger getHashNumber(){    //Retourne l'attribut Output
		this.setOutput();
		return this.output;		
	}
	
	public digest(String input){          //initialise l'attribut Message
		this.message=input;
	}
	
	//METHODES
	
	public void setOutput(){                     // Creation du Digest et Initialisation de l'attribut Output
		try {
			MessageDigest algo=MessageDigest.getInstance("SHA-1");
			byte[] byteOfTextToHash=this.message.getBytes(StandardCharsets.UTF_8);
			byte[] hashedByteArray=algo.digest(byteOfTextToHash);
			this.output = new BigInteger(1,hashedByteArray);
		}catch(NoSuchAlgorithmException e1){
			System.err.println("ALgorithm error:\n"+e1.getMessage());
		}
	}
	
}
