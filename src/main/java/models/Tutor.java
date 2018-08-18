package models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tutors")

public class Tutor extends TechnicalSupport{
    private Master master;

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
}
