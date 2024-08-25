package com.rahul.project.binPacking.dao;

import com.rahul.project.binPacking.dto.File;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FileDAO {

    private static final String HASH_KEY = "file";
    private final RedisTemplate template;

    public FileDAO(RedisTemplate<String, File> template) {
        this.template = template;
    }

    public File addFile(File file) {
        template.opsForHash().put(HASH_KEY, file.getId(), file);
        return file;
    }

    public List<File> findAll() {
        return template.opsForHash().values(HASH_KEY);
    }

    public File findById(Long id) {
        return (File) template.opsForHash().get(HASH_KEY, id);
    }

    public Long deleteById(Long... ids) {
        return template.opsForHash().delete(HASH_KEY, ids);
    }


}
