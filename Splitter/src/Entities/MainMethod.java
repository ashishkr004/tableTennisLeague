package Entities;

import java.util.HashMap;

public class MainMethod {

    public static void printSummary(HashMap<Long, Double> summary){

        for(Long id: summary.keySet()){
            System.out.println("GroupId: "+ id + " amount value: " + summary.get(id));
        }

        System.out.println("#####");
    }

    public static void main(String[] args) throws Exception {
        User userA = new User(1L, "a" );
        User userB = new User(2L, "b" );
        User userC = new User(3L, "c" );

        Users allUsers = new Users();

        allUsers.addUser(userA);
        allUsers.addUser(userB);
        allUsers.addUser(userC);

        Group g1 = new Group(1L, "g1");
        g1.addUser(userA, 0.0);
        g1.addUser(userB, 0.0);

        Group g2 = new Group(2L, "g2");
        g2.addUser(userA, 0.0);
        g2.addUser(userB, 0.0);
        g2.addUser(userC, 0.0);

        Groups allGroups = new Groups();
        allGroups.addNewGroup(g1);
        allGroups.addNewGroup(g2);



        userA.addGroup(1L);
        userB.addGroup(1L);

        userA.addGroup(2L);
        userB.addGroup(2L);
        userC.addGroup(2L);








        Bill bill = new Bill(1L, 100.0, 1L, 1L);

        BillsUpload billsUpload = new BillsUpload();
        billsUpload.assignBillToGroup(allGroups, bill);

        Bill bill_2 = new Bill(2L, 300.0, 2L, 3L);
        billsUpload.assignBillToGroup(allGroups, bill_2);


        Summary s1 = new Summary();

        HashMap<Long, Double> summaryA = s1.getUserGroupsSummary(1L, allUsers, allGroups);
        HashMap<Long, Double> summaryB = s1.getUserGroupsSummary(2L, allUsers, allGroups);
        HashMap<Long, Double> summaryC = s1.getUserGroupsSummary(3L, allUsers, allGroups);

//        printSummary(summaryA);
        printSummary(summaryC);
    }
}
