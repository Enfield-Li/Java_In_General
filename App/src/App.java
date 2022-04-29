import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class App {

  public static void main(String[] args) {
    // ** Array **
    // Fixed length hold primitives or objects
    String[] arr = new String[4];
    String[] arr2 = { "arr0", "arr1" };
    List<String> list = Arrays.asList("list1", "list2");

    // ** List **
    List<String> list2 = new ArrayList<>(
      Arrays.asList("11", "22") // mutable list
    );
    list2.add("e");

    // ** ArrayList **
    // Not fixed length hold only objects(Wrapper class) not primitives
    ArrayList<String> arrList = new ArrayList<>();
    ArrayList<String> arrList1 = new ArrayList<>(
      Arrays.asList("al1", "al2") // mutable list
    );

    // ** Operations **
    // access
    System.out.println(arr[0] + arr.length);
    System.out.println(arrList1.get(1) + arrList1.size());
    System.out.println(list.get(0));

    // add
    arrList1.add("ar3");

    // update
    arr2[0] = "1";
    arrList1.set(0, "ar0");
    list.set(0, "update 0 index");

    // delete
    arrList1.remove(0);

    System.out.println(list); // print raw element
    System.out.println(arr2); // print memory
    System.out.println(arrList1); // print element with toString/loop
    // ArrayList<String> arrList2 = Arrays.asList("akldf", "skzdf"); // Immutable list

    // ** 2D ArrayList **
    List<String> twoDList = new ArrayList<>();
    twoDList.add("one");
    twoDList.add("two");
    twoDList.add("three");

    List<String> twoDList2 = new ArrayList<>();
    twoDList2.add("four");
    twoDList2.add("five");
    twoDList2.add("six");

    List<String> twoDList3 = new ArrayList<>();
    twoDList3.add("seven");
    twoDList3.add("eight");

    List<List<String>> combined = new ArrayList<>();
    combined.add(twoDList);
    combined.add(twoDList2);
    combined.add(twoDList3);

    System.out.println(combined);
    System.out.println(combined.get(0).get(1));
  }
}
