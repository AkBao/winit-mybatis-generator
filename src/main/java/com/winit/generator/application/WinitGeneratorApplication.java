package com.winit.generator.application;

import com.winit.generator.framework.Application;
import com.winit.generator.task.*;

/**
 * 
 * 程序入口
 * 
 * @version 
 * <pre>
 * Author	Version		Date		Changes
 * qiyongkang 	1.0  		2017年4月25日 	Created
 *
 * </pre>
 * @since 1.
 */
public class WinitGeneratorApplication {
    public static void main(String[] args) {
        //程序入口
        Application application = new Application(WinitGeneratorApplication.class.getSimpleName());
        application.parseArgs(args);
        application.setApplicationName(WinitGeneratorApplication.class.getName());
        application.addApplicationTask(InitTask.class)
        .addApplicationTask(CombineInfoTask.class)
        .addApplicationTask(EntityTask.class)
        .addApplicationTask(SoTask.class)
        .addApplicationTask(DaoTask.class)
        .addApplicationTask(MapperTask.class)
        .addApplicationTask(IBatisDaoTask.class)
        .addApplicationTask(IBatisMapperTask.class)

        .addApplicationTask(VoTask.class)
        .work();
    }
}
