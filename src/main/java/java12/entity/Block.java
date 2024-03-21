package java12.entity;

import jakarta.persistence.*;
import lombok.*;
import org.aspectj.weaver.AjcMemberMaker;

@Entity
@Table(name = "blocks")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "blocks_seq")
    @SequenceGenerator(name = "blocks_seq", allocationSize = 1)

    private Long id;
    private Boolean isBlock;


    //************************************  User   **************************************
    @ManyToOne
    private User user;

    //************************************  Announcement   **************************************
    @ManyToOne
    private Announcement announcement;
}
