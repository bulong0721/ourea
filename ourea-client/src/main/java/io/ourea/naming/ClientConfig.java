package io.ourea.naming;

import feign.Client;
import feign.Feign;
import feign.Request;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import io.ourea.naming.util.RandomUtil;
import lombok.Data;

/**
 * @author 徐步龙
 * @version V1.0.0
 * @date 2021/1/28
 */
@Data
public class ClientConfig {
    private String serverUrl = "http://localhost:8080";
    private String clientId = RandomUtil.getRandomStr();
    private Client feignClient;
    private Encoder encoder = new GsonEncoder();
    private Decoder decoder = new GsonDecoder();
    private int pollingMills = 30000;

    public static ClientConfig defaultConfig(String serverUrl) {
        ClientConfig config = new ClientConfig();
        config.serverUrl = serverUrl;
        return config;
    }

    public <T> T createService(Class<T> serviceItf, int connectTimeoutMillis, int readTimeoutMillis) {
        Request.Options options = new Request.Options(connectTimeoutMillis, readTimeoutMillis);
        return createService(serviceItf, options);
    }

    public <T> T createService(Class<T> serviceItf) {
        return createService(serviceItf, null);
    }

    public <T> T createService(Class<T> serviceItf, Request.Options options) {
        Feign.Builder builder = Feign.builder();
        if (null != encoder) {
            builder.encoder(encoder);
        }
        if (null != decoder) {
            builder.decoder(decoder);
        }
        if (null != feignClient) {
            builder.client(feignClient);
        }
        if (null != options) {
            builder.options(options);
        }
        return builder.target(serviceItf, serverUrl);
    }
}
