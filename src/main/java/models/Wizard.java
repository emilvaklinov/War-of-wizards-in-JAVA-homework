package models;

import javax.persistence.*;

@Entity
@Table(name = "wizards")
public class Wizard {

    private int id;
    private String name;
    private String area;

    public Wizard(){
    }

    public Wizard(String name, String area) {
        this.name = name;
        this.area = area;
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
}
