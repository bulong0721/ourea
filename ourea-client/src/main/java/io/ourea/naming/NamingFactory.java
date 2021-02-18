package io.ourea.naming;


import io.ourea.naming.api.NamingClient;
import io.ourea.naming.exception.NamingException;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/2/7
 */
public class NamingFactory {

    public static NamingClient createClient(String serverUrl) throws NamingException {
        ClientConfig config = ClientConfig.defaultConfig(serverUrl);
        DefaultClient client = new DefaultClient(config);
        client.startup();
        return client;
    }
}
