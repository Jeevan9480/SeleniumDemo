package basicweb;
import java.security.SecureRandom;
import java.util.Random;

public class Generalmethods {
	

	
	    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	    private static final SecureRandom RANDOM = new SecureRandom();

	    public static String generateRandomString(int length) {
	        StringBuilder sb = new StringBuilder(length);
	        for (int i = 0; i < length; i++) {
	            sb.append(CHARACTERS.charAt(RANDOM.nextInt(CHARACTERS.length())));
	        }
	        return sb.toString();
	    }
	    
	  

	  
	       public static int randomInt() {
	            Random random = new Random();
	            int min = 1000;
	            int max = 9999;
	            int randomInt = random.nextInt(max - min + 1) + min; // Generates a random integer between min (inclusive) and max (inclusive)
	            System.out.println("Random Integer between " + min + " and " + max + ": " + randomInt);
	            return randomInt;
	        }
	    


	    public static void main(String[] args) {
	        int length = 6; // specify the length of the random string
	        randomInt();
	        String randomString = generateRandomString(length);
	        System.out.println("Random String: " + randomString);
	    }
	}


