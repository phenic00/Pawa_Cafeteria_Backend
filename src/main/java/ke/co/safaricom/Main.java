package ke.co.safaricom;

import spark.ModelAndView;

import java.util.HashMap;

import static spark.Spark.*;
import spark.template.handlebars.HandlebarsTemplateEngine;


public class Main {
    public static void main(String[] args) {
        get("/",(request, response) ->{
            return new ModelAndView( new HashMap<>(), "index.hbs");
        },new HandlebarsTemplateEngine());
    }
}