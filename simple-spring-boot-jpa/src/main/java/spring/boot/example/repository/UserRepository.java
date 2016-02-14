package spring.boot.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import spring.boot.example.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
