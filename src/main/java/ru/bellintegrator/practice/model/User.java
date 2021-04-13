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

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "position")
    private String position;

    @Column(name = "phone")
    private String phone;

    @Column(name = "is_identified")
    private Boolean isIdentified;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="office_id")
    Office office;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="citizenship_id")
    Country citizenship;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    UserDoc userDoc;

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

    public Boolean getIdentified() { return isIdentified; }

    public void setIdentified(Boolean identified) { isIdentified = identified; }

    public Office getOffice() {return office;}

    public void setOffice(Office office) { this.office = office; }

    public Country getCitizenship() {return citizenship;}

    public void setCitizenship(Country citizenship) { this.citizenship = citizenship; }

    public UserDoc getUserDoc() { return userDoc; }

    public void setUserDoc(UserDoc userDoc) { this.userDoc = userDoc; }
}