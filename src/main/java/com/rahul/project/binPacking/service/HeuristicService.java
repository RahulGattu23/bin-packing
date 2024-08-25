package com.rahul.project.binPacking.service;

import com.rahul.project.binPacking.adapter.FileAdapterService;
import com.rahul.project.binPacking.dto.File;
import com.rahul.project.binPacking.service.strategy.WorstFitStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class HeuristicService implements CommandLineRunner {
    private final FileAdapterService fileAdapterService;

    public HeuristicService(FileAdapterService fileAdapterService) {
        this.fileAdapterService = fileAdapterService;
    }


    @Override
    public void run(String... args) throws Exception {
        List<File> data = fileAdapterService.getData();
        long worstFitCount = new AssortmentService(new WorstFitStrategy(data)).calculateDiskCount();
//        long worstFitDecreasingCount = new AssortmentService(new WorstFitDecreasingStrategy(data)).calculateDiskCount();
        log.info("Disks required using Worst Fit: {}", worstFitCount);
    }
}
