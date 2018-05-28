import java.util.*;

public class myFunction {
  public static void main(String[] args) {
	
	List list = new ArrayList();
	list.add("India");
	list.add("America");			
	list.add("Australia");
	
	list.remove(1); //America will be removed
	
	list.add("Japan"); //Japan will be added at the end
	//Now the array is India,Australia and Japan
	
	System.out.println(list.get(1)); //Will print Australia
	
	System.out.println(list.toString());			
			
  }
}