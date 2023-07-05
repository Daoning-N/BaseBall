package com.baseballproject.Service;

import java.util.List;

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
}