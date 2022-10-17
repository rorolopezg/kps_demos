package tech.kopernicus.demos.hexagonal.demhex.infra.output.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.kopernicus.demos.hexagonal.demhex.infra.output.model.UserAccountEntity;

public interface IUserRepository extends JpaRepository<UserAccountEntity, Long> {
}
