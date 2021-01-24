package aidat;

public class Aidat {
    private int monthNumber;
    private double paidAmount;
    private boolean isPaid;

    public Aidat(int pMonthNumber, double pPaidAmount, boolean pIsPaid) {
        this.monthNumber = pMonthNumber;
        this.paidAmount = pPaidAmount;
        this.isPaid = pIsPaid;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int pMonthNumber) {
        this.monthNumber = pMonthNumber;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double pPaidAmount) {
        this.paidAmount = pPaidAmount;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean pPaid) {
        isPaid = pPaid;
    }
}
