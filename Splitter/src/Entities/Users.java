package Entities;

import java.util.HashMap;
import java.util.List;

public class Users {
    HashMap<Long, User> usersList = new HashMap<>();

    User getUser(Long userId) throws Exception {
        if(usersList.containsKey(userId)) {
            return usersList.get(userId);
        }

        throw new Exception("Entities.User Not exists");
    }

    void addUser(User user) throws Exception {
        if(user.getUserId() > 0) {
            usersList.put(user.getUserId(), user);
        }
        else {
            throw new Exception("user id not valid");
        }



    }

    boolean removeUser(Long userId) {
        if(usersList.containsKey(userId)) {
            usersList.remove(userId);

            return true;
        }

        return false;
    }

}
