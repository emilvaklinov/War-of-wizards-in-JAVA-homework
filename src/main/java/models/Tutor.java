package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tutors")
@Inheritance(strategy = InheritanceType.JOINED)
public class Tutor extends TechnicalSupport{
    private Master master;
    private List<Codeclanner>codeclanners;

    public Tutor(String name, String level, Master master) {
        super(name, level);
        this.master = master;
    }

    public Tutor(){}

    @ManyToOne
    @JoinColumn(name = "master_id", nullable = false)
    public Master getMaster() {
        return master;
    }

    public void setMaster(Master master) {
        this.master = master;
    }

    @OneToMany(mappedBy = "tutor", fetch = FetchType.LAZY)

    public List<Codeclanner> getCodeclanners() {
        return codeclanners;
    }

    public void setCodeclanners(List<Codeclanner> codeclanners) {
        this.codeclanners = codeclanners;
    }
}
