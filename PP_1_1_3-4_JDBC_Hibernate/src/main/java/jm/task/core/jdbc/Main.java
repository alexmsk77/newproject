package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Petr", "Ivanov", (byte) 45);
        userService.saveUser("Alex", "Denisov", (byte) 24);
        userService.saveUser("Denis", "Petrov", (byte) 34);
        userService.saveUser("Ivan", "Novikov", (byte) 63);
        userService.getAllUsers().forEach(System.out::println);
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}