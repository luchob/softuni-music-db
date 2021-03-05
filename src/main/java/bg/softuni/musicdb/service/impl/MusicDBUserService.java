package bg.softuni.musicdb.service.impl;

import bg.softuni.musicdb.model.entities.UserEntity;
import bg.softuni.musicdb.repository.UserRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class MusicDBUserService implements UserDetailsService {

  private final UserRepository userRepository;

  public MusicDBUserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    bg.softuni.musicdb.model.entities.UserEntity userEntity = userRepository.
        findByUsername(username).
        orElseThrow(() -> new UsernameNotFoundException("User with name " + username + " was not found!"));

    return mapToUserDetails(userEntity);
  }

  private UserDetails mapToUserDetails(UserEntity userEntity) {
    List<GrantedAuthority> authorities =
        userEntity.
            getRoles().
            stream().
            map(r -> new SimpleGrantedAuthority("ROLE_" + r.getRole().name())).
            collect(Collectors.toList());

    return new User(
        userEntity.getUsername(),
        userEntity.getPassword(),
        authorities
    );
  }
}
