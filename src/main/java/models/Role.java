package models;

import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {
    public Role() { }
    public Role(RoleEnum role) {
        this.role = role;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "role_name", unique = true)
    @Enumerated(EnumType.STRING)
    private RoleEnum role;


}
