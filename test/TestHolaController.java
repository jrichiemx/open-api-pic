import controllers.HolaController;
import play.Application;
import play.api.inject.guice.GuiceApplicationBuilder;
import play.test.WithApplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.*;

import org.junit.Test;


/**
 * Created by jrichiemx on 8/15/16.
 */

public class TestHolaController extends WithApplication {


    @Test
    public void testIndex() {
        play.mvc.Result result = new HolaController().sayHola();
        assertEquals(OK, result.status());
        assertTrue(contentAsString(result).contains("It works!"));
    }

}