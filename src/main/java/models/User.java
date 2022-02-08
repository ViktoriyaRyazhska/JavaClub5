package models;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.text.DateFormat;
import java.util.Date;

@Entity
@Table (name = "users")
public class User {
    public User(){

    }

    public User(String firstname, String lastname, String email, String password, int age, Role role) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.age = age;
        this.role = role;
        this.registrationDate = new Date();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private int age;
    @Column(name = "registration_date")
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date registrationDate;

/*    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id")
     */
    @Enumerated(EnumType.STRING)
    @Type(type = "config.EnumTypePostgreSql")
    private Role role;

}
