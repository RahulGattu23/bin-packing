package com.rahul.project.binPacking.service;

import com.rahul.project.binPacking.service.strategy.AssortmentStrategy;
import org.springframework.stereotype.Service;

//@Service
public class AssortmentService {

    private final AssortmentStrategy assortmentStrategy;

    public AssortmentService(AssortmentStrategy assortmentStrategy) {
        this.assortmentStrategy = assortmentStrategy;
    }


    public long calculateDiskCount()  {
        return assortmentStrategy.compute();
    }

}
