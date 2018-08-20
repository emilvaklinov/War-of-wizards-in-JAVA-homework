package models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "attacks")
public class Attack {

    private int id;
    private String day;
    private String damage;
    private List<Wizard>wizards;
//    private List<Codeclanner>codeclanners;

    public Attack(){}

    public Attack(String day, String damage) {
        this.day = day;
        this.damage = damage;
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

    @Column(name = "day")
    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Column(name = "damage")
    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }


    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(name = "wizard_attack",
            joinColumns = {@JoinColumn(name = "attack_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "wizard_id", nullable = false, updatable = false)})
    public List<Wizard> getWizards() {
        return wizards;
    }

    public void setWizards(List<Wizard> wizards) {
        this.wizards = wizards;
    }

//    public List<Codeclanner> getCodeclanners() {
//        return codeclanners;
//    }
//
//    public void setCodeclanners(List<Codeclanner> codeclanners) {
//        this.codeclanners = codeclanners;
//    }

    public void addWizard(Wizard wizard){
        this.wizards.add(wizard);
    }

}
