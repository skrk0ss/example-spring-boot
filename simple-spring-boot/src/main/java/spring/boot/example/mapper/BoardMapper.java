package spring.boot.example.mapper;

import java.util.List;

import spring.boot.example.domain.Board;

public interface BoardMapper {

  public Board get(int id);

  public int create(Board board);
  
  public List<Board> getAll();

}
