package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotNull(message = "Description is required")
    @Size(max = 300)
    private String description;

    public Skill(String aDescription){
        super();
        this.description = aDescription;
    }

    public Skill() {

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}