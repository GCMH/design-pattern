package com.hcf.head.first.design.pattern.chapter09;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class Item {
    private String name;
    private BigDecimal price;
}
