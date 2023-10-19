package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioID;

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private String riskFactor;

    @Column(nullable = false)
    private int total;

    protected Portfolio() {

    }

    public Portfolio(long portfolioID String portfolioName, String riskFactor, int total) {
        this.portfolioID= portfolioName;
        this.riskFactor = riskFactor;
        this.total = total;
        this.portfolioID= portfolioID
    }

    public Long getPortfolioId() {
        return this.portfolioID;
    }

    public String getPortfolioName() {
        return this.portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public String getRiskFactor() {
        return this.riskFactor;
    }

    public void setRiskFactor(String riskFactor) {
        this.riskFactor = riskFactor;
    }

    public String getTotal() {
        return this.total;
    }

    public String setTotal(int total) {
        this.total = total;
    }
}
