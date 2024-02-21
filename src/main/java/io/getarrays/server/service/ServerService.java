package io.getarrays.server.service;

import io.getarrays.server.model.Server;

import java.io.IOException;
import java.util.Collection;

public interface ServerService {
    Server create(Server server) throws Exception;
    Server ping(String ipAddress) throws IOException;
    Collection<Server> list(int limit); // the number of servers to be retrieved
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
