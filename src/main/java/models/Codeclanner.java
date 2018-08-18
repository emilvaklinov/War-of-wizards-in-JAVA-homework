package models;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
