package spring.boot.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.boot.example.domain.Board;
import spring.boot.example.mapper.BoardMapper;

@Service
public class BoardService {

  @Autowired
  private BoardMapper boardMapper;

  public Board get(int id) {
    return boardMapper.get(id);
  }

  public int merge(Board board) {
    return boardMapper.create(board);
  }
  
  public List<Board> getAll(){
	  return boardMapper.getAll();
  }

}
