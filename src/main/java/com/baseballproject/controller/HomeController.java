package com.baseballproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String home(){
      
        return "index";
    }
    
    //두산 매핑 시작

    @GetMapping(value = "/bears")
    public String bears(){
      
        return "./bears/index_bear";
    }

    @GetMapping(value = "/bears/cheer")
    public String bears_cheer(){
      
        return "./bears/cheer_bear";
    }

    @GetMapping(value = "/bears/info_play")
    public String bears_info_play(){
      
        return "./bears/info_play_bear";
    }

    @GetMapping(value = "/bears/info_py")
    public String bears_info_py(){
      
        return "./bears/info_py_bear";
    }

    @GetMapping(value = "/bears/new/book")
    public String bears_book(){
      
        return "./bears/new_baseball_book_bear";
    }

    @GetMapping(value = "/bears/new/cheer")
    public String bears_cheer_new(){
      
        return "./bears/new_baseball_cheer_bear";
    }

    @GetMapping(value = "/bears/new/rule")
    public String bears_rule(){
      
        return "./bears/new_baseball_rule_bear";
    }   

    @GetMapping(value = "/bears/new/words")
    public String bears_words(){
      
        return "./bears/new_baseball_words_bear";
    }

    @GetMapping(value = "/bears/new/cheer")
    public String bears_cheer(){
      
        return "./bears/new_baseball_cheer_bear";
    }   

    @GetMapping(value = "/bears/cheer/sing")
    public String bears_sing(){
      
        return "./bears/bears_cheer_sing";
    }

    //LG 매핑 시작

    @GetMapping(value = "/twins")
    public String twins(){
      
        return "./twins/index_twin";
    }

    @GetMapping(value = "/twins/cheer")
    public String twins_cheer(){
      
        return "./twins/cheer_twins";
    }

    @GetMapping(value = "/twins/info_play")
    public String twins_info_play(){
      
        return "./twins/info_play_twins";
    }

    @GetMapping(value = "/twins/info_py")
    public String twins_info_py(){
      
        return "./twins/info_py_twins";
    }

    @GetMapping(value = "/twins/new/book")
    public String twins_book(){
      
        return "./twins/new_baseball_book_twins";
    }

    @GetMapping(value = "/twins/new/cheer")
    public String twins_cheer_new(){
      
        return "./twins/new_baseball_cheer_twins";
    }

    @GetMapping(value = "/twins/new/rule")
    public String twins_rule(){
      
        return "./twins/new_baseball_rule_twins";
    }   

    @GetMapping(value = "/twins/new/words")
    public String twins_words(){
      
        return "./twins/new_baseball_words_twins";
    }

    @GetMapping(value = "/twins/LG/sing")
    public String twins_sing(){
      
        return "./twins/LG_cheer_sing";
    }
}
