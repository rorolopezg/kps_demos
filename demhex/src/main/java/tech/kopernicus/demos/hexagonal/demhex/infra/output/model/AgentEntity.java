package tech.kopernicus.demos.hexagonal.demhex.infra.output.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "P_AGENTS")
public class AgentEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AGENT_ID")
    private Long id;
    @Column(name = "AGENT_NO")
    private String agentNo;

    @Column(name = "AGENT_TYPE")
    private String agentType;

    @Column(name = "AGENT_STATE")
    private Integer agentState;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAgentNo() {
        return agentNo;
    }

    public void setAgentNo(String agentNo) {
        this.agentNo = agentNo;
    }

    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    public Integer getAgentState() {
        return agentState;
    }

    public void setAgentState(Integer agentState) {
        this.agentState = agentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AgentEntity that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
