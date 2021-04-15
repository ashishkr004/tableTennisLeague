package Entities;


import java.util.HashMap;

public class BillsUpload {

    void assignBillToGroup(Groups groups,  Bill bill) throws Exception {

        Group group = groups.getGroup(bill.getGroupId());

        Double totalAmount = bill.getBillAmount();
        int totalUsers = group.getTotalUsers();

        Double owesAmount = totalAmount / totalUsers;

        HashMap<Long, Double> usersList = group.getUsersList();

        group.updateUserAmount(bill.getPayerId(), owesAmount * (totalUsers -1));

        for(Long userId: usersList.keySet()){
            if(bill.getPayerId() != userId) {
                group.updateUserAmount(userId, owesAmount * -1);
            }
        }
    }
}
