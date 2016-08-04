package com.oreilly.sdata.domains;

import javax.persistence.*;

/**
 * Created by tm1c14 on 04/08/2016.
 */
@Entity
@Table(name = "user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "version", nullable = false)
    private Long version;

    @Column(name = "enabled", nullable = false)
    private Boolean enabled = true;


    @Column(name = "account_expired", nullable = false)
    private Boolean accountExpired = false;

    @Column(name = "account_locked", nullable = false)
    private
    Boolean accountLocked = false;

    @Column(name = "password_expired", nullable = false)
    private
    Boolean passwordExpired =false;

    @OneToOne(targetEntity = Employee.class)
    private
    Employee profile;

    @OneToOne(targetEntity = Company.class)
    private
    Company company;

    @ManyToOne(targetEntity = AccountOwner.class)
    private
    AccountOwner accountOwner;

    @Column(name = "name", nullable = true)
    private
    String name;

    @Column(name = "surname", nullable = true)
    private String surname;


    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", unique = true, nullable = false)
    private String password;


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

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getAccountExpired() {
        return accountExpired;
    }

    public void setAccountExpired(Boolean accountExpired) {
        this.accountExpired = accountExpired;
    }

    public Boolean getAccountLocked() {
        return accountLocked;
    }

    public void setAccountLocked(Boolean accountLocked) {
        this.accountLocked = accountLocked;
    }

    public Boolean getPasswordExpired() {
        return passwordExpired;
    }

    public void setPasswordExpired(Boolean passwordExpired) {
        this.passwordExpired = passwordExpired;
    }

    public Employee getProfile() {
        return profile;
    }

    public void setProfile(Employee profile) {
        this.profile = profile;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public AccountOwner getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(AccountOwner accountOwner) {
        this.accountOwner = accountOwner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
