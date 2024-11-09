package org.chy.chybook.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author CHY
 * @since 2024-11-01
 */
@Controller
public class BookShelfController {

    @RequestMapping(value = {"/bookshelf","/bookshelf.html"})
    public String bookshelf(){
        return "user/bookshelf";
    }
}
