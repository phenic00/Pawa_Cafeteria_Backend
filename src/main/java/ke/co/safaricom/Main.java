package ke.co.safaricom;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;


import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {

        staticFileLocation("/public");

        get("/",(request, response) ->{
            return new ModelAndView( new HashMap<>(), "index.hbs");
        },new HandlebarsTemplateEngine());

    }
}
