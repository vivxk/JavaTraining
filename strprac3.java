import java.util.stream.IntStream;

class Encryption {
	public String decodedMessage(String message) {
		String s = message.replaceAll("[aAeEiIoOuU]", "");
		return s;

	}

	public String encodeMessage(String message) {
		StringBuilder sb = new StringBuilder(message);
		char[] c = { 'a', 'e', 'i', 'o', 'u' };
		System.out.println(c);
		for (int i = 0; i < sb.length(); i++) {
//			char a = sb.charAt(i);
			sb.setCharAt(i, c[i]);
		}

		return sb.toString();

	}

}

public class strprac3 {

	public static void main(String[] args) {
		Encryption encryption = new Encryption();
		System.out.println(encryption.decodedMessage("Original Message"));
		System.out.println(encryption.encodeMessage("QWRT cvbn MnKL"));

	}

}
