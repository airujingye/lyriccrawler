package dao;

import bean.KuWoMusic;
import org.apache.ibatis.annotations.Insert;

/**
 * @author zhaoshenjiao
 * @Date 2017-04-19 00:37:57
 */
public interface KuWoMusicDao {
    @Insert("insert into gsw_lyric (`title`,`content`,`source`,`singer`,`album`,`recorder`,`recordTime`,`curStatus`) " +
            "values (#{name},#{lyric},'laiyuan',#{singer},#{album},'admin',#{recordTime},'2')")
    int add(KuWoMusic kuWoMusic);
}
