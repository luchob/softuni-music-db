package bg.softuni.musicdb.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class ApplicationConfig {

  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }

  @Bean
  public PasswordEncoder create() {
    return new BCryptPasswordEncoder();
  }

  @Bean
  public Gson gson() {
    return new GsonBuilder().
        excludeFieldsWithoutExposeAnnotation().
        create();
  }

}
