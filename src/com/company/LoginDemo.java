package com.company;

/**
 * Created by student on 24-Jun-18.
 */
public class LoginDemo {

    public static void main(String[] args) {

        System.out.println(loginDemo("myLogin", "myPassword", "myPassword") + "\n");
        System.out.println(loginDemo("myLoginmyLoginmyLoginmyLogin", "myPassword", "myPassword") + "\n");
        System.out.println(loginDemo("myLoginmyLogin11111111", "myPassword", "myPassword") + "\n");
        System.out.println(loginDemo("myLoginmyLogin", "myPassword111111111111111", "myPassword") + "\n");
    }


    private static boolean loginDemo(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Login more  than 20.");
            }
            if (password.length() > 20) {
                throw new WrongPasswordException("Password is not correct");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.println(login + "" + password + "" + confirmPassword);
        }
        return true;
    }


}
