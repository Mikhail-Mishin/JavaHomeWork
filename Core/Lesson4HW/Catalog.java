package JavaHomeWork.Core.Lesson4HW;

// 2. Написать простой класс Телефонный Справочник

import java.util.*;

public class Catalog {

    private HashMap<String, List<String>> catalog;

    public Catalog() {
        this.catalog = new HashMap<>();
    }

//  который хранит в себе список фамилий и телефонных номеров
//В этот телефонный справочник с помощью метода add() можно добавлять записи

/*
    public void add(String surname, String phoneNumber){
        catalog.put(surname, new ArrayList<>(Arrays.asList(phoneNumber)));
    }
*/

    public void add(String surname, String phoneNumber) {
        if(catalog.containsKey(surname)){
            List<String> numbers = catalog.get(surname);
            if(!numbers.contains(phoneNumber)){
                numbers.add(phoneNumber);
            }
        } else {
            catalog.put(surname, new ArrayList<>(Arrays.asList(phoneNumber)));
        }
    }

    public boolean getAll() {
        for(Map.Entry<String, List<String>> all : catalog.entrySet()){
            System.out.println(all.getKey() + all.getValue());
        }
        return true;
    }


    //а с помощью метода get() искать номер телефона по фамилии
    public List<String> get(String surname) {
        if(catalog.containsKey(surname)){
            return catalog.get(surname);
        } else {
            System.out.println("Не найдено");
            return catalog.get(surname);
        }
    }

}
