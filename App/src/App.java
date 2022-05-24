import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

  public static void main(String[] args) {
    // IntStream.range(1, 10).forEach(System.out::print);

    // IntStream.range(1, 10).forEach(x -> System.out.println(x));

    // System.out.println(IntStream.range(1, 10).sum());

    // Stream
    //   .of("11", "2", "3")
    //   .map(x -> Integer.parseInt(x))
    //   .sorted()
    //   .findFirst()
    //         .ifPresent(System.out::println);

    String[] name = { "ssssk", "kkkks", "aaaak", "kkkka" };
    System.out.println(name);
    

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
