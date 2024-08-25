package com.rahul.project.binPacking.service.strategy;

import org.springframework.stereotype.Component;

@Component
public abstract class AssortmentStrategy {
    public abstract long compute();
}
