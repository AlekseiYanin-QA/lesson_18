import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // Пример списка для удаления дубликатов
        List<Integer> numbers = Arrays.asList(10, 20, 10, 30, 30, 40, 40, 50);
        List<Integer> distinctNumbers = removeDuplicates(numbers);
        System.out.println("Уникальные числа: " + distinctNumbers);

        // Пример списка строк для подсчета
        List<String> strings = Arrays.asList("яблоко", "айва", "банан", "абрикос", "вишня", "апельсин");
        char startingLetter = 'а';
        long count = countStartingWithLetter(strings, startingLetter);
        System.out.println("Количество строк, начинающихся с '" + startingLetter + "': " + count);

        // Поиск второго по величине элемента
        List<Integer> numberList = Arrays.asList(10, 20, 10, 30, 40, 50);
        Optional<Integer> secondLargest = findSecondLargest(numberList);
        System.out.println("Второй по величине элемент: " + secondLargest.orElse(null));
    }

    // Метод для удаления дубликатов
    public static List<Integer> removeDuplicates(List<Integer> list) {
        return list.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    // Метод для подсчета строк, начинающихся с определенной буквы
    public static long countStartingWithLetter(List<String> strings, char letter) {
        return strings.stream()
                .filter(s -> s.startsWith(String.valueOf(letter)))
                .count();
    }

    // Метод для поиска второго по величине элемента
    public static Optional<Integer> findSecondLargest(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst();
    }
}

