package ru.bellintegrator.practice.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;

/**
 * Пользователь
 */
@Entity(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    /**
     * Служебное поле hibernate
     */
    @Version
    private Integer version;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "secondName")
    private String secondName;

    @Column(name = "middleName")
    private String middleName;

    @Column(name = "position")
    private String position;

    @Column(name = "phone")
    private String phone;

    @ManyToOne
    @JoinColumn (name="citizenshipID")
    Country citizenship;

    @OneToMany()
    @JoinColumn(name = "userId")
    private List<UserDoc> userDocs;

    @Column(name = "isIdentified")
    private Boolean isIdentified;

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() { return secondName; }

    public void setSecondName(String secondName) { this.secondName = secondName; }

    public String getMiddleName() { return middleName; }

    public void setMiddleName(String middleName) { this.middleName = middleName; }

    public String getPosition() { return position; }

    public void setPosition(String position) { this.position = position; }

    public String getPhone() { return phone; }

    public void setPhone(String phone) { this.phone = phone; }

    public Country getCitizenship() {return citizenship;}

    public void setCitizenship(Country citizenship) {
        this.citizenship = citizenship;
    }

    public List<UserDoc> getUserDocs() { return userDocs; }

    public void setUserDocs(List<UserDoc> userDocs) { this.userDocs = userDocs; }

    public Boolean getIdentified() { return isIdentified; }

    public void setIdentified(Boolean identified) { isIdentified = identified; }
}