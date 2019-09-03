package io.ikka.openshift.example.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class CurrentLocalDateTimeController {

    @GetMapping(value = "/time")
    public ResponseEntity<?> currentTime() {
        return ResponseEntity.ok(LocalDateTime.now().toString());
    }
}
