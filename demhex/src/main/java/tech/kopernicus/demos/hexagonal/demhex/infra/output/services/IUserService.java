package tech.kopernicus.demos.hexagonal.demhex.infra.output.services;


import tech.kopernicus.demos.hexagonal.demhex.infra.output.model.AgentEntity;
import tech.kopernicus.demos.hexagonal.demhex.infra.output.model.UserAccountEntity;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    Optional<UserAccountEntity> findUserAcountById(Long id);
    List<UserAccountEntity> findUserAcountsByUserName(String username);
    List<UserAccountEntity> findUserAcountsByEmail(String email);
    List<UserAccountEntity> findAll();
    List<AgentEntity> findAgentsByAccountId(Long accountId);
    UserAccountEntity saveUser(UserAccountEntity userAccount);
    void deleteUser(Long id);
}
