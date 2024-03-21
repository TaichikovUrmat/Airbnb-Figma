package java12.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "lekes")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Like {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "likes_seq")
    @SequenceGenerator(name = "likes_seq", allocationSize = 1)

    private Long id;
    private Boolean isLike;

    //********************************** User  *************************
    @ManyToOne
    private User user;

    //********************************** Announcement  *************************
    @ManyToOne
    private Announcement announcement;

    //********************************** Comment  *************************
    @ManyToOne
    private Comment comment;

}
