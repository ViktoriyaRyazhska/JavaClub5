package models;

import javax.persistence.*;
public enum Role {
    admin(1), user(2);

    Role(int i) {}
}
/*
@Entity
@Table(name = "roles")
public class Role {
    public Role() {
        roleName = "user";
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "role_name")
    private String roleName;

}
*/
