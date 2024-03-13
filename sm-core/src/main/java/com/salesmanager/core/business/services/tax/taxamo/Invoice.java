package com.salesmanager.core.business.services.tax.taxamo;

import java.math.BigDecimal;

public class Invoice {

    public String currency_code;
    public BigDecimal fx_rate;
    public BigDecimal amount;
    public BigDecimal tax_amount;
    public BigDecimal total_amount;
    public String fx_source;
}
