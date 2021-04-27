package JavaHomeWork.Lesson3HW;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

//        1) Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);


        String[] array = {"1", "2", "3", "4", "5", "6"};


        System.out.println("Изначальный массив = " + Arrays.toString(array));

        changeElements(array, 3, 5);

        System.out.println("Массив после замены = " + Arrays.toString(array));

//      2) Задача:

        Box<Apple> box1 = new Box<>();
        Box<Orange> box2 = new Box<>();

        for (int i = 0; i < 5; i++) {
            box1.toAdd(new Apple());
        }
        for (int i = 0; i < 5; i++) {
            box2.toAdd(new Orange());
        }

        System.out.println("Коробка 1 весит " + box1.getWeight() + " и содержит " + box1.getType() + ".");
        System.out.println("Коробка 2 весит " + box2.getWeight() + " и содержит " + box2.getType() + ".");
        System.out.println("Коробки 1 и 2 равны: " + box1.compare(box2));


        Box<Apple> box3 = new Box<>();
        Box<Orange> box4 = new Box<>();

        for (int i = 0; i < 6; i++) {
            box3.toAdd(new Apple());
        }
        for (int i = 0; i < 4; i++) {
            box4.toAdd(new Orange());
        }

        System.out.println("Коробки 3 и 4 равны: " + box3.compare(box4));

        System.out.println("Пересыпаем из коробки 1 в коробку 3 ");
        box1.replace(box3);
        System.out.println("Коробка 3 весит " + box3.getWeight() + " и содержит " + box3.getType() + ".");


    }



    private static <T> void changeElements(T[] array, int changeFrom, int changeTo) {
        T i = array[changeFrom];
        array[changeFrom] = array[changeTo];
        array[changeTo] = i;
    }


}

