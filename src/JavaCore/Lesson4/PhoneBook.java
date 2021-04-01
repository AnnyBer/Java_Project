package JavaCore.Lesson4;

import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {

    HashMap<String, ArrayList<String>> phoneList = new HashMap<>();

    public void add(String tel, String name) {

        if (phoneList.containsKey(name)) {
            var phones = phoneList.get(name);
            phones.add(tel);
        } else {
            var phones = new ArrayList<String>();
            phones.add(tel);
            phoneList.put(name, phones);
        }
    }

    public ArrayList<String> get(String name) {
        return phoneList.get(name);
    }

    @Override
    public String toString() {
        return "Список контактов:" + phoneList;
    }


}
