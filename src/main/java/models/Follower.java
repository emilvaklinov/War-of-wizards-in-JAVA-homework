package models;

import javax.persistence.*;

@Entity
@Table(name = "followers")
public class Follower {

    private int id;
    private String name;
    private int age;

    public Follower(){}

    public Follower(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
