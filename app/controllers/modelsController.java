package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import models.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.BodyParser;
import play.mvc.Controller;
import play.mvc.Result;




public class modelsController extends Controller {
    @Inject
    FormFactory formFactory;
    @BodyParser.Of(BodyParser.Json.class)
    public Result insertData(){
        JsonNode jsonNode=request().body().asJson();
        Form<User> form;
        form = formFactory.form(User.class).bind(jsonNode,
                "username", "password");
        User user=form.get();
        System.out.println(user);
        return ok();
    }
}
