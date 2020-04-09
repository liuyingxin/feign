package com.feign.demo.web.schedule;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 系统定时任务
 * 1、在springboot的启动类DemoApplication加上@EnableScheduling注解开启定时任务
 * 2、新建一个ScheduledTask类：
 * 要在任务的类上写@Component
 * 要在任务方法上写@Scheduled
 * 3、fixedDelay和fixedRate，单位是毫秒，这里这里就是5秒和3秒，
 * 它们的区别就是：fixedRate就是每多少分钟一次，不论你业务执行花费了多少时间。我都是1分钟执行1次，
 * 而fixedDelay是当任务执行完毕后每隔几分钟在执行。所以根据实际业务不同，我们会选择不同的方式。
 * <p>
 * 4、cron表达式：比如你要设置每天什么时候执行，就可以用它
 * cron表达式，有专门的语法，而且感觉有点绕人，不过简单来说，大家记住一些常用的用法即可，特殊的语法可以单独去查。
 * cron一共有7位，但是最后一位是年，可以留空，所以我们可以写6位：
 * 第一位，表示秒，取值0-59
 * 第二位，表示分，取值0-59
 * 第三位，表示小时，取值0-23
 * 第四位，日期天/日，取值1-31
 * 第五位，日期月份，取值1-12
 * 第六位，星期，取值1-7，星期一，星期二...，注：不是第1周，第二周的意思 另外：1表示星期天，2表示星期一。
 * 第7为，年份，可以留空，取值1970-2099
 * cron中，还有一些特殊的符号，含义如下：
 * (*)星号：可以理解为每的意思，每秒，每分，每天，每月，每年...
 * (?)问号：问号只能出现在日期和星期这两个位置。
 * (-)减号：表达一个范围，如在小时字段中使用“10-12”，则表示从10到12点，即10,11,12
 * (,)逗号：表达一个列表值，如在星期字段中使用“1,2,4”，则表示星期一，星期二，星期四
 * (/)斜杠：如：x/y，x是开始值，y是步长，比如在第一位（秒） 0/15就是，从0秒开始，每15秒，最后就是0，15，30，45，60
 */
@Slf4j
@EnableScheduling
@Component
public class ScheduledTask {
    /**
     * 表示方法执行完成后5000毫秒（5秒）
     */
    @Scheduled(fixedDelay = 5000)
    public void fixedDelayJob() {
        System.out.println("-----fixedDelay 每隔5秒-----" + new Date());
    }

    /**
     * 表示每隔30秒
     */
    @Scheduled(fixedRate = 30000)
    public void fixedRateJob() {
        log.info("-----fixedRate 每隔30秒：-----" + new Date());
    }

    /**
     * 表示每天14时30分0秒执行
     */
    @Scheduled(cron = "0 44 14 ? * ? ")
    public void cronJob() {
        log.info("-----cron:14时37分0秒执行:-----" + new Date());
    }

}
