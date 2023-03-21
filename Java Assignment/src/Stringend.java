public class Stringend {
	    public static void main(String[] args) {
	        System.out.println(endsWith("Java Exercises", "se"));
	        System.out.println(endsWith("Java Exercise", "se"));
	    }

	    public static boolean endsWith(String mainString, String endString) {
	        return mainString.endsWith(endString);
	    }
	}

