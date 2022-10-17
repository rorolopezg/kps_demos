package tech.kopernicus.demos.hexagonal.demhex.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Agent {
    private Long id;
    private String name;
    private String familyName;
}
