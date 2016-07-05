package ua.lviv.lgs.entry;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by admin on 30.06.2016.
 */
//@NamedQuery(name = "User.SelectUserByLogin" query = "select u from User u where u.email like :login or u.phone like :login")

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String surname;
    @Column
    private int age;
    @Column
    private String email;
    @Column
    private String userName;
    @Column
    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Order> orderList;

    @ManyToOne(fetch = FetchType.LAZY)
    private City city;


    public User() {
    }

    public User(String name, String surname, int age, String email, String userName, String password) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        this.userName = userName;
        this.password = password;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
