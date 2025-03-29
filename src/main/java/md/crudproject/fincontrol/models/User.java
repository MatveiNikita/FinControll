package md.crudproject.fincontrol.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "User")
@Getter
@Setter
@RequiredArgsConstructor
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID ID;

    private String name;

    private String surname;

    @Column(unique = true, nullable = false)
    private String email;

    private LocalDate dateOfBirth;
}
