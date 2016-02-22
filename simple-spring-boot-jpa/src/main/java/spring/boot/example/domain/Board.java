package spring.boot.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import spring.boot.example.vo.BoardRequestVO;

@Entity
@Table(name = "bt_board")
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Board {

	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@Column
	private String title;

	@Lob
	@Column(name = "contents")
	private String contents;

	@Column
	private Integer hits;

	@Column(name = "enabled", nullable = false)
	private boolean enabled;

	@Column(name = "created_dt", insertable = true, updatable = true)
	private Date createdDate;

	@Column(name = "updated_dt", insertable = true, updatable = true)
	private Date updatedDate;

	public Board(BoardRequestVO boardRequestVO, User user){
		this.user = user;
		this.title = boardRequestVO.getTitle();
		this.contents = boardRequestVO.getContents();
		this.hits = 0;
	}

}
