package JavaHomeWork.Core.Lesson4HW;

import java.util.*;

public class Main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
        List<String> words = Arrays.asList(
                "Яблоко",
                "Груша",
                "Банан",
                "Папайа",
                "Картофель", //5
                "Томат",
                "Банан",
                "Рамбутан",
                "Груша",
                "Батат", //10
                "Папайа",
                "Яблоко",
                "Сельдерей",
                "Картофель",
                "Груша"); //15

//  Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println("Неповторяющиеся слова: " + uniqueWords.toString());

// Посчитать, сколько раз встречается каждое слово.
        for (String key : uniqueWords)
        System.out.print(key + " - " + Collections.frequency(words, key) + ". ");

        System.out.println();
        System.out.println("-----------------------------------------");

//Телефонный Справочник
        Catalog catalog = new Catalog();
        catalog.add("Hatfield", "1112233");
        catalog.add("Hammet", "2223344");
        catalog.add("ULrich", "3334455");
        catalog.add("Burton", "4445566");
        catalog.add("Hatfield", "5556677");
        catalog.add("Hammet", "6667788");

        System.out.println(catalog.getAll());


        System.out.println(catalog.get("Hammet"));







    }
}

