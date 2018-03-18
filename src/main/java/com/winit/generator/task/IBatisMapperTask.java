package com.winit.generator.task;

import java.util.List;

import com.winit.generator.framework.AbstractApplicationTask;
import com.winit.generator.framework.context.ApplicationContext;
import com.winit.generator.handler.BaseHandler;
import com.winit.generator.handler.impl.IBatisMapperHandler;
import com.winit.generator.handler.impl.MapperHandler;
import com.winit.generator.model.MapperInfo;

public class IBatisMapperTask extends AbstractApplicationTask {
    private static String MAPPER_FTL = "template/IBatisMapper.ftl";

    @SuppressWarnings("unchecked")
    @Override
    protected boolean doInternal(ApplicationContext context) throws Exception {
        logger.info("开始生成 IBatisMapper");
        
        List<MapperInfo> list = (List<MapperInfo>) context.getAttribute("mapperInfos");
        
        BaseHandler<MapperInfo> handler = null;
        for (MapperInfo mapperInfo : list) {
            handler = new IBatisMapperHandler(MAPPER_FTL, mapperInfo);
            handler.execute();
        }
        
        logger.info("生成 IBatisMapper 完成");
        return false;
    }
    
    @Override
    protected void doAfter(ApplicationContext context) throws Exception {
        super.doAfter(context);
    }
}
