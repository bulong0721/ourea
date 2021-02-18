import io.ourea.naming.NamingFactory;
import io.ourea.naming.api.NamingClient;
import io.ourea.naming.pojo.Instance;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/17
 */
public class DefaultClientTest {
    private NamingClient client;

    @Before
    public void setUp() throws Exception {
        client = NamingFactory.createClient("http://localhost:8080");
    }

    @Test
    public void testRegister() {
        Instance instance = new Instance();
        instance.setIp("localhost");
        instance.setServiceName("b");
        instance.setPort(9000);
        client.register("b", instance);

        Set<String> keys = new HashSet<>();
        keys.add("a");
        keys.add("b");

        Map<String, Set<Instance>> entity = client.lookup(keys);
        Assert.assertEquals(2, entity.size());
    }

    @Test
    public void testSubscribe() throws InterruptedException {
        client.subscribe("b", event -> {
            System.out.println(event.getService());
            System.out.println(event.getInstances());
        });
        new CountDownLatch(1).await();
    }

    @After
    public void tearDown() throws Exception {
    }
}
