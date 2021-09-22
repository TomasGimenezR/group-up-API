package com.example.GroupUp.Group;

import com.example.GroupUp.User.User;

import java.util.List;

public class Group {
    private Long id;
    private String name;
    private List<User> invitees;
    private String description;

    public Group(Long id, String name, List<User> invitees, String description) {
        this.id = id;
        this.name = name;
        this.invitees = invitees;
        this.description = description;
    }

    public Group(String name, List<User> invitees, String description) {
        this.name = name;
        this.invitees = invitees;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getInvitees() {
        return invitees;
    }

    public void setInvitees(List<User> invitees) {
        this.invitees = invitees;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", invitees=" + invitees +
                ", description='" + description + '\'' +
                '}';
    }
}
