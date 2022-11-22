package gov.irs;

import java.util.ArrayList;
import java.util.List;

public class IRS {

    private static IRS instance;

    private IRS() {
    }

    // If singleton instance has not been created yet,
    // create one.  Otherwise, return the same instance.
    public static IRS getInstance() {
        if (instance == null) {
            instance = new IRS();
        }
        return instance;
    }

    private List<TaxPayer> taxPayers = new ArrayList<>();

    public void register(TaxPayer taxPayer) {
        taxPayers.add(taxPayer);
    }

    public double computeTotalMonthlyTaxToCollect() {

        return taxPayers.stream()
                .map(taxPayer -> taxPayer.computeMonthlyTaxToPay())
                .mapToDouble(d -> d)
                .sum();

    }

}
