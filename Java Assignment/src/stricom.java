public class stricom {
	    public static void main(String[] args) {
	        System.out.println(compareStrings("topsint.com", "topsint.com"));
	        System.out.println(compareStrings("Topsint.com", "topsint.com"));
	    }

	    public static String compareStrings(String string1, String string2) {
	        if (string1.equalsIgnoreCase(string2)) {
	            return "true";
	        } else {
	            return "false";
	        }
	    }
	}