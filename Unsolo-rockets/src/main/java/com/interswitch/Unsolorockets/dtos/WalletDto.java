package com.interswitch.Unsolorockets.dtos;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class WalletDto {

    private String walletId;
    private BigDecimal balance;
}
