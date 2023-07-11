package com.baseballproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.baseballproject.Service.wordsService;
import com.baseballproject.entity.DwordsBoard;
import com.baseballproject.entity.LwordsBoard;

@Controller
public class wordsController {
  
  @Autowired
  private wordsService wordsService;

  // LG
  @GetMapping("/twins/new/words/write")
  public String LwordsWriteForm(){
    return "./twins/new_baseball_words_twins_write";
  }
  @PostMapping("/twins/new/words/write")
  public String LwordsWritePost(LwordsBoard lwordsBoard){
    wordsService.Lwordswrite(lwordsBoard);
    return "redirect:/twins/new/words";
  }

  @GetMapping("/twins/new/words")
  public String lwordsboardlist(Model model, @PageableDefault(page=0, size=10, sort="lidx", direction = Sort.Direction.DESC) Pageable pageable){

    Page<LwordsBoard> list = wordsService.lwordsboardlist(pageable);
    int nowPage = list.getPageable().getPageNumber()+1;
    int startPage = Math.max(nowPage - 4, 1);
    int endPage = Math.min(nowPage + 5, list.getTotalPages());
    // int totalPage = list.getTotalPages();
    
    model.addAttribute("list", list);
    model.addAttribute("nowPage", nowPage);
    model.addAttribute("startPage", startPage);
    model.addAttribute("endPage", endPage);
    // model.addAttribute("totalPage", totalPage);
    return "./twins/new_baseball_words_twins";
  }

  @GetMapping("/twins/new/words/view")
  public String lwordsboardview(Model model, Integer id){
    model.addAttribute("view", wordsService.lwordsboardview(id));
    return "./twins/new_baseball_words_twins_view";
  }

  @GetMapping("/twins/new/words/delete")
  public String lwordsboarddel(Integer id){
    wordsService.lwordsboardDel(id);
    return "redirect:/twins/new/words";
  }

  @GetMapping("/twins/new/words/modify/{id}")
  public String lwordsboardmodify(@PathVariable("id") Integer id, Model model){
    model.addAttribute("modify", wordsService.lwordsboardview(id));
    return "twins/new_baseball_words_twins_modify";
  }

  @PostMapping("/twins/new/words/update/{id}")
  public String Lwordsboardupdate(@PathVariable("id") Integer id, LwordsBoard lwordsBoard){

    LwordsBoard boardTemp = wordsService.lwordsboardview(id);
    boardTemp.setLw_title(lwordsBoard.getLw_title());
    boardTemp.setLw_content(lwordsBoard.getLw_content());

    wordsService.Lwordswrite(boardTemp);

    return "redirect:/twins/new/words";
  }

  //두산
  @GetMapping("/bears/new/words/write")
  public String DwordsWriteForm(){
    return "./bears/new_baseball_words_bear_write";
  }
  @PostMapping("/bears/new/words/write")
  public String DwordsWritePost(DwordsBoard dwordsBoard){
    wordsService.Dwordswrite(dwordsBoard);
    return "redirect:/bears/new/words";
  }

  @GetMapping("/bears/new/words")
  public String dwordsboardlist(Model model, @PageableDefault(page=0, size=10, sort="didx", direction = Sort.Direction.DESC) Pageable pageable){
    Page<DwordsBoard> list = wordsService.dwordsboardlist(pageable);
    int nowPage = list.getPageable().getPageNumber()+1;
    int startPage = Math.max(nowPage - 4, 1);
    int endPage = Math.min(nowPage + 5, list.getTotalPages());
    
    model.addAttribute("list", list);
    model.addAttribute("nowPage", nowPage);
    model.addAttribute("startPage", startPage);
    model.addAttribute("endPage", endPage);
    return "./bears/new_baseball_words_bear";
  }

  @GetMapping("/bears/new/words/view")
  public String dwordsboardview(Model model, Integer id){
    model.addAttribute("view", wordsService.dwordsboardview(id));
    return "./bears/new_baseball_words_bear_view";
  }

  @GetMapping("/bears/new/words/delete")
  public String dwordsboarddel(Integer id){
    wordsService.dwordsboardDel(id);
    return "redirect:/bears/new/words";
  }

  @GetMapping("/bears/new/words/modify/{id}")
  public String dwordsboardmodify(@PathVariable("id") Integer id, Model model){
    model.addAttribute("modify", wordsService.dwordsboardview(id));
    return "bears/new_baseball_words_bear_modify";
  }

  @PostMapping("/bears/new/words/update/{id}")
  public String Dwordsboardupdate(@PathVariable("id") Integer id, DwordsBoard dwordsBoard){

    DwordsBoard boardTemp = wordsService.dwordsboardview(id);
    boardTemp.setDw_title(dwordsBoard.getDw_title());
    boardTemp.setDw_content(dwordsBoard.getDw_content());

    wordsService.Dwordswrite(boardTemp);

    return "redirect:/bears/new/words";
  }

}
