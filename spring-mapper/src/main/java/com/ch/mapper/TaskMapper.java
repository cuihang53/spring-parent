package com.ch.mapper;

import com.ch.entity.quartz.QuartzJobEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Map;

/**
 * @Description:    任务增删改查
 */
@Repository
public interface TaskMapper {

    /**
     * 根据任务状态查找任务
     * @param status
     * @return
     */
    List<QuartzJobEntity> selectTaskByStaus(String status);

    /**
     * 新增任务
     * @param 
     * @return
     */
    int insertTask(@Param("jobVO") QuartzJobEntity job);

    /**
     * 通过组别和名称(封装成map)查询任务
     * @return
     */
    QuartzJobEntity selectTaskByNameAndGroup(Map<String, String> map);

    /**
     * 查询所有任务
     * @return
     */
    List<QuartzJobEntity> selectAllJob();

    /**
     * 更新任务状态
     * @param 
     * @return
     */
    int updateTaskStatus(@Param("jobVO") QuartzJobEntity job);

    /**
     * 更新任务的cron表达式
     * @param 
     * @return
     */
    int updateTaskCron(@Param("jobVO") QuartzJobEntity job);

    /**
     * 更新任务信息
     * @param 
     * @return
     */
    int updateTaskInfo(QuartzJobEntity job);

    /**
     * 删除指定任务
     * @param map
     * @return
     */
    int deleteTask(Map<String, String> map);
}
