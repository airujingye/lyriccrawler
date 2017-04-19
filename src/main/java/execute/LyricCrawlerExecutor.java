package execute;

import dao.pipeline.KuWoMusicDaoPipeline;
import bean.KuWoMusic;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.model.ConsolePageModelPipeline;
import us.codecraft.webmagic.model.OOSpider;

/**
 * 爬虫执行类
 * @author zhaoshenjiao
 * @Date 2017-04-18 23:23:43
 */
public class LyricCrawlerExecutor {
    public static void main(String[] args) {
        //保存到数据库
        OOSpider.create(
                Site.me(),
                new KuWoMusicDaoPipeline(), KuWoMusic.class)
                .addUrl("http://www.kuwo.cn/yinyue/492211?catalog=yueku2016")
                .thread(2)
                .run();
        //输出到控制台
//        OOSpider.create(
//                Site.me(),
//                new ConsolePageModelPipeline(), KuWoMusic.class)
//                .addUrl("http://www.kuwo.cn/yinyue/492211?catalog=yueku2016")
//                .thread(2)
//                .run();

        //测试获取bean
//        ApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
//        KuWoMusicDao kuWoMusicDao = (KuWoMusicDao)context.getBean("kuWoMusicDao");
//
//        //包名（或者是保的完整路径）/配置文件名字（也就是xml文件）
//        ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext ("root-context.xml");
//
//        System.out.println(cpx.getBean("kuWoMusicDao"));
    }
}
