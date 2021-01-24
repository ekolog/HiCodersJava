package aidat;

public class Aidat {

    /**
     * Aidat classinin elemanlari monthNumber, paidAmount ve isPaid
     */
    private int monthNumber;
    private double paidAmount;
    private boolean isPaid;

    /**
     * Aidat constructor
     * @param pMonthNumber
     * @param pPaidAmount
     * @param pIsPaid
     */
    public Aidat(int pMonthNumber, double pPaidAmount, boolean pIsPaid) {
        this.monthNumber = pMonthNumber;
        this.paidAmount = pPaidAmount;
        this.isPaid = pIsPaid;
    }

    /**
     * monthNumber getter
     * @return
     */
    public int getMonthNumber() {
        return monthNumber;
    }

    /**
     * monthNumber setter
     * @param pMonthNumber
     */
    public void setMonthNumber(int pMonthNumber) {
        this.monthNumber = pMonthNumber;
    }

    /**
     * paidAmount getter
     * @return
     */
    public double getPaidAmount() {
        return paidAmount;
    }

    /**
     * paidAmount setter
     * @param pPaidAmount
     */
    public void setPaidAmount(double pPaidAmount) {
        this.paidAmount = pPaidAmount;
    }

    /**
     * isPaid getter
     * @return
     */
    public boolean isPaid() {
        return isPaid;
    }

    /**
     * isPaid setter
     * @param pPaid
     */
    public void setPaid(boolean pPaid) {
        isPaid = pPaid;
    }
}
