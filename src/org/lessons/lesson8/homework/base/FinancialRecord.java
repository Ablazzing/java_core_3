package org.lessons.lesson8.homework.base;

public class FinancialRecord {
    private int income;
    private int outcome;

    public FinancialRecord(int income, int outcome) {
        this.income = income;
        this.outcome = outcome;
    }

    public int getIncome() {
        return income;
    }

    public int getOutcome() {
        return outcome;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public void setOutcome(int outcome) {
        this.outcome = outcome;
    }

    public String getInfo() {
        return this.getIncome() + ";" + this.getOutcome();
    }
}
