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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.baseballproject.Service.cheerService;
import com.baseballproject.entity.DcheerBoard;
import com.baseballproject.entity.LcheerBoard;



@Controller
public class cheerController {

  @Autowired
  private cheerService cheerService;

  // LG
  @GetMapping("/twins/cheer/write")
  public String LcheerWriteForm(){
    return "./twins/cheer_twins_write";
  }
  @PostMapping("/twins/cheer/write")
  public String LcheerWritePost(LcheerBoard lcheerBoard){
    cheerService.Lcheerwrite(lcheerBoard);
    return "redirect:/twins/cheer";
  }

  @GetMapping("/twins/cheer")
  public String lcheerboardlist(Model model, @PageableDefault(page=0, size=10, sort="lidx", direction = Sort.Direction.DESC) Pageable pageable){

    Page<LcheerBoard> list = cheerService.lcheerboardlist(pageable);
    int nowPage = list.getPageable().getPageNumber()+1;
    int startPage = Math.max(nowPage - 4, 1);
    int endPage = Math.min(nowPage + 5, list.getTotalPages());
    // int totalPage = list.getTotalPages();
    
    model.addAttribute("list", list);
    model.addAttribute("nowPage", nowPage);
    model.addAttribute("startPage", startPage);
    model.addAttribute("endPage", endPage);
    // model.addAttribute("totalPage", totalPage);
    return "./twins/cheer_twins";
  }

  @GetMapping("/twins/cheer/view")
  public String lcheerboardview(Model model, Integer id){
    model.addAttribute("view", cheerService.lcheerboardview(id));
    return "./twins/cheer_twins_view";
  }

  @GetMapping("/twins/cheer/delete")
  public String lcheerboarddel(Integer id){
    cheerService.lcheerboardDel(id);
    return "redirect:/twins/cheer";
  }

  @GetMapping("/twins/cheer/modify/{id}")
  public String lcheerboardmodify(@PathVariable("id") Integer id, Model model){
    model.addAttribute("modify", cheerService.lcheerboardview(id));
    return "twins/cheer_twins_modify";
  }

  @PostMapping("/twins/cheer/update/{id}")
  public String Lcheerboardupdate(@PathVariable("id") Integer id, LcheerBoard lcheerBoard){

    LcheerBoard boardTemp = cheerService.lcheerboardview(id);
    boardTemp.setLc_title(lcheerBoard.getLc_title());
    boardTemp.setLc_content(lcheerBoard.getLc_content());

    cheerService.Lcheerwrite(boardTemp);

    return "redirect:/twins/cheer";
  }

  @GetMapping("/twins/cheer/pwcheck")
  public String lcheerpwcheck(@RequestParam("id") Integer id, @RequestParam("pw") String pw, Model model, RedirectAttributes redirect){
    String result = cheerService.lcheerpwcheck(id, pw);
    if(result.equals("fail")){
      redirect.addAttribute("result", result);
      return "redirect:/twins/cheer";
    } else {

      redirect.addAttribute("id", id);
      model.addAttribute("result", result);

      return "redirect:/twins/cheer/delete";
    }
  }
  

  //두산
  @GetMapping("/bears/cheer/write")
  public String DcheerWriteForm(){
    return "./bears/cheer_bears_write";
  }
  @PostMapping("/bears/cheer/write")
  public String DcheerWritePost(DcheerBoard dcheerBoard){
    cheerService.Dcheerwrite(dcheerBoard);
    return "redirect:/bears/cheer";
  }

  @GetMapping("/bears/cheer")
  public String dcheerboardlist(Model model, @PageableDefault(page=0, size=10, sort="didx", direction = Sort.Direction.DESC) Pageable pageable){
    Page<DcheerBoard> list = cheerService.dcheerboardlist(pageable);
    int nowPage = list.getPageable().getPageNumber()+1;
    int startPage = Math.max(nowPage - 4, 1);
    int endPage = Math.min(nowPage + 5, list.getTotalPages());
    
    model.addAttribute("list", list);
    model.addAttribute("nowPage", nowPage);
    model.addAttribute("startPage", startPage);
    model.addAttribute("endPage", endPage);
    return "./bears/cheer_bears";
  }

  @GetMapping("/bears/cheer/view")
  public String dcheerboardview(Model model, Integer id){
    model.addAttribute("view", cheerService.dcheerboardview(id));
    return "./bears/cheer_bears_view";
  }

  @GetMapping("/bears/cheer/delete")
  public String dcheerboarddel(Integer id){
    cheerService.dcheerboardDel(id);
    return "redirect:/bears/cheer";
  }

  @GetMapping("/bears/cheer/modify/{id}")
  public String dcheerboardmodify(@PathVariable("id") Integer id, Model model){
    model.addAttribute("modify", cheerService.dcheerboardview(id));
    return "bears/cheer_bears_modify";
  }

  @PostMapping("/bears/cheer/update/{id}")
  public String Dcheerboardupdate(@PathVariable("id") Integer id, DcheerBoard dcheerBoard){

    DcheerBoard boardTemp = cheerService.dcheerboardview(id);
    boardTemp.setDc_title(dcheerBoard.getDc_title());
    boardTemp.setDc_content(dcheerBoard.getDc_content());

    cheerService.Dcheerwrite(boardTemp);

    return "redirect:/bears/cheer";
  }

  @GetMapping("/bears/cheer/pwcheck")
  public String dcheerpwcheck(@RequestParam("id") Integer id, @RequestParam("pw") String pw, Model model, RedirectAttributes redirect){
    String result = cheerService.dcheerpwcheck(id, pw);
    if(result.equals("fail")){
      redirect.addAttribute("result", result);
      return "redirect:/bears/cheer";
    } else {

      redirect.addAttribute("id", id);
      model.addAttribute("result", result);

      return "redirect:/bears/cheer/delete";
    }
  }
}