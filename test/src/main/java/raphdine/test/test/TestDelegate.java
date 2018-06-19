package raphdine.test.test;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import raphdine.test.api.ITest;

/**
 *
 * @author Raphiki
 */
public class TestDelegate {

    private ITest delegue;

    public TestDelegate() {

        ResteasyClient client = new ResteasyClientBuilder().build();
        ResteasyWebTarget target = client.target("http://localhost:8080/app");

        delegue = target.proxy(ITest.class);
    }

    /**
     * @return the delegue
     */
    public ITest getDelegue() {
        return delegue;
    }

    /**
     * @param delegue the delegue to set
     */
    public void setDelegue(ITest delegue) {
        this.delegue = delegue;
    }

}
