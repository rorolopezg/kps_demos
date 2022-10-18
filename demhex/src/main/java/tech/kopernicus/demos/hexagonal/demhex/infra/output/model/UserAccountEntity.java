package tech.kopernicus.demos.hexagonal.demhex.infra.output.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "P_USER_ACCOUNTS")
public class UserAccountEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "ACCOUNT_ID")
    private Long id;

    @Column(name = "USER_NAME")
    private String username;
    @Column(name = "USER_EMAIL")
    private String email;
    @Column(name = "LANGUAGE")
    private String language;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "LOCK_ACCOUNT")
    private String lockAccount;
    @Column(name = "LOCK_ACCOUNT_DATE")
    private Date lockAccountDate;
    @Column(name = "CHANGE_PWD")
    private String changePwd;
    @Column(name = "PWD_EXPIRE_DATE")
    private String pwdExpireDate;

    @OneToMany(mappedBy = "userAccount")
    @JsonIgnore
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLockAccount() {
        return lockAccount;
    }

    public void setLockAccount(String lockAccount) {
        this.lockAccount = lockAccount;
    }

    public Date getLockAccountDate() {
        return lockAccountDate;
    }

    public void setLockAccountDate(Date lockAccountDate) {
        this.lockAccountDate = lockAccountDate;
    }

    public String getChangePwd() {
        return changePwd;
    }

    public void setChangePwd(String changePwd) {
        this.changePwd = changePwd;
    }

    public String getPwdExpireDate() {
        return pwdExpireDate;
    }

    public void setPwdExpireDate(String pwdExpireDate) {
        this.pwdExpireDate = pwdExpireDate;
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
