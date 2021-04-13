package ru.bellintegrator.practice.model;

import javax.persistence.*;
import java.util.List;

/**
 * Офис
 */
@Entity(name = "Office")
public class Office {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    /**
     * Служебное поле hibernate
     */
    @Version
    private Integer version;

    @Column(name = "name")
    private String name;

    @Column(name = "address",length = 4000)
    private String address;

    @Column(name = "phone")
    private String phone;

    @Column(name = "is_active")
    private Boolean isActive;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="org_id")
    Organization organization;

    @OneToMany(
            fetch = FetchType.LAZY,
            mappedBy = "office",
            cascade = CascadeType.REMOVE,
            orphanRemoval = true
    )
    List<User> users;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public Organization getOrganization() {return organization;}

    public void setOrganization(Organization organization) { this.organization = organization; }

    public Boolean getIsActive() { return isActive; }

    public void setIsActive(Boolean isActive) { this.isActive = isActive; }

    public List<User> getUsers() { return users; }

    public void addUser(User user) {
        getUsers().add(user);
        user.setOffice(this);
    }

    public void removeUser(User user) {
        getUsers().remove(user);
        user.setOffice(null);
    }
}