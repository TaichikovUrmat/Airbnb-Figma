package java12.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "comments")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comments_seq")
    @SequenceGenerator(name = "comments_seq", allocationSize = 1)

    private Long id;
    private String comment;
    @ElementCollection
    private List<String> image;
    private LocalDate createdAt;


    //******************************************  User   ***************************
     @ManyToOne
     private User user;


    //******************************************  Like   ***************************
    @OneToMany
    private List<Like> likes;

}
