package JavaHomeWork.Lesson3HW;

// * Класс Box, в который можно складывать фрукты.
// Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    public List<T> getList() {
        return list;
    }

    public Box() {
        list = new ArrayList<T>();
    }


    private List<T> list;

    public Box(T... object) {
        list = Arrays.asList(object);
    }



//* Сделать метод getWeight(), который высчитывает вес коробки,
// зная вес одного фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);

    float getWeight() {
        return list.size() * list.get(0).getWeight();
    }

//    * Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
//    которую подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
//    Можно сравнивать коробки с яблоками и апельсинами;


    boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    String getType() {
        return list.get(0).getType();
    }
//* Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
// Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
// Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;

    void replace (Box<T> box) {
        box.getList().addAll(list);
        list.clear();
    }


// * Не забываем про метод добавления фрукта в коробку.**
    void toAdd(T object) {
        list.add(object);
    }



}
