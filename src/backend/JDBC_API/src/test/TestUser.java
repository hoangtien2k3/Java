package src.backend.JDBC_API.src.test;

import src.backend.JDBC_API.src.dao.UserDAO;
import src.backend.JDBC_API.src.model.User;

import java.util.ArrayList;

public class TestUser {
    public static void main(String[] args) {
        User u1 = new User("u1", "u123", "UUU");
        UserDAO.getInstance().insert(u1);

//        User u2 = new User("u2", "u1234", "UUUU");
//        UserDAO.getInstance().insert(u2);

        User u_find = new User("u1", "u123", "UUU");
        System.out.println("___________________________________");

        User u_result = UserDAO.getInstance().selectById(u_find);
        System.out.println(u_result);

//
//        User delete_find = new User("u1", "u123", "UUU");
//        UserDAO.getInstance().delete(delete_find);


    }
}
