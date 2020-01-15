package com.ch.quartz.service;


import org.quartz.Scheduler;

/**
 * @Description:    DOTO
 * @UpdateRemark:   修改内容
 * @Version: 1.0
 */
public interface QuartzService {

    /**
     * 任务调度（动态获取调度器）
     * @param group
     * @param name
     * @param clazz
     * @param cron
     * @return
     */
    Scheduler startJob(String group, String name, Class<?> clazz, String cron);
}
