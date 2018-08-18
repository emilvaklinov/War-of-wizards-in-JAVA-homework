package models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "master")
public class Master extends TechnicalSupport{

    private int power;
    private List<Tutor> tutors;

    public Master(String name, String level, int power) {
        super(name, level);
        this.power = power;
        this.tutors = new ArrayList<Tutor>();
    }

    public Master(){}

    @Column(name = "power")
    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @OneToMany(mappedBy = "master", fetch = FetchType.LAZY)

    public List<Tutor> getTutors() {
        return tutors;
    }

    public void setTutors(List<Tutor> tutors) {
        this.tutors = tutors;
    }
}
