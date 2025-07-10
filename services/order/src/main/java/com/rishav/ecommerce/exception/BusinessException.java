package com.rishav.ecommerce.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.jetbrains.annotations.NotNull;


@EqualsAndHashCode(callSuper = true)
@Data
public class BusinessException extends @NotNull RuntimeException {
    private final String msg;
}
