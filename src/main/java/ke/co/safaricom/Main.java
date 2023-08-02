package ke.co.safaricom;

import spark.ModelAndView;

import java.util.HashMap;

import static spark.Spark.*;
import spark.template.handlebars.HandlebarsTemplateEngine;


public class Main {
    public static void main(String[] args) {
        get("/", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "index.hbs");
        }, new HandlebarsTemplateEngine());
        get("/login", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "login.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/login-legit", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "login-legit.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/login-reveal-password", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "login-reveal-password.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/forgot-password", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "forgot-password.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/reset-password", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "reset-password.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/register", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "register.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/admin-dashboard", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "admin-dashboard.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/main-dashboard", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "main-dashboard.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/anonymous-dashboard", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "anonymous-dashboard.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/all", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "all.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/chefs-special", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "chefs-special.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/breakfast", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "breakfast.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/lunch", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "lunch.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/halaal", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "halaal.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());
        get("/vegetarian", (request, response) -> {
            return new ModelAndView(new HashMap<>(), "vegetarian.hbs");//add the functionality. add post for login.
        }, new HandlebarsTemplateEngine());


    }
}