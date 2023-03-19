package article;

import org.json.JSONObject;
import org.json.JSONString;

import java.awt.image.BufferedImage;
import java.net.URL;

public class Thumbnail {
    private URL image;
    private String title;
    private String desc;

    public URL getImage() {
        return image;
    }

    public void setImage(URL image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Thumbnail(URL image, String title, String desc){
        this.image = image;
        this.title = title;
        this.desc = desc;
    }

    public String getJSONString() {
        JSONObject obj = new JSONObject();
        obj.put("title", this.title);
        obj.put("desc", this.desc);
        obj.put("image", this.image.toString());

        return obj.toString();
    }
}
