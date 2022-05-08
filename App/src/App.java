import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import javax.lang.model.element.NestingKind;
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
    list2.addAll(Arrays.asList("11", "22"));

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
    System.out.println(arrList1.get(0));

    // delete
    arrList1.remove(0);
    System.out.println(arrList1.get(0));

    System.out.println(arr2); // print memory
    System.out.println(arrList1); // print element with toString/loop
    // ArrayList<String> arrList2 = Arrays.asList("akldf", "skzdf"); // Immutable list
    list.set(0, "update 0 index");

    // delete
    arrList1.remove(0);

    System.out.println(list); // print raw element
    System.out.println(arr2); // print memory

    Set<Integer> hashSet = new HashSet<>();
    Set<Integer> treeSet = new TreeSet<>();

    // Set<String> set1 = Set.of("adf", "123"); // unmutable

    Boolean added = hashSet.add(1);
    Boolean added2 = hashSet.add(1);
    System.out.println(added);
    System.out.println(added2);

    // unordered
    hashSet.add(2);
    hashSet.add(44);
    hashSet.add(11);
    hashSet.add(223);

    // ordered
    treeSet.add(41);
    treeSet.add(1);
    treeSet.add(10);
    treeSet.add(111);

    // hashSet.addAll(Set.of(1, 2, 3));

    // Iterator<Integer> iterator = hashSet.iterator();
    // while (iterator.hasNext()) {
    //   Integer next = iterator.next();
    //   System.out.println(next); // random order
    // }
    // for (Integer i : treeSet) {
    //   System.out.println(i); // random order
    // }
    // hashSet.forEach(i -> System.out.println(i));

    System.out.println(hashSet);
  }
}
