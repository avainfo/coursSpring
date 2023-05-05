package fr.avainfo.fistwebsite.mvc;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class UserManager {

    public static ArrayList<String[]> users = new ArrayList<>();

    public static void addUsers(User user) {
        String[] fields = new String[user.getClass().getDeclaredFields().length];
        int i = 0;
        for(Field field : user.getClass().getDeclaredFields()) {
            try {
                field.setAccessible(true);
                fields[i++] = (String) field.get(user);
            } catch(IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        users.add(fields);
    }

    public void enumerate() {
        for(String[] user : users) {
            for(String s : user) {
                System.out.println(s);
            }
        }
    }




}
