package Entities;

import java.util.function.DoubleBinaryOperator;

public class Bill {
    private Long id;
    private Double amount;
    private Long groupId;
    private Long payerId;

    Bill(Long id, Double amount, Long groupId, Long payerId){
        this.id = id;
        this.amount = amount;
        this.groupId = groupId;
        this.payerId = payerId;
    }

    Long getBillId(){
        return this.id;
    }

    Double getBillAmount(){
        return this.amount;
    }

    Long getGroupId(){
        return this.groupId;
    }

    Long getPayerId(){
        return this.payerId;
    }



}
