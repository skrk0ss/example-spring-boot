package spring.boot.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.hibernate.annotations.GenericGenerator;

import spring.boot.example.util.CommonUtils;

@Entity
@Table(name = "mt_user")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@Id
	@GenericGenerator(name = "uuid", strategy = "uuid")
	@GeneratedValue(generator = "uuid")
	private String id;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false, unique = true)
	private String email;

	@Column
	private boolean status;

	@Column
	@Enumerated(EnumType.STRING)
	private Role role;

	@Column(name = "created_dt", insertable = true, updatable = true)
	private Date createdDate;

	@Column(name = "updated_dt", insertable = true, updatable = true)
	private Date updatedDate;

	public User(String email, String password) {
		this.id = CommonUtils.getRandomString();
		this.email = email;
		this.status = true;
		this.createdDate = new Date();
		this.role = Role.ADMIN;
	}

	public static User newInstance(String email, String password) {
		return new User(email, password);
	}
}
