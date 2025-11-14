package store.order;

import java.math.BigDecimal;

import lombok.Builder;

@Builder
public record OrderItemProductOut(
    String id,
    String name,
    String unit,
    BigDecimal price
) { }

