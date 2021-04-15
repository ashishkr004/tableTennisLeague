package Entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class User {
    private Long id;
    private String name;
    private Long mobile;
    private List<Long> groupsList;

    User(Long id, String name){
        this.id = id;
        this.name = name;
        this.groupsList = new ArrayList<>();
    }

    Long getUserId(){
        return this.id;
    }

    String getUsername(){
        return this.name;
    }

    Long getUserMobile(){
        return this.mobile;
    }

    List<Long> getGroupsList(){
        return this.groupsList;
    }

    void updateUsername(String name){
        this.name = name;
    }

    void updateUserMobile(Long mobile) {
        this.mobile = mobile;
    }

    void addGroup(Long groupId){
        groupsList.add(groupId);
    }

}
