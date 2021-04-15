package Entities;

import java.util.HashMap;
import java.util.List;

public class Group {
    private Long id;
    private String name;
    private HashMap<Long, Double> usersList;

    Group(Long id, String name) {
        this.id = id;
        this.name = name;
        this.usersList = new HashMap<>();
    }

    Long getGroupId(){
        return this.id;
    }

    String getGroupName(){
        return this.name;
    }


    void addUser(User user, Double amount){
        usersList.put(user.getUserId(), amount);
    }

    void removeUser(User user){
        usersList.remove(user.getUserId());
    }

    int getTotalUsers(){
        return this.usersList.size();
    }

    void updateUserAmount(Long id, Double amount){
        Double oldValue = usersList.get(id);

        usersList.replace(id, oldValue + amount);
    }

    HashMap<Long, Double> getUsersList(){
        return this.usersList;
    }

    Double getUserAmount(Long userId) {
        return this.usersList.get(userId);
    }

}
