package tech.kopernicus.demos.hexagonal.demhex.infra.output.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.kopernicus.demos.hexagonal.demhex.infra.output.model.AgentEntity;
import tech.kopernicus.demos.hexagonal.demhex.infra.output.model.UserAccountEntity;
import tech.kopernicus.demos.hexagonal.demhex.infra.output.repositories.IUserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public Optional<UserAccountEntity> findUserAcountById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<UserAccountEntity> findUserAcountsByUserName(String username) {
        return null;
    }

    @Override
    public List<UserAccountEntity> findUserAcountsByEmail(String email) {
        return null;
    }

    @Override
    public List<UserAccountEntity> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<AgentEntity> findAgentsByAccountId(Long accountId) {
        return userRepository.findAgentsByAccountId(accountId);
    }

    @Override
    public UserAccountEntity saveUser(UserAccountEntity userAccount) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
