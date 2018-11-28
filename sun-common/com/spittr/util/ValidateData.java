package com.spittr.util;

import com.spittr.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-09-13 15:41
 */
@Controller
@RequestMapping("/validate")
public class ValidateData {
    @RequestMapping(value = "user" ,method = RequestMethod.POST)
    public String processRegistration(MultipartFile picture, @Valid User user, BindingResult result){
        System.out.println(user);
        System.out.println(picture);
        if(result.hasErrors()){
            FieldError error = (FieldError) result.getAllErrors().get(0);
            /* System.out.println(error); */
            return "";
        }
        return "redirect:/homepage/home.do";
    }
}
