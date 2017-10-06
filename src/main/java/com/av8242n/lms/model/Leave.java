package com.av8242n.lms.model;

import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="leave")
public class Leave {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="leaveid")
    private int leaveid;

    @Column(name="userid")
    private int userid;

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

    @Column(name="statusid")
    private int status;

    @Column(name="typeid")
    private int type;

    @Column(name="createdate")
    private LocalDate createdDate;

    @Column(name="submitdate")
    private LocalDate submitDate;

    @Column(name="modifydate")
    private LocalDate modifyDate;

    @Column(name="approverid")
    private int approverid;

    public Leave() {}

    public Leave(int userid, int allowanceid, LocalDate startDate, LocalDate endDate, int totalDays, int totalHours, int status, int type, LocalDate createdDate, LocalDate submitDate, LocalDate modifyDate, int approverid) {
        this.userid = userid;
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
        this.approverid = approverid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
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

    public int getApproverid() {
        return approverid;
    }

    public void setApproverid(int approverid) {
        this.approverid = approverid;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "userid=" + userid +
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
                ", approverid='" + approverid + '\'' +
                '}';
    }
}
