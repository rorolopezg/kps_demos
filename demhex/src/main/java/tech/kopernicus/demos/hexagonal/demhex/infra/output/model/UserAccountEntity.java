package tech.kopernicus.demos.hexagonal.demhex.infra.output.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@Table(name = "P_USER_ACCOUNT")
public class UserAccountEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "user_account_id")
    private Long id;
    private String username;
    private String email;

    @OneToMany(mappedBy = "userAccount")
    @JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"}, allowSetters = true)
    private List<AccountAgentsEntity> accountAgents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<AccountAgentsEntity> getAccountAgents() {
        return accountAgents;
    }

    public void setAccountAgents(List<AccountAgentsEntity> accountAgents) {
        this.accountAgents = accountAgents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserAccountEntity that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
