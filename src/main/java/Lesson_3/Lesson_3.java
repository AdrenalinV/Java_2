package Lesson_3;

import java.util.TreeMap;

public class Lesson_3 {
    /*
     * 1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
     * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
     *  Посчитать сколько раз встречается каждое слово.
     * 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и
     * телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи.
     * С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией
     *  может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
     *  выводиться все телефоны. Желательно как можно меньше добавлять своего, чего нет в задании
     * (т.е. не надо в телефонную запись добавлять еще дополнительные поля (имя, отчество, адрес),
     * делать взаимодействие с пользователем через консоль и т.д.). Консоль желательно не использовать
     * (в том числе Scanner), тестировать просто из метода main() прописывая add() и get().
     */
    public static void main(String[] args) {
        String[] words = new String[]{"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "six",
                "three", "one", "three", "four", "five", "two", "three", "four", "one"};
        TreeMap<String, Integer> map = new TreeMap<>();

        for (String word : words) {
            if (!(map.containsKey(word))) {
                map.put(word, 1);
            } else {
                map.put(word, map.get(word) + 1);
            }
        }
        System.out.println(map);
        System.out.println();
        PhoneBook Phone = new PhoneBook();
        Phone.add("Vadim", "+7234567890");
        Phone.add("Masha", "+7986745213");
        Phone.add("Bob", "+7365897410");
        Phone.add("Vadim", "+7589321470");
        Phone.add("Ksysha", "+7234569870");


        System.out.println(Phone.get("Bob"));
        System.out.println(Phone.get("Masha"));
        System.out.println(Phone.get("Vadim"));
        System.out.println(Phone.get("Max"));
    }
}
