package org.CodeForPizza;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "OWNER")
@PrimaryKeyJoinColumn(name = "PERSON_ID")
public class Owner extends Person {
    @Column(name = "Stocks")
    private String stocks;
    @Column(name = "Partnership_stake")
    private String partnershipStake;

    public Owner(int personID, String firstName, String lastName, String stocks, String partnershipStake) {
        super(personID, firstName, lastName);
        this.stocks = stocks;
        this.partnershipStake = partnershipStake;
    }

    public Owner() {

    }


    public String getStocks() {
        return stocks;
    }

    public void setStocks(String stocks) {
        this.stocks = stocks;
    }

    public String getPartnershipStake() {
        return partnershipStake;
    }

    public void setPartnershipStake(String partnershipStake) {
        this.partnershipStake = partnershipStake;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "stocks='" + stocks + '\'' +
                ", partnershipStake='" + partnershipStake + '\'' +
                '}';
    }
}
