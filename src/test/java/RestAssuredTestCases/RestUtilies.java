package RestAssuredTestCases;

import org.apache.commons.lang3.RandomStringUtils;


public class RestUtilies 
{
     public static String getFirstName()
     {
    	 String generatedString = RandomStringUtils.randomAlphabetic(1);
    	 return ("John"+generatedString);
     }
     
     public static String getLasttName()
     {
    	 String generatedString = RandomStringUtils.randomAlphabetic(1);
    	 return ("Cenna"+generatedString);
     }
     
     public static String getPassword()
     {
    	 String generatedString = RandomStringUtils.randomAlphabetic(1);
    	 return ("John"+generatedString);
     }
     public static String getEmail()
     {
    	 String generatedString = RandomStringUtils.randomAlphabetic(1);
    	 return ("John"+generatedString);
     }
     
}
