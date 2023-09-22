package org.wwtbb.data;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class CurrencyExchangeDTO {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
}
