package Entities;

import java.util.HashMap;
import java.util.List;

public class Summary {

    HashMap<Long, Double> getUserGroupsSummary(Long userId, Users users, Groups groups) throws Exception {
        User user = users.getUser(userId);

        List<Long> groupsList = user.getGroupsList();

        HashMap<Long, Double> groupsSummaries = new HashMap<>();

        for(Long groupId: groupsList){
            Group group = groups.getGroup(groupId);

            Double groupAmount = group.getUserAmount(userId);

            groupsSummaries.put(groupId, groupAmount);
        }

        return groupsSummaries;
    }
}
