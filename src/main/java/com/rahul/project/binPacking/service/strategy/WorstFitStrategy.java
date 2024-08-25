package com.rahul.project.binPacking.service.strategy;

import com.rahul.project.binPacking.dto.Disk;
import com.rahul.project.binPacking.dto.File;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class WorstFitStrategy extends AssortmentStrategy {

    private final List<File> files;

    public WorstFitStrategy(List<File> files) {
        this.files = files;
    }

    public long compute() {
        long diskCount = 0;
        // create maxHeap
        PriorityQueue<File> maxHeap = new PriorityQueue<>(Comparator.comparing(File::getSize, Comparator.reverseOrder()));
        maxHeap.addAll(files);

        Disk disk = new Disk();
        diskCount += 1;
        disk.setId(diskCount);
        disk.setFiles(new ArrayList<>());
        while (!maxHeap.isEmpty()) {
            File file = maxHeap.poll();
            if ((disk.getMaxSize()-disk.getSize()) >= file.getSize()) {
                disk.getFiles().add(file);
                disk.updateSize(file.getSize());
            } else {
                disk = new Disk();
                diskCount += 1;
                disk.setId(diskCount);
                disk.setFiles(new ArrayList<>());
            }
        }
        return diskCount;
    }
}
