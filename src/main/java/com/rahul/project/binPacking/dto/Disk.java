package com.rahul.project.binPacking.dto;

import lombok.Data;

import java.util.List;

@Data
public class Disk {
    private Long id;
    private final Long maxSize = 1000000L;
    private Long size = 0L;
    private List<File> files;

    public void updateSize(Long fileSize) {
        this.setSize(this.getSize()+fileSize);
    }
}
