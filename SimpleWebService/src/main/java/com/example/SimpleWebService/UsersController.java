package com.example.SimpleWebService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class UsersController {
    @PostMapping("/tomilov")
    public ResponseEntity<?> PostRequest(@RequestBody User request) {
        String message = "Привет, " + request.getName() + ". Твой номер в очереди - " + request.getNumber() + ". Стой, не спеши...";
        Map<String, Object> mess = new HashMap<>();
        mess.put("Уведомление для Вас: ", message);
        return ResponseEntity.ok(mess);
    }

}


