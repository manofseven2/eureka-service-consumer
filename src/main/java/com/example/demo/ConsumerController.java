package com.example.demo;

import com.example.demo.integration.ThreatFabricServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class ConsumerController {
    @Autowired
    private ThreatFabricServiceClient client;
    @GetMapping("/meeting")
    public ResponseEntity<String> greeting(){
        return ResponseEntity.ok("hello");
    }

    @GetMapping(value = "search", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Map<String, Object>>> search(){
        return ResponseEntity.ok(client.search("", "", "2020-10-01", "2021-10-01"));
//        return ResponseEntity.ok().body(new ArrayList<>());
    }
}
