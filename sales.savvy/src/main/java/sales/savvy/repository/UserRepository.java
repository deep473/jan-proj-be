package sales.savvy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sales.savvy.entity.User;

public interface UserRepository 
				extends JpaRepository<User, Long>	{

	User findByUsername(String username);

}
