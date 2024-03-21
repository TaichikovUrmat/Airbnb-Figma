package java12.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "favorites")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "favorites_seq")
    @SequenceGenerator(name = "favorites_seq", allocationSize = 1)

    private Long id;
    private LocalDate createAt;

    //******************************************  User   ***************************



    //******************************************  Like  ***************************

}
