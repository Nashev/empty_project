package ru.bellintegrator.practice.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Документ пользователя
 */
@Entity(name = "UserDoc")
public class UserDoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    /**
     * Служебное поле hibernate
     */
    @Version
    private Integer version;

    @ManyToOne()
    private Doc doc;

    @Column(name = "docNumber")
    private String docNumber;

    @Column(name = "docDate")
    private Date docDate;

    public Long getId() { return id; }

    public String getDocNumber() { return docNumber; }

    public void setDocNumber(String docNumber) { this.docNumber = docNumber; }

    public Date getDocDate() { return docDate; }

    public void setDocDate(Date docDate) { this.docDate = docDate; }

}