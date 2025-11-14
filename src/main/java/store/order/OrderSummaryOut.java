package store.order;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import lombok.Builder;

@Builder
public record OrderSummaryOut(
    String id,
    OffsetDateTime date,
    BigDecimal total
) { }

