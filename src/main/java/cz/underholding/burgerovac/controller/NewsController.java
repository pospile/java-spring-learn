package cz.underholding.burgerovac.controller;


import com.jaunt.*;
import cz.underholding.burgerovac.model.Note;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.function.Consumer;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.iterator;

@RestController
@RequestMapping("/api/v1")
public class NewsController {


    // Get All Notes
    @GetMapping("/news")
    public String loadNewNews() throws ResponseException, NotFound {
        UserAgent userAgent = new UserAgent();         //create new userAgent (headless browser)
        userAgent.visit("https://m.novinky.cz/");          //visit google

        Elements imgs = userAgent.doc.findEvery("<h2>");

        for (Element img: imgs) {
            System.out.println(img.getText());
        }

        return "";
    }

}
