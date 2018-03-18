package com.winit.generator.task;

import java.util.List;

import com.winit.generator.framework.AbstractApplicationTask;
import com.winit.generator.framework.context.ApplicationContext;
import com.winit.generator.handler.BaseHandler;
import com.winit.generator.handler.impl.SoHandler;
import com.winit.generator.handler.impl.VoHandler;
import com.winit.generator.model.SoInfo;
import com.winit.generator.model.VoInfo;

public class SoTask extends AbstractApplicationTask {
    private static String SO_FTL = "template/So.ftl";
    
    @SuppressWarnings("unchecked")
    @Override
    protected boolean doInternal(ApplicationContext context) throws Exception {
        logger.info("开始生成so");
        List<SoInfo> soList = (List<SoInfo>) context.getAttribute("soList");
        
        BaseHandler<SoInfo> handler = null;
        for (SoInfo soInfo : soList) {
            handler = new SoHandler(SO_FTL, soInfo);
            handler.execute();
        }
        logger.info("结束生成so");
        return false;
    }

}
