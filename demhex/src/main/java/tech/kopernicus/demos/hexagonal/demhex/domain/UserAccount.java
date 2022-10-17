package tech.kopernicus.demos.hexagonal.demhex.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserAccount {
    private Long id;
    private String username;
    private String email;

    private List<Agent> agents;
}
