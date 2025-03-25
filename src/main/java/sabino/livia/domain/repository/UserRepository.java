package sabino.livia.domain.repository;

import sabino.livia.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

  boolean exists(String email);

}
