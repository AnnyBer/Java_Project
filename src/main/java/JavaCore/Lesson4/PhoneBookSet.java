package JavaCore.Lesson4;

import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;

public class PhoneBookSet {
    HashMap<String, Set<String>> phoneList = new HashMap<>();

    public void add(String tel, String name) {

        if (phoneList.containsKey(name)) {
            var phones = phoneList.get(name);
            phones.add(tel);
        } else {
            var phones = new HashSet<String>();
            phones.add(tel);
            phoneList.put(name, phones);
        }
    }

    public Set<String> get(String name) {
        return phoneList.get(name);
    }

    @Override
    public String toString() {
        return "Список контактов:" + phoneList;
    }

}
