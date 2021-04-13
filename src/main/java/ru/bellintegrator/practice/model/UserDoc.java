package ru.bellintegrator.practice.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Документ пользователя
 */
@Entity(name = "UserDoc")
public class UserDoc {

    @Id
    @Column(name = "Id")
    private Long id;

    /**
     * Служебное поле hibernate
     */
    @Version
    private Integer version;

    @Column(name = "doc_number")
    private String docNumber;

    @Column(name = "doc_date")
    private Date docDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "doc_id")
    private Doc doc;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    @JoinColumn (name="id")
    User user;

    public Long getId() { return id; }

    public String getDocNumber() { return docNumber; }

    public void setDocNumber(String docNumber) { this.docNumber = docNumber; }

    public Date getDocDate() { return docDate; }

    public void setDocDate(Date docDate) { this.docDate = docDate; }

    public Doc getDoc() { return doc; }

    public void setDoc(Doc doc) { this.doc = doc; }

    public User getUser() { return user; }

    public void setUser(User user) { this.user = user; }

}