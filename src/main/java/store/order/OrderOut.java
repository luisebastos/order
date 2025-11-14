package store.order;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;

import lombok.Builder;

@Builder
public record OrderOut(
    String id,
    OffsetDateTime date,
    List<OrderItemOut> items,
    BigDecimal total
) { }

