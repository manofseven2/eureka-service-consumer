package com.example.demo.integration;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.ws.rs.QueryParam;
import java.util.Date;
import java.util.List;
import java.util.Map;

@FeignClient(value = "${sample.service.name}", configuration = FeignConfiguration.class)
public interface ThreatFabricServiceClient {
    @RequestMapping(value ="/resources/detections/search", method = RequestMethod.GET)
    List<Map<String, Object>> search(@RequestParam("deviceId")String deviceId, @RequestParam("deviceModel")String deviceModel, @RequestParam("from") String from, @RequestParam("to")String to);
}
