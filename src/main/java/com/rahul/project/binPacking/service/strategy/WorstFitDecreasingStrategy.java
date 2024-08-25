package com.rahul.project.binPacking.service.strategy;

import com.rahul.project.binPacking.dto.File;
import org.springframework.stereotype.Component;

import java.util.List;

public class WorstFitDecreasingStrategy extends AssortmentStrategy {

    private final List<File> files;

    public WorstFitDecreasingStrategy(List<File> files) {
        this.files = files;
    }

    // TODO
    public long compute() {
        long diskCount = 0;

        return diskCount;
    }
}
