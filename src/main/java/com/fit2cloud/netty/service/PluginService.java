package com.fit2cloud.netty.service;

import com.fit2cloud.netty.dao.PluginMapper;
import com.fit2cloud.netty.model.Plugin;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class PluginService {
    @Resource
    private PluginMapper pluginMapper;

    public List<Plugin> selectPlugins() {
        return pluginMapper.selectByExample(null);
    }

}
