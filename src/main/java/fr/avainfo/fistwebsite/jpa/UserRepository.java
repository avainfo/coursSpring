package fr.avainfo.fistwebsite.jpa;

import fr.avainfo.fistwebsite.mvc.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
