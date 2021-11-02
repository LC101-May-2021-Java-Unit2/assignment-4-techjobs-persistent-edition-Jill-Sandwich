package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "Location is required")
    @Size(max = 100)
    private String location;

    @OneToMany
    @JoinColumn(name = "job_id")
    private final List<Job> jobs = new ArrayList<>();

    public Employer(String aLocation){
        super();
        this.location = aLocation;
    }

    public Employer() {

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
