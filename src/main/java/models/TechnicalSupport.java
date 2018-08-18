package models;


import javax.persistence.*;

@Entity
@Table(name = "administrators")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class TechnicalSupport {

    private int id;
    private String name;
    private String level;


public TechnicalSupport(){}

    public TechnicalSupport(String name, String level) {
        this.name = name;
        this.level = level;
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

    @Column(name = "level")
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
