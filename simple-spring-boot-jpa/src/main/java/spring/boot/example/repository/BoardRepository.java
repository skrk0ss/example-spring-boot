package spring.boot.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.boot.example.domain.Board;

public interface BoardRepository extends JpaRepository<Board, Integer> {

}
