package Ch8.Lab3;

public class SubstitutionCipher implements MessageEncoder, MessageDecoder {

	private int shift;
	
	/**
	 * creates a new instant of SubstitutionCipher
	 */
	public SubstitutionCipher(int n){
		shift = n;
	}
	
	public String encode(String plainText){
		String cipherText = "";
		for(int i=0;i<plainText.length();i++){
			Character c = plainText.charAt(i);
			cipherText = cipherText + codeCharacter(c);
		}
		return cipherText;
	}
	
	private Character codeCharacter(Character c){
		return (char)(c+shift);
	}
	
	// this is for the project
	public String decode(String cipherText){
		String plainText = "";
		for(int i=0; i<cipherText.length();i++){
			Character c = cipherText.charAt(i);
			plainText = plainText + decodeCharacter(c);
		}
		return plainText;
	}
	
	private Character decodeCharacter(Character c){
		return (char)(c-shift);
	}
}
