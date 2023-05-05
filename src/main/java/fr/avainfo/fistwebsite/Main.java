package fr.avainfo.fistwebsite;

import fr.avainfo.fistwebsite.managers.RoleManagers;
import fr.avainfo.fistwebsite.managers.Roles;
import fr.avainfo.fistwebsite.managers.User;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {


        User sqlUser = new User(3, "dev", "NR", "Marie-Josette", "NR");
        Roles r = new RoleManagers().getRole(sqlUser);
        System.out.println(r.name());
    }
}
