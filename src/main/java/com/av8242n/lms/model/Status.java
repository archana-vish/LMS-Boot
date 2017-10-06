package com.av8242n.lms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="status")
public class Status {

    @Id
    @Column(name="statusid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int statusid;

    @Column(name="statusname")
    private String statusname;

    @OneToMany(mappedBy = "status")
    private List<Leave> leaves;

    public int getStatusid() {
        return statusid;
    }

    public void setStatusid(int statusid) {
        this.statusid = statusid;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }

    @JsonIgnore
    public List<Leave> getLeaves() {
        return leaves;
    }

    @JsonIgnore
    public void setLeaves(List<Leave> leaves) {
        this.leaves = leaves;
    }

    Status() {}

    Status(String statusname) {
        this.statusname = statusname;
    }

    @Override
    public String toString() {
        return "Status{" +
                "statusid=" + statusid +
                ", statusname='" + statusname + '\'' +
                '}';
    }
}
