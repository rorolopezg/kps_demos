package tech.kopernicus.demos.hexagonal.demhex.infra.output.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tech.kopernicus.demos.hexagonal.demhex.infra.output.model.AgentEntity;
import tech.kopernicus.demos.hexagonal.demhex.infra.output.model.UserAccountEntity;

import java.util.List;

public interface IUserRepository extends JpaRepository<UserAccountEntity, Long> {
    @Query(value = "select aa.agent from AccountAgentsEntity aa where aa.userAccount.id = :accountId")
    List<AgentEntity> findAgentsByAccountId(@Param("accountId") Long accountId);
}
