package com.example.GroupUp.Group;

import com.example.GroupUp.User.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupService {
    public List<Group> getGroups() {
        return List.of(new Group(1L,"Grupo 1", List.of(new User(1L, "Tomas")),"A great group with no users"));
    }
}
