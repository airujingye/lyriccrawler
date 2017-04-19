package bean;

import us.codecraft.webmagic.model.annotation.ExtractBy;
import us.codecraft.webmagic.model.annotation.TargetUrl;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @author zhaoshenjiao
 * @Date 2017-04-18 23:12:34
 */
@TargetUrl("http://www.kuwo.cn/yinyue/*")
public class KuWoMusic {
    /**
     * 歌名
     */
//    @ExtractBy(value="div.tit em.f-ff2",type = ExtractBy.Type.Css)
    @ExtractBy("//p[@id='lrcName']/text()")
    private String name;
    /**
     * 歌手
     */

//    @ExtractBy(value="p.des span a",type = ExtractBy.Type.Css)
    @ExtractBy("//p[@class='artist']/span/a/text()")
    private String singer;
    /**
     * 歌词
     */
//    @ExtractBy(value="div.mCSB_container p",type = ExtractByactBy.Type.Css)
    @ExtractBy("//p[@class='lrcItem']")
    private List<String>  lyrics;


    private String  lyric;
    /**
     * 所属专辑
     */
//    @ExtractBy(value="p.des a",type = ExtractBy.Type.Css)
    @ExtractBy("//p[@class='album']/span/a/text()")
    private String album;

    private Timestamp recordTime;
    /**
     * 所属专辑
     */
//    @ExtractBy(value="body",type = ExtractBy.Type.Css)
//    private String body;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public List<String> getLyrics() {
        return lyrics;
    }

    public void setLyrics(List<String> lyrics) {
        this.lyrics = lyrics;
    }

    public String getLyric() {
        StringBuilder sb = new StringBuilder();
        for ( String str: lyrics ) {
            sb.append(str);
        }
        return sb.toString();
    }

    public void setLyric(String lyric) {
        StringBuilder sb = new StringBuilder();
        for ( String str: lyrics ) {
            sb.append(str);
        }
        this.lyric = sb.toString();
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public Timestamp getRecordTime() {
        return new Timestamp( new Date().getTime());
    }

    public void setRecordTime(Timestamp recordTime) {
        this.recordTime = recordTime;
    }

    @Override
    public String toString() {
        return "[name:"+name +",singer="+singer+",album="+album+",lyric="+lyric+"]";
    }
}
