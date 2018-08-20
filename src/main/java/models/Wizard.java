package models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "wizards")
public class Wizard {

    private int id;
    private String name;
    private String area;
    private List<Attack>attacks;

    public Wizard(){
    }

    public Wizard(String name, String area) {
        this.name = name;
        this.area = area;
        this.attacks = new ArrayList<Attack>();
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

    @Column(name = "area")
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }


    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(name = "wizard_attack",
            joinColumns = {@JoinColumn(name = "wizard_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "attack_id", nullable = false, updatable = false)})

    public List<Attack> getAttacks() { return attacks; }

    public void setAttacks(List<Attack> attacks) {
        this.attacks = attacks;
    }

    public void addAttack(Attack attack){
        this.attacks.add(attack);
    }

}
