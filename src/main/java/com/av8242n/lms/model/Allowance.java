package com.av8242n.lms.model;

import javax.persistence.*;

@Entity
@Table(name="allowance")
public class Allowance {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="allowanceid")
    private int allowanceid;

    @ManyToOne
    @JoinColumn(name="userid")
    private User user;

    @ManyToOne
    @JoinColumn(name="unitid")
    private Unit unit;

    @Column(name="hoursperday")
    private float hoursPerDay;

    @Column(name="annualentitlement")
    private float annualEntitlement;

    @Column(name="carriedover")
    private float carriedOver;

    @Column(name="bankholiday")
    private float bankHoliday;

    @Column(name="adjustments")
    private float adjustments;

    @Column(name="totalleave")
    private float totalLeave;

    @Column(name="balancedays")
    private float balanceDays;

    @Column(name="balancehours")
    private float balanceHours;

    public Allowance() {}

    public Allowance(User user, Unit unit, float hoursPerDay, float annualEntitlement, float carriedOver, float bankHoliday, float adjustments, float totalLeave, float balanceDays, float balanceHours) {
        this.user = user;
        this.unit = unit;
        this.hoursPerDay = hoursPerDay;
        this.annualEntitlement = annualEntitlement;
        this.carriedOver = carriedOver;
        this.bankHoliday = bankHoliday;
        this.adjustments = adjustments;
        this.totalLeave = totalLeave;
        this.balanceDays = balanceDays;
        this.balanceHours = balanceHours;
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


    public Unit getUnitid() {
        return unit;
    }

    public void setUnitid(Unit unit) {
        this.unit = unit;
    }

    public float getHoursPerDay() {
        return hoursPerDay;
    }

    public void setHoursPerDay(float hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

    public float getAnnualEntitlement() {
        return annualEntitlement;
    }

    public void setAnnualEntitlement(float annualEntitlement) {
        this.annualEntitlement = annualEntitlement;
    }

    public float getCarriedOver() {
        return carriedOver;
    }

    public void setCarriedOver(float carriedOver) {
        this.carriedOver = carriedOver;
    }

    public float getBankHoliday() {
        return bankHoliday;
    }

    public void setBankHoliday(float bankHoliday) {
        this.bankHoliday = bankHoliday;
    }

    public float getAdjustments() {
        return adjustments;
    }

    public void setAdjustments(float adjustments) {
        this.adjustments = adjustments;
    }

    public float getTotalLeave() {
        return totalLeave;
    }

    public void setTotalLeave(float totalLeave) {
        this.totalLeave = totalLeave;
    }

    public float getBalanceDays() {
        return balanceDays;
    }

    public void setBalanceDays(float balanceDays) {
        this.balanceDays = balanceDays;
    }

    public float getBalanceHours() {
        return balanceHours;
    }

    public void setBalanceHours(float balanceHours) {
        this.balanceHours = balanceHours;
    }

    @Override
    public String toString() {
        return "Allowance{" +
                "user=" + user +
                ", allowanceid=" + allowanceid +
                ", unit=" + unit +
                ", hoursPerDay=" + hoursPerDay +
                ", annualEntitlement=" + annualEntitlement +
                ", carriedOver=" + carriedOver +
                ", bankHoliday=" + bankHoliday +
                ", adjustments=" + adjustments +
                ", totalLeave=" + totalLeave +
                ", balanceDays=" + balanceDays +
                ", balanceHours=" + balanceHours +
                '}';
    }
}
