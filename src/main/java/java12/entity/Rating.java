package java12.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "ratings")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Rating {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rating_seq")
    @SequenceGenerator(name = "ratings_seq", allocationSize = 1)

    private Long id;
    private int countOfStar;

    //************************************  User   **************************************
    @ManyToOne
    private User user;

    //************************************  Announcement   **************************************
    @ManyToOne
    private Announcement announcement;
}
