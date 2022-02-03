package blueconch.code;

class CharNotFoundExcepion extends RuntimeException {
	CharNotFoundExcepion(String msg) {
		super(msg);
	}
}

public class ExceptionHandling {

	public Character characterLocator(String s1, String s2) {
		if (s1.indexOf(s2) > 0) {
			return 'Y';
		} else {
			throw new CharNotFoundExcepion("Character not found in given string");
		}
//		return null;
	}

	public static void main(String[] args) {
		ExceptionHandling obj = new ExceptionHandling();
		try {
			System.out.println(obj.characterLocator("Tushar", "q"));
		} catch (CharNotFoundExcepion e) {
			e.printStackTrace();
		}
	}
}
