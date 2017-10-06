package com.av8242n.lms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="unit")
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int unitid;

    @Column(name="unitname")
    private String unitname;

    @OneToMany(mappedBy = "unit")
    private List<Allowance> allowances;

    public Unit() {}

    public Unit(int unitid, String name) {
        this.unitid = unitid;
        this.unitname = name;
    }

    public int getUnitid() {
        return unitid;
    }

    public void setUnitid(int unitid) {
        this.unitid = unitid;
    }

    public String getName() {
        return unitname;
    }

    public void setName(String name) {
        this.unitname = name;
    }

    @JsonIgnore
    public List<Allowance> getAllowances() {
        return allowances;
    }

    //@JsonIgnore
    public void setAllowance(List<Allowance> allowances) {
        this.allowances = allowances;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "unitid=" + unitid +
                ", name='" + unitname + '\'' +
                ", allowance=" + "a" +
                '}';
    }
}
