package Exceptions;

public class Main {


    public static void check(String login, String password, String confirmPassword) {
        if (!login.matches("[a-zA-Z0-9_]+")) {
            throw new WrongLoginException("Login must contain letters, numbers and underline");
        }

        if (login.length() > 20) {
            throw new WrongLoginException();
        }

        if (!password.matches("\\w+")) {
            throw new RuntimeException("Password must contain letters, numbers and underline");
        }

        if (!(password.length() < 20)) {
            throw new WrongPasswordException("Password must be less then 20 symbols");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }


    public static void main(String[] args) {
        String login = "java_skypro_go5";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";


        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException t) {
            System.out.println(t.getMessage());
        } finally {
            System.out.println("Good luck");
        }


    }

}