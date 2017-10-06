package com.av8242n.lms.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="leave")
public class Leave {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="leaveid")
    private int leaveid;

    @ManyToOne
    @JoinColumn (name="userid")
    private User user;

    @Column(name="allowanceid")
    private int allowanceid;

    @Column(name="startdate")
    private LocalDate startDate;

    @Column(name="enddate")
    private LocalDate endDate;

    @Column(name="totaldays")
    private int totalDays;

    @Column(name="totalhours")
    private int totalHours;

    @ManyToOne
    @JoinColumn(name="statusid")
    private Status status;

    @ManyToOne
    @JoinColumn(name="typeid")
    private Type type;

    @Column(name="createdate")
    @org.hibernate.annotations.Type(type="java.time.LocalDate")
    private LocalDate createdDate;

    @Column(name="submitdate")
    @org.hibernate.annotations.Type(type="java.time.LocalDate")
    private LocalDate submitDate;

    @Column(name="modifydate")
    @org.hibernate.annotations.Type(type="java.time.LocalDate")
    private LocalDate modifyDate;

    @ManyToOne
    @JoinColumn(name="approverid")
    private User approver;

    public Leave() {}

    public Leave(User user, int allowanceid, LocalDate startDate, LocalDate endDate, int totalDays, int totalHours, Status status, Type type, LocalDate createdDate, LocalDate submitDate, LocalDate modifyDate, User approver) {
        this.user = user;
        this.allowanceid = allowanceid;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalDays = totalDays;
        this.totalHours = totalHours;
        this.status = status;
        this.type = type;
        this.createdDate = createdDate;
        this.submitDate = submitDate;
        this.modifyDate = modifyDate;
        this.approver = approver;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getAllowanceid() {
        return allowanceid;
    }

    public void setAllowanceid(int allowanceid) {
        this.allowanceid = allowanceid;
    }

    public int getLeaveid() {
        return leaveid;
    }

    public void setLeaveid(int leaveid) {
        this.leaveid = leaveid;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDate getSubmitDate() {
        return submitDate;
    }

    public void setSubmitDate(LocalDate submitDate) {
        this.submitDate = submitDate;
    }

    public LocalDate getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(LocalDate modifyDate) {
        this.modifyDate = modifyDate;
    }

    public User getApprover() {
        return approver;
    }

    public void setApprover(User approver) {
        this.approver = approver;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "userLeave=" + user +
                ", allowanceid=" + allowanceid +
                ", leaveid=" + leaveid +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", totalDays=" + totalDays +
                ", totalHours=" + totalHours +
                ", status=" + status +
                ", type=" + type +
                ", createdDate=" + createdDate +
                ", submitDate=" + submitDate +
                ", modifyDate=" + modifyDate +
                ", approverid='" + approver + '\'' +
                '}';
    }
}
