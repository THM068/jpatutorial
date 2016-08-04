package com.oreilly.sdata.domains;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by tm1c14 on 04/08/2016.
 */
@Entity
@Table(name = "account_owner")
public class AccountOwner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "version", nullable = false)
    private Long version;

    //@Column(name = "account_band_id", nullable = false)
    @ManyToOne(targetEntity = AccountBand.class)
    private AccountBand accountBand;

    @Column(name = "active", nullable = false)
    private Boolean active = false;

   // @Column(name = "company", nullable = false)
    @ManyToOne(targetEntity = Company.class)
    private Company company;

    @Column(name = "expire_date", nullable = false)
    private Date expireDate;

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

    public AccountBand getAccountBand() {
        return accountBand;
    }

    public void setAccountBand(AccountBand accountBand) {
        this.accountBand = accountBand;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }


}
