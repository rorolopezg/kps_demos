package tech.kopernicus.demos.hexagonal.demhex.domain;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class UserAccount {
    private Long id;
    private String username;
    private String email;

    private List<Agent> agents;

    public void addAgent(Agent agent) {
        if (agents == null)
            agents = new ArrayList<>();
        agents.add(agent);
    }

    public void remove(Agent agent) {
        if (agents == null)
            return;
        agents.remove(agent);
    }

    public boolean hasAgent(Agent agent) {
        return agents.contains(agent);
    }
}
