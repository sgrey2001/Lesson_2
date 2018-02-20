package com.itea.grey.lesson2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by grey on 2/19/18.
 */

public class Checker {
private String login;
private String password;

    public Checker(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean checkLogin(String login){
        Pattern log = Pattern.compile("([a-zA-Z][\\w]*)@([a-zA-Z][\\w]*[.])*([a-zA-Z][\\w]*[.][a-zA-Z][\\w]*)");
        Matcher email = log.matcher(login);
        if (email.matches()){
            return true;
        } else {
            return false;
        }
    }

    public boolean checkPassword(String password){
        Pattern log = Pattern.compile("[0-9]+");
        Matcher pass = log.matcher(password);
        if (pass.matches()){
            return true;
        } else {
            return false;
        }
    }
}
