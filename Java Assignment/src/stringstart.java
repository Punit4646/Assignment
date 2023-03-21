
	public class stringstart {
	    public static void main(String[] args) {
	        System.out.println(startsWith("Red is favorite color.", "Red"));
	        System.out.println(startsWith("Orange is also my favorite color.", "Red"));
	    }

	    public static boolean startsWith(String mainString, String startString) {
	        return mainString.startsWith(startString);
	    }
	}
