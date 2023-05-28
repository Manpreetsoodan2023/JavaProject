package aTestPackage;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Constructor {

	//Convert a String separated by comma to an arraylist ("Welcome,to,the,most,important,interview,of,the,Course")
	
	
	String name = "Welcome,to,the,most,important,interview,of,the,Course";
	
	
	public void printArrayList() {
		
		String[] wordList  = name.split(",");
		
		 List<String> list = new ArrayList<String>(Arrays.asList(wordList));
		 
		 for (String s : list)
		 System.out.println(s);
	}
	
}
