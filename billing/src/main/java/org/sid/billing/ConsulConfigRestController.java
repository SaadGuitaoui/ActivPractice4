package org.sid.billing;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
public class ConsulConfigRestController {
    @Value("${token.accessTokenTimeout")
    private long accessTokenTimeout;
    @Value("${token.accessTokenTimeout")

    private long refreshTokenTimeout;
    @GetMapping("/myConfig")
    public Map<String, Object> myConfig(){
        return Map.of("accessTokenTimeout",accessTokenTimeout,"refreshTokenTimeout",refreshTokenTimeout);
    }
}
