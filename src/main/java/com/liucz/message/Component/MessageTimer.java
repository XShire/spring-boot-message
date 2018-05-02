package com.liucz.message.Component;

import com.liucz.message.base.Template;
import com.liucz.message.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class MessageTimer {

    @Autowired
    private Producer producer;
    @Autowired
    CommonComponent commonComponent;

    @Scheduled(fixedRate = 3000)
    public void messageTimerRate() {

        String touser = "OPENID";
        String template_id = "ngqIpbwh8bUfcSsECmogfXcV14J0tQlEpBO27izEYtY";
        String url = "http://weixin.qq.com/download";
        Map data = new HashMap();
        data.put("first",commonComponent.getTempItem("恭喜你购买成功！"));
        data.put("keyword1",commonComponent.getTempItem("巧克力"));
        data.put("keyword2",commonComponent.getTempItem("39.8元"));
        data.put("keyword3",commonComponent.getTempItem("2014年9月22日"));
        data.put("remark",commonComponent.getTempItem("欢迎再次购买！"));
        Template template = new Template(touser, template_id, url, data);

        producer.sendMessage(template);

    }

    @Scheduled(fixedRate = 5000)
    public void logTimerRate() {

        for(int i=0;i<10;i++){
            producer.sendLog( "生产者发送了日志=="+i);
        }

    }

}
