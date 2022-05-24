import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

  public static void main(String[] args) throws IOException {
    // IntStream.range(1, 10).forEach(System.out::print);

    // IntStream.range(1, 10).forEach(x -> System.out.println(x));

    // System.out.println(IntStream.range(1, 10).sum());

    // Stream
    //   .of("11", "2", "3")
    //   .map(x -> Integer.parseInt(x))
    //   .sorted()
    //   .findFirst()
    //   .ifPresent(System.out::println);

    // String[] name = { "ssssk", "kkkks", "aaaak", "kkkka", "ads", "abc" };
    // Arrays
    //   .stream(name) // same as Stream.of(names)
    //   .filter(x -> x.startsWith("a"))
    //   .sorted()
    //   .forEach(System.out::println);

    // Arrays
    //   .stream(new int[] { 2, 4, 6, 8, 10 })
    //   .map(x -> x * x)
    //   .average()
    //   .ifPresent(System.out::println); // double

    // List<String> people = Arrays.asList("aa", "bb", "cc", "ab");
    // people
    //   .stream()
    //   .map(String::toLowerCase)
    //   .filter(x -> x.startsWith("a"))
    //   .forEach(System.out::println);

    // Stream<String> bands = Files.lines(
    //   Paths.get("D:/desktop/learn/JAVA/Java/App/src/bands.txt")
    // );
    // bands.sorted().filter(x -> x.length() > 13).forEach(System.out::println);
    // //   .forEach(x -> System.out.println(x));
    // bands.close();

    // List<String> bands2 = Files
    //   .lines(Paths.get("D:/desktop/learn/JAVA/Java/App/src/bands.txt"))
    //   .filter(x -> x.contains("jit"))
    //   .collect(Collectors.toList());
    // bands2.forEach(x -> System.out.println(x));

    // Stream<String> rows1 = Files.lines(
    //   Paths.get("D:/desktop/learn/JAVA/Java/App/src/data.txt")
    // );
    // int rowCount = (int) rows1
    //   .map(x -> x.split(","))
    //   .filter(x -> x.length == 3)
    //   .count();
    // System.out.println(rowCount + " rows");
    // rows1.close();

    // Stream<String> rows2 = Files.lines(
    //   Paths.get("D:/desktop/learn/JAVA/Java/App/src/data.txt")
    // );
    // rows2
    //   .map(x -> x.split(","))
    //   .filter(x -> x.length == 3)
    //   .filter(x -> Integer.parseInt(x[1]) > 15)
    //   .forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));

    // Stream<String> rows3 = Files.lines(
    //   Paths.get("D:/desktop/learn/JAVA/Java/App/src/data.txt")
    // );
    // Map<String, Integer> map = new HashMap<>();
    // map =
    //   rows3
    //     .map(x -> x.split(","))
    //     .filter(x -> x.length == 3)
    //     .filter(x -> Integer.parseInt(x[1]) > 15)
    //     .collect(Collectors.toMap(x -> x[0], x -> Integer.parseInt(x[1])));
    // rows3.close();
    // // map.keySet().forEach(x -> System.out.println(x + "  " + map.get(x))); // Local variable map defined in an enclosing scope must be final or effectively final
    // for (String key : map.keySet()) {
    //   System.out.println(key + "  " + map.get(key));
    // }

    // double total = Stream
    //   .of(7.3, 1.5, 4.8)
    //   .reduce(0.0, (Double a, Double b) -> a + b);
    // System.out.println(total);

    // IntSummaryStatistics summary = IntStream
    //   .of(7, 2, 19, 88, 73, 4, 10)
    //   .summaryStatistics();
    // System.out.println(summary);
  }
  //   private static List<Person> getPeople() {
  //     return Arrays.asList(
  //       new Person("Antonio", 20, Gender.MALE),
  //       new Person("Alina Smith", 33, Gender.FEMALE),
  //       new Person("Helen White", 57, Gender.FEMALE),
  //       new Person("Alex Boz", 14, Gender.MALE),
  //       new Person("Jamie Goa", 99, Gender.MALE),
  //       new Person("Anna Cook", 7, Gender.FEMALE),
  //       new Person("Zelda Brown", 120, Gender.FEMALE)
  //     );
  //   }
}
/* List<Person> people = getPeople();

    // Imperative approach ❌

    List<Person> females1 = new ArrayList<>();
    for (Person person : people) {
      if (person.getGender().equals(Gender.FEMALE)) {
        females1.add(person);
      }
    }
    females1.forEach(System.out::println);

    // Declarative approach ✅

    // Filter
    List<Person> females = people
      .stream()
      .filter(person -> person.getGender().equals(Gender.FEMALE))
      .collect(Collectors.toList());

    //    females.forEach(System.out::println);

    // Sort
    List<Person> sorted = people
      .stream()
      .sorted(
        Comparator
          .comparing(Person::getAge)
          .thenComparing(Person::getGender)
          .reversed()
      )
      .collect(Collectors.toList());

    //    sorted.forEach(System.out::println);

    // All match
    boolean allMatch = people.stream().allMatch(person -> person.getAge() > 8);

    //    System.out.println(allMatch);
    // Any match
    boolean anyMatch = people
      .stream()
      .anyMatch(person -> person.getAge() > 121);

    //    System.out.println(anyMatch);
    // None match
    boolean noneMatch = people
      .stream()
      .noneMatch(person -> person.getName().equals("Antonio"));

    //    System.out.println(noneMatch);

    // Max
    people.stream().max(Comparator.comparing(Person::getAge));
    //        .ifPresent(System.out::println);

    // Min
    people.stream().min(Comparator.comparing(Person::getAge));
    //        .ifPresent(System.out::println);

    // Group
    Map<Gender, List<Person>> groupByGender = people
      .stream()
      .collect(Collectors.groupingBy(Person::getGender));

    //    groupByGender.forEach((gender, people1) -> {
    //      System.out.println(gender);
    //      people1.forEach(System.out::println);
    //      System.out.println();
    //    });

    Optional<String> oldestFemaleAge = people
      .stream()
      .filter(person -> person.getGender().equals(Gender.FEMALE))
      .max(Comparator.comparing(Person::getAge))
      .map(Person::getName);

    oldestFemaleAge.ifPresent(System.out::println); */
