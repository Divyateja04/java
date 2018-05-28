import java.util.*;

public class mapping {
  public static void main(String[] args) {
    Map map = new HashMap();
    map.put("Father","Rob");
    map.put("Brother","bro");
    System.out.println(map.toString());
    map.remove("Brother");
    System.out.println(map.toString());
    System.out.println(map.size());
  }
}