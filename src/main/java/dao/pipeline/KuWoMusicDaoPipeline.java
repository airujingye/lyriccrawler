package dao.pipeline;

import dao.KuWoMusicDao;
import bean.KuWoMusic;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.PageModelPipeline;

/**
 * @author zhaoshenjiao
 * @Date 2017-04-19 00:42:41
 */
@Component("KuWoMusicDaoPipeline")
public class KuWoMusicDaoPipeline implements PageModelPipeline<KuWoMusic> {

    ApplicationContext context = new ClassPathXmlApplicationContext("root-context.xml");
    KuWoMusicDao kuWoMusicDao = (KuWoMusicDao)context.getBean("kuWoMusicDao");
//    @Resource
//    private KuWoMusicDao kuWoMusicDao;

    @Override
    public void process(KuWoMusic kuWoMusic, Task task) {
        //输出歌词信息
        System.out.println(kuWoMusic.toString());
        kuWoMusicDao.add(kuWoMusic);
    }
}
