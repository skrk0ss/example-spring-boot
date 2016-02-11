package spring.boot.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import spring.boot.example.domain.User;
import spring.boot.example.mapper.UserMapper;

@Service
public class UserService implements UserDetailsService {

  @Autowired
  private UserMapper userMapper;

  @Override
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    User user = userMapper.getByEmail(email);
    return new LoginUserDetails(user);
  }

  public int merge(User user) {
    if (userMapper.get(user.getId()) != null) {
      return userMapper.update(user);
    }
    return userMapper.create(user);
  }

  public User getUser(String userId) {
    return userMapper.get(userId);
  }

  public void delete(String userId) {
    userMapper.delete(userId);
  }
}
