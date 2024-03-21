package java12.entity;

import jakarta.persistence.*;
import java12.enums.HouseType;
import java12.enums.Region;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "announcements")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Announcement {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "announcements_seq")
    @SequenceGenerator(name = "announcements_seq", allocationSize = 1)

    private Long id;
    private BigDecimal price;
    @ElementCollection
    private List<String> image;
    private String title;
    private String description;
    private HouseType houseType;
    private Region region;
    private int MasOfGuests;
    private String town;
    private String address;

    //************************************  User   **************************************
    @ManyToOne
    private User user;

    //************************************  Comment  **************************************
    @OneToMany
    private List<Comment> comments;

    //************************************  Like  **************************************
    @OneToMany
    private List<Like> likes;

   //************************************  Rating  **************************************
    @OneToMany
    private List<Rating> ratings;

    
}
