package raphdine.test.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import raphdine.test.api.ITest;
import raphdine.test.api.InputDto;

/**
 *
 * @author Raphiki
 */
public class NewEmptyJUnitTest {

    private ITest tested;

    @Before
    public void setUp() {

        tested = new TestDelegate().getDelegue();

    }

    @Test
    public void hello() throws Exception {
//        Thread.sleep(10000);
        String retour = tested.helloWorld();
        InputDto o = new InputDto();
        o.setTexte("coucou");
       tested.test(o);

        Assert.assertEquals("Hello world", retour);
    }
}
