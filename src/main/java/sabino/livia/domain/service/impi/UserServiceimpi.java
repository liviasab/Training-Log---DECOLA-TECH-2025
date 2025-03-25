package sabino.livia.domain.service.impi;

import sabino.livia.domain.model.User;
import sabino.livia.domain.repository.UserRepository;
import sabino.livia.domain.service.UserService;

import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceimpi implements UserService {

    private final UserRepository userRepository;

    public UserServiceimpi(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.exists(userToCreate.getEmail())) {
            throw new IllegalArgumentException("This email is already registered.");
        }
        return userRepository.save(userToCreate);
    }
}
