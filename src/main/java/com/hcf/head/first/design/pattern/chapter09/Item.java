package com.hcf.head.first.design.pattern.chapter09;


import com.hcf.head.first.design.pattern.chapter09.menu.MenuComponent;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class Item extends MenuComponent {
    private String name;
    private BigDecimal price;

    @Override
    public void print() {
        System.out.println(this);
    }
}
