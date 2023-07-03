package com.baseballproject.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baseballproject.entity.LcheerBoard;
import com.baseballproject.repository.cheerRepository;

@Service
public class cheerService {
  @Autowired
  private cheerRepository lcheerRepository;

  public void Lcheerwrite(LcheerBoard lcheerBoard){
    lcheerRepository.save(lcheerBoard);
  }

  public List<LcheerBoard> lcheerboardlist(){
    return lcheerRepository.findAll(); 
}

  public LcheerBoard lcheerboardview(Integer id){
    return lcheerRepository.findById(id).get(); 
  }

  public void lcheerboardDel(Integer id){
    lcheerRepository.deleteById(id);
  }

}
