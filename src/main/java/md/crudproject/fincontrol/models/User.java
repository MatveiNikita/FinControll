package md.crudproject.fincontrol.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.time.LocalDate;
import java.util.UUID;


@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ID;

    private String name;

    private String surname;

    private LocalDate dateOfBirth;

    @Column(unique = true, nullable = false)
    private String email;
    private String password;

    public void setPassword(String password){
        this.password = PASSWORD_ENCODE.encode(password);
    }

    private static final PasswordEncoder PASSWORD_ENCODE = new BCryptPasswordEncoder();
}
