package tech.kopernicus.demos.hexagonal.demhex.infra.output.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "P_ACCOUNT_AGENTS")
public class AccountAgentsEntity implements Serializable {
    /*
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
     */

    @Id
    @ManyToOne
    @JoinColumn(name = "ACCOUNT_ID")
    @JsonIgnore
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private UserAccountEntity userAccount;

    @Id
    @ManyToOne
    @JoinColumn(name = "AGENT_ID")
    @JsonIgnore
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private AgentEntity agent;

    /*
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    */

    public UserAccountEntity getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccountEntity userAccount) {
        this.userAccount = userAccount;
    }

    public AgentEntity getAgent() {
        return agent;
    }

    public void setAgent(AgentEntity agent) {
        this.agent = agent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AccountAgentsEntity that)) return false;
        return Objects.equals(userAccount, that.userAccount) && Objects.equals(agent, that.agent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userAccount, agent);
    }
}
