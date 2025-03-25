package sabino.livia.domain.service;

import sabino.livia.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
