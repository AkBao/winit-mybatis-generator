package com.winit.generator.handler.impl;

import java.io.File;

import com.winit.generator.config.Configuration;
import com.winit.generator.handler.BaseHandler;
import com.winit.generator.model.DaoInfo;


public class IBatisDaoHandler extends BaseHandler<DaoInfo> {
    public IBatisDaoHandler(String ftlName, DaoInfo info) {
        this.ftlName = ftlName;
        this.info = info;
        this.savePath = Configuration.getString("base.baseDir") 
                + File.separator + Configuration.getString("dao.path")
                + File.separator + info.getClassName() + ".java";
        
    }
    
    @Override
    public void combileParams(DaoInfo info) {
        this.param.put("packageStr", info.getPackageStr());
        this.param.put("importStr", info.getImportStr());
        this.param.put("entityDesc", info.getEntityInfo().getEntityDesc());
        this.param.put("className", info.getClassName());
        this.param.put("entityClassName", info.getEntityInfo().getClassName());
        this.param.put("entityName", info.getEntityInfo().getEntityName());
        this.param.put("soClassName",info.getSoInfo().getClassName());
        this.param.put("soName",info.getSoInfo().getEntityInfo().getClassName());
    }

}
