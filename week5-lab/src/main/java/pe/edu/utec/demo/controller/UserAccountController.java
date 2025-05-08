package pe.edu.utec.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.utec.demo.domain.UserAccount;
import pe.edu.utec.demo.domain.UserAccountService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserAccountController {
    @Autowired
    UserAccountService service;

    @GetMapping
    public ResponseEntity<List<UserAccount>> list() {
        return ResponseEntity.ok(service.list());
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody UserAccount user) {
        service.save(user);

        return ResponseEntity.ok().build();
    }
}
