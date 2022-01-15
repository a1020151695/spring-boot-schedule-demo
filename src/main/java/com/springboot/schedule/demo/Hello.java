package com.springboot.schedule.demo;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Cola
 * @description
 * @date 2022/1/15
 * @email 1020151695@qq.com
 */
@Component
public class Hello {

    @Scheduled(cron="*/2 * *  * * * ")   //每5秒执行一次
    public void execute(){
        System.out.println("hello world");
    }

}
