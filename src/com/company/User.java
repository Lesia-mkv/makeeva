package com.company;

/**
 * Created by student on 6/12/2018.
 */
public class User {
    private String login, password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public class Query {
        public void printToLog() {
            System.out.printf("Пользователь %s с паролем %s отправил запрос \n", login, password);
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public static void main(String[] args) {
        User user1 = new User("login1", "password1");
        user1.createQuery();

        User.Query query1 = user1.new Query();
        query1.printToLog();

        User.Query query2= new  User("login3", "password3").new Query();
        query2.printToLog();
    }

}
