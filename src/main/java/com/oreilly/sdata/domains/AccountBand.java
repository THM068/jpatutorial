package com.oreilly.sdata.domains;

import com.oreilly.sdata.enums.AccountType;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by tm1c14 on 04/08/2016.
 */
@Entity
@Table(name = "account_band")
public class AccountBand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long version;

    @Enumerated(EnumType.STRING)
    @Column(name = "account_type", nullable = false )
    private AccountType accountType;

    @Column(name = "max_users", nullable = false)
    private Integer maxUsers = 10;

    @Column(name= "min_users", nullable = false)
    private Integer minUsers = 1;

    @Column(name = "price", nullable = false, precision = 2 )
    private BigDecimal price = new BigDecimal(1000);

    public String toString() {
        return getAccountType().toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Integer getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(Integer maxUsers) {
        this.maxUsers = maxUsers;
    }

    public Integer getMinUsers() {
        return minUsers;
    }

    public void setMinUsers(Integer minUsers) {
        this.minUsers = minUsers;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
