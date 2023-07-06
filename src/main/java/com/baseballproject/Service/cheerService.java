package com.baseballproject.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.baseballproject.entity.DcheerBoard;
import com.baseballproject.entity.LcheerBoard;
import com.baseballproject.repository.lcheerRepository;
import com.baseballproject.repository.dcheerRepository;

@Service
public class cheerService {
  @Autowired
  private lcheerRepository lcheerRepository;

  @Autowired
  private dcheerRepository dcheerRepository;

  //LG
  public void Lcheerwrite(LcheerBoard lcheerBoard){
    lcheerRepository.save(lcheerBoard);
  }

  public Page<LcheerBoard> lcheerboardlist(Pageable pageable){
    return lcheerRepository.findAll(pageable);
}

  public LcheerBoard lcheerboardview(Integer id){
    return lcheerRepository.findById(id).get(); 
  }

  public void lcheerboardDel(Integer id){
    lcheerRepository.deleteById(id);
  }

  public String lcheerpwcheck(int id, String pw){
    String result = "" ;
    if(lcheerRepository.findById(id).get().getLc_pw().equals(pw)){
      result = "success";
    } else {
      result = "fail";
    }
    return result;
  }

  // 두산
  public void Dcheerwrite(DcheerBoard dcheerBoard){
    dcheerRepository.save(dcheerBoard);
  }

  public Page<DcheerBoard> dcheerboardlist(Pageable pageable){
    return dcheerRepository.findAll(pageable); 
}

  public DcheerBoard dcheerboardview(Integer id){
    return dcheerRepository.findById(id).get(); 
  }

  public void dcheerboardDel(Integer id){
    dcheerRepository.deleteById(id);
  }

  public String dcheerpwcheck(Integer id, String pw){
    String result = "" ;
    if(dcheerRepository.findById(id).get().getDc_pw().equals(pw)){
      result = "success";
    } else {
      result = "fail";
    }
    return result;
  }
}