package tech.kopernicus.demos.hexagonal.demhex.infra.input;

import tech.kopernicus.demos.hexagonal.demhex.domain.UserAccount;

import java.util.List;
import java.util.Optional;

public interface IUserAccountInputPort {
    Optional<UserAccount> findUserAcountById(Long id);
    List<UserAccount> findUserAcountsByUserName(String username);
    List<UserAccount> findUserAcountsByEmail(String email);
    List<UserAccount> findAllUserAcounts();
    UserAccount saveUser(UserAccount userAccount);
    void deleteUser(Long id);
}
