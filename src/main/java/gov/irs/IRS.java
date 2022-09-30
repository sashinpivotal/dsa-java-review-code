package gov.irs;

public class IRS {

    private TaxPayer[] taxPayers = new TaxPayer[100];
    private int currentIndex = 0;

    public void register(TaxPayer taxPayer) {
        taxPayers[currentIndex] = taxPayer;
        currentIndex++;
    }

    public double computeTotalMonthlyTaxToCollect() {
        double totalMonthlyTaxToCollect = 0.0;
        for (int i = 0; i < currentIndex; i++) {
            totalMonthlyTaxToCollect
                    += taxPayers[i].computeMonthlyTaxToPay();
        }
        return totalMonthlyTaxToCollect;
    }

}
