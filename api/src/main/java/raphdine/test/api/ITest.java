package raphdine.test.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Raphiki
 */
@Path("test")
public interface ITest {

    @POST
    @Path("go")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    OutputDto test(InputDto o);

    @GET
    @Path("helloworld")
    String helloWorld();

}
