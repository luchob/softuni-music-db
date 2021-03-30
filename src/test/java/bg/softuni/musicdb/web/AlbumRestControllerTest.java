package bg.softuni.musicdb.web;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import bg.softuni.musicdb.repository.AlbumRepository;
import bg.softuni.musicdb.repository.ArtistRepository;
import bg.softuni.musicdb.repository.LogRepository;
import bg.softuni.musicdb.repository.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureTestDatabase
public class AlbumRestControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Autowired
  private UserRepository userRepository;
  @Autowired
  private ArtistRepository artistRepository;
  @Autowired
  private AlbumRepository albumRepository;
  @Autowired
  private LogRepository logRepository;

  private TestData testData;

  @BeforeEach
  public void setup() {
    testData = new TestData(
        userRepository,
        artistRepository,
        albumRepository,
        logRepository
    );
    testData.init();
  }

  @AfterEach
  public void tearDown() {
    testData.tearDown();
  }

  @WithMockUser(value = "pesho", roles = {"USER", "ADMIN"})
  @Test
  public void testGetAuthors() throws Exception {
    this.mockMvc.perform(
        get("/albums/api"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("[0].name").value("JUSTICE FOR ALL"));
  }

}
