package controllers;

import play.mvc.Controller;
import play.mvc.Result;
/**
 * Created by jrichiemx on 6/23/16.
 */
public class HolaController extends Controller {

    public Result sayHola() {
        return ok("It works!");
    }

}
