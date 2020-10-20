package com.hcf.head.first.design.pattern.chapter12.quackable;

import com.hcf.head.first.design.pattern.chapter12.observer.QuackObverser;

public interface Quackable extends QuackObverser {
    void quack();
}
