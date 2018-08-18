package models;


import javax.persistence.*;

@Entity
@Table(name = "codeclanners")
public class Codeclanner {

    private int id;
    private String name;
    private String cohort;
    private int age;

    public Codeclanner(){}

    public Codeclanner(String name, String cohort, int age) {
        this.name = name;
        this.cohort = cohort;
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

    @Column(name = "cohort")
    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
