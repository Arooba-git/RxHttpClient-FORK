package be.wegenenverkeer.rxhttp;

/**
 * Created by Karel Maesen, Geovise BVBA on 2019-06-25.
 */
public interface ClientRequestLogFormatter {

    String toLogMessage(ClientRequest request);
}
