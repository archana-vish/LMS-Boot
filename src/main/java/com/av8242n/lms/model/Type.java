package com.av8242n.lms.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="type")
public class Type {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="typeid")
    private int typeid;

    @Column(name="typename")
    private String typename;

    @OneToMany(mappedBy = "type")
    private List<Leave> leaves;


    public int getTypeid() {
        return typeid;
    }

    public void setTypeid(int typeid) {
        this.typeid = typeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public Type() {}

    public Type(String typename) {
        this.typename = typename;
    }

    @JsonIgnore
    public List<Leave> getLeaves() {
        return leaves;
    }

    @JsonIgnore
    public void setLeaves(List<Leave> leaves) {
        this.leaves = leaves;
    }

    @Override
    public String toString() {
        return "Type{" +
                "typeid=" + typeid +
                ", typename=" + typename +
                '}';
    }
}
