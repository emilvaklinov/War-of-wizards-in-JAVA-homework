package models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "codeclanners")
@Inheritance(strategy = InheritanceType.JOINED)
public class Codeclanner {

    private int id;
    private String name;
    private String cohort;
    private int age;
    private List<Follower>followers;
    private Tutor tutor;


    public Codeclanner(){}

    public Codeclanner(String name, String cohort, int age, Tutor tutor) {
        this.name = name;
        this.cohort = cohort;
        this.age = age;
        this.tutor = tutor;
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

    @OneToMany(mappedBy = "codeclanner", fetch = FetchType.LAZY)
    public List<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Follower> followers) {
        this.followers = followers;
    }

    @ManyToOne
    @JoinColumn(name = "tutor_id", nullable = false)
    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }
}