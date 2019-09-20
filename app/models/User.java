package models;

import lombok.Data;
import play.data.validation.Constraints;

import javax.persistence.*;
@Entity
@Data
@Table(name="test")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",length = 20,nullable = false)
    public Integer id;
    @Column(name = "username",length = 50,nullable = true)
    public String username;
    @Column(name = "password",length = 50,nullable = true)
    public String password;
}
