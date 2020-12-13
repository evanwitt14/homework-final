
public class SubstitutionCipher implements MessageEncoder{
	
	int shift;
	public SubstitutionCipher(int theShift) {
		shift = theShift;
	}
		
	
	public String encode(String plainText) {
		String encoded = "";
		for(int i = 0; i<plainText.length();i++) {
		}
		
		return encoded;
	}
	
	public String decode(String plainText) {
		String decoded = "";
		for(int i = 0; i<plainText.length();i++) {
			char x = plainText.charAt(i);
			x = reverseShiftCharacter(x);
			decoded = decoded + x;
		}
		return decoded;
	}
	Character shiftCharacter(Character x) {
		return (char)(x + shift);
	}
	Character reverseShiftCharacter(Character x) {
		return (char)(x - shift);
	}
}
