
public class TestEncryption {

	public static void main(String[] args) {
		String value = "Table";
		
		SubstitutionCipher obj1 = new SubstitutionCipher(4);
		
		String encodedString = obj1.encode(value);
		System.out.println("Encoded value is " + encodedString);
		
		String decodedString = obj1.decode(encodedString);
		System.out.println("Decoded value is " + decodedString);
				
	}

}
