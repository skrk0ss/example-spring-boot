package spring.boot.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.boot.example.domain.User;

public interface UserRepository extends JpaRepository<User, String> {

}
