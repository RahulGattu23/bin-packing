package com.rahul.project.binPacking.adapter;

import com.rahul.project.binPacking.dto.File;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class FileAdapterService {
    public List<File> getData() throws IOException {
        String text = Files.readString(Paths.get("src/main/resources/static/files.json"));
        JSONObject jsonObject = new JSONObject(text);
        JSONArray jsonArray = (JSONArray) jsonObject.get("files");
        List<Object> list = jsonArray.toList();

        return list.stream().map(obj -> {
            HashMap<?,?> map = ((HashMap<?, ?>) obj);
            return new File(Long.valueOf((Integer) map.get("id")), Long.valueOf((String) map.get("size")));
        }).collect(Collectors.toList());
    }
}
