package tech.kopernicus.demos.hexagonal.demhex.infra.input;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.kopernicus.demos.hexagonal.demhex.infra.output.services.IUserService;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserRestController {
    @Autowired
    private IUserService userService;
    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }

    @GetMapping("/{accountId}/agents")
    public ResponseEntity<?>findAgentsByAccountId(@PathVariable Long accountId) {
        return ResponseEntity.ok(userService.findAgentsByAccountId(accountId));
    }
}
