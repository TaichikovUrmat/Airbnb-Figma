package java12.entity;

import jakarta.persistence.*;
import java12.enums.Role;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.security.Principal;
import java.security.PrivateKey;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "users")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User  implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    @SequenceGenerator(name = "user_seq", allocationSize = 1)

    private  Long id;
    private String fullName;
    private String  image;
    private String email;
    private String password;
    private Role role;

    //************************************  Like   **************************************
    @OneToMany
    private List<Like> likes;


    //************************************  Comment   **************************************
    @OneToMany
    private List<Comment> comments;

    //************************************  Block   **************************************
     @OneToOne
     private Block block;


    //************************************  Announcement   **************************************
     @OneToMany
     private List<Announcement> announcements;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
