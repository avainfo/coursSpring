package fr.avainfo.fistwebsite.managers;

import java.lang.reflect.Field;
import java.util.*;

public class RoleManagers {

    public Roles getRole(User sqlUser) {
        int length = Roles.values()[0].toArray().length;
        boolean[] arr = new boolean[length];
        int i = 0;
        for(Field field : sqlUser.getClass().getDeclaredFields()) {
            if(!field.getName().equals("personID")) {
                try {
                    arr[i] = (!Objects.equals(field.get(sqlUser).toString(), "NR"));
                } catch(IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
                i++;
            }
        }
        for(Roles role : Roles.values()) {
            if(Arrays.equals(arr, role.toArray()))
                return role;
        }
        return Roles.UNDEFINED;
    }
}
