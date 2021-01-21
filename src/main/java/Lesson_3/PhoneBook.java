package Lesson_3;


import java.util.TreeMap;

public class PhoneBook {
    private final TreeMap<String, String> Data = new TreeMap<>();

    public void add(String key, String value) {
        if (!(Data.containsKey(key))) {
            Data.put(key, value);
        } else {
            Data.put(key, String.format("%s\n\t%s", Data.get(key), value));
        }
    }

    public String get(String key) {
        if (Data.containsKey(key)) {
            return String.format("Name: %s\nPhones:%s", key, Data.get(key));
        }
        return String.format("Subscriber %s not found.\n", key);
    }

}
