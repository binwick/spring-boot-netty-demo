package com.fit2cloud.netty.service;

import com.fit2cloud.netty.dao.TagMapper;
import com.fit2cloud.netty.model.Tag;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class TagService {
    @Resource
    private TagMapper tagMapper;

    public List<Tag> getAllTags() {
        return tagMapper.selectByExample(null);
    }

    public void insert(Tag record) {
        tagMapper.insertSelective(record);
//        int a = 1 / 0;
    }
}
