import java.util.HashMap;

public class App {

  public static void main(String[] args) {
    HashMap<Integer, String> hMap = new HashMap<>();

    hMap.put("personOne".hashCode(), "name1");
    hMap.putIfAbsent("personThree".hashCode(), "name3");
    hMap.put("personTwo".hashCode(), "name2");

    // hMap.putIfAbsent("personTwo", "name222");

    hMap.replace("personTwo".hashCode(), "name222");
    // hMap.remove("personThree");

    // System.out.println(hMap);
    // System.out.println(hMap.get("personOne".hashCode()));
    // System.out.println(hMap.containsKey("personTwo1".hashCode()));
    // System.out.println(hMap.containsValue("name222"));
    
    // for (Integer i : hMap.keySet()) {
    //   System.out.println(i);
    //   System.out.println(hMap.get(i));
    // }
  }
}
