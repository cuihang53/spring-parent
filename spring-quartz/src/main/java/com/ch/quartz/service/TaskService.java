package com.ch.quartz.service;

import com.ch.entity.quartz.*;
import org.quartz.SchedulerException;


/**
 * @Description:    任务业务
 * @Version: 1.0
 */
public interface TaskService {

    /**
     * 开启任务
     * @param group
     * @param name
     * @param clazz
     * @return
     */
    AjaxResult startTask(String group, String name, Class<?> clazz) throws Exception;

    /**
     * 终止定时任务
     * @param group
     * @param name
     * @param clazz
     * @param cron
     * @return
     * @throws Exception
     */
    AjaxResult stopTask(String group, String name, Class<?> clazz, String cron) throws Exception;

    /**
     * 暂停任务
     * @param group
     * @param name
     * @param clazz
     * @param cron
     * @return
     * @throws Exception
     */
    AjaxResult pauseTask(String group, String name, Class<?> clazz, String cron) throws Exception;

    /**
     * 恢复任务
     * @param group
     * @param name
     * @param clazz
     * @param cron
     * @return
     * @throws Exception
     */
    AjaxResult resumeTask(String group, String name, Class<?> clazz, String cron) throws Exception;

    /**
     * 查看所有任务
     * @return
     */
    AjaxResult selectAllTask();

    /**
     * 更新任务执行频率
     * @param myJob
     * @return
     */
    AjaxResult updateCron(QuartzJobEntity job) throws SchedulerException;

    /**
     * 新增任务
     * @param myJob
     * @return
     */
    AjaxResult insertTask(QuartzJobEntity job, Class<?> clazz);


}
