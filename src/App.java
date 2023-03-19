import article.Thumbnail;
import io.jrest.HttpStatus;
import io.jrest.JRest;
import io.jrest.ResponseEntity;

import java.net.MalformedURLException;
import java.net.URL;

public class App {
    public static void main(String[] args) throws MalformedURLException {
       JRest app = JRest.create().start();
        app.addEndpoint("/example", (request) -> {
            return new ResponseEntity<>(HttpStatus.OK, System.currentTimeMillis());
        });
    }

    private void loadContent() {
        URL url = new URL("https://www.google.com/url?sa=i&url=https%3A%2F%2Fdocs.aspose.com%2Fbarcode%2Fjava%2F1-2-1-1-generating-qr-code-for-a-url%2F&psig=AOvVaw1s65N6yCwTSF6I7MaSAfZ6&ust=1679339321606000&source=images&cd=vfe&ved=0CA8QjRxqFwoTCLjPy8_Y6P0CFQAAAAAdAAAAABAJ");
        Thumbnail to = new Thumbnail(url ,"title", "testing description");

        System.out.println(to.getJSONString());
    }




}
