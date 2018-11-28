package com.spittr;

import com.spittr.exception.SpittleNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-09-12 14:18
 */
@Controller
@RequestMapping("/homepage")
public class HomeController {
    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home(Model model) {
        Message m1 = new Message("t1", "c1");
        Message m2 = new Message("t2", "c2");
        List<Message> list = new ArrayList<Message>() {{
            add(m1);
            add(m2);
        }};
        model.addAttribute("message", list);
        return "home";
    }


    @RequestMapping(value = "register", method = RequestMethod.GET)
    public String register() {
        System.out.println("注册");
        return "register";
    }

    @RequestMapping("picture")
    public String picture(@RequestPart("picture") byte[] picture) {

        return null;
    }

    /**
     * * @PathVariable不管占位符是什么都会传递到参数中。
     *
     * @param model
     * @param id
     * @return
     */
    @RequestMapping(value = "/{iid}", method = RequestMethod.GET)
    public String commit(Model model, @PathVariable("id") String id) {
        System.out.println(id);
        if ("1".equals(id)) {
            Message m1 = new Message("t1", "c1");
            List<Message> list = new ArrayList<Message>() {{
                add(m1);
            }};
            model.addAttribute("message", list);
        }
        return "home";
        //重定向
        //return "redirect:/homepage/"+id;
    }

    @ExceptionHandler(SpittleNotFoundException.class)
    public String handleDuplicateSpittle(){
        return "error/duplicate";
    }
}
