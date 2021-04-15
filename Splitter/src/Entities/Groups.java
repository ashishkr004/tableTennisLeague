package Entities;

import Entities.Group;

import java.util.HashMap;

public class Groups {
    private HashMap<Long, Group> groupsList = new HashMap<>();

    Group getGroup(Long id) {
        return  groupsList.get(id);
    }

    void addNewGroup(Group group){
        this.groupsList.put(group.getGroupId(), group);
    }

}
