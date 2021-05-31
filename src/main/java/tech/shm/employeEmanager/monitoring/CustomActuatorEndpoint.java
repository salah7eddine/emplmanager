package tech.shm.employeEmanager.monitoring;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Endpoint(id="custom")
@Component
public class CustomActuatorEndpoint {

    @ReadOperation
    public Object customEndpoint(String username) {
        Map<String, String> map = new HashMap<>();
        map.put("key", "Value");
        map.put("Username", username);
        return map;
    }
}
