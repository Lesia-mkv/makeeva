package com.company;

/**
 * Created by Student on 13.06.2018.
 */
public class User2 {

    private static String login = "login1", password = "password1";

    public static void initializeData(String login, String password) {
        User2.login = login;
        User2.password = password;
    }


    public static class Query {
        public void printToLog() {
            System.out.printf("Пользователь %s с паролем %s отправил запрос \n", login, password);
        }
    }

   /* public void createQuery() {
        com.company.User.Query query = new com.company.User.Query();
        query.printToLog();
        class Query {
            public void printToLog() {
                System.out.printf("User %s with password %s send query\n", login, password);
            }
        }
    }*/


    @Override
    public String toString() {
        return "User2";
    }

    public static void main(String[] args) {
        User2.Query query = new User2.Query();
        query.printToLog();
    }
}


