package be.wegenenverkeer.rx.client;

import be.wegenenverkeer.UsingWiremock;
import be.wegenenverkeer.rxhttp.RxHttpClient;

import be.wegenenverkeer.rxhttp.rxstreams.RxStreamsHttpClient;
import org.junit.AfterClass;
import org.junit.BeforeClass;

/**
 * Created by Karel Maesen, Geovise BVBA on 18/04/2020.
 */
abstract public class UsingWiremockRxStreams extends UsingWiremock {
    public static RxHttpClient client;

    @BeforeClass
    public static void setUpAndStartServer() {
        client = new RxStreamsHttpClient.Builder()
                .setRequestTimeout(REQUEST_TIME_OUT)
                .setMaxConnections(3)
                .setAccept("application/json")
                .setBaseUrl("http://localhost:" + port)
                .build();
    }

    @AfterClass
    public static void stopServer() {
        client.close();
    }
}
