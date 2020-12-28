package pl.jakub.sandra.model;

import javax.persistence.*;

@Entity
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String vialId;

    @ManyToOne
    @MapsId("personId")
    private Person person;

    private Long activityDensity;

    public Measurement() {
    }

    public Measurement(String vialId, Person person, Long activityDensity) {
        this.vialId = vialId;
        this.person = person;
        this.activityDensity = activityDensity;
    }

    public Long getId() {
        return id;
    }

    public String getVialId() {
        return vialId;
    }

    public Person getPerson() {
        return person;
    }

    public Long getActivityDensity() {
        return activityDensity;
    }
}
