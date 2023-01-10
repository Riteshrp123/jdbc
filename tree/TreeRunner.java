package com.xworkz.tree;

import com.xworkz.tree.dto.TreeDto;
import com.xworkz.tree.repo.TreeRepo;
import com.xworkz.tree.repo.TreeRepoImpl;

public class TreeRunner {
	public static void main(String[] args) {
		
	
	TreeRepo repo = new TreeRepoImpl();
	
	TreeDto dto = new TreeDto(1,"Mango","Green","Food",true);
    TreeDto dto1 = new TreeDto(2,"Banana","Yellow","food",true);
    TreeDto dto2 = new TreeDto(3,"Peepal","Green","Wood",true);
	TreeDto dto3 = new TreeDto(4,"Rainbow Eucalyptus","Rainbow","Show",true);
	TreeDto dto4 = new TreeDto(5,"Black Tupelo","Red","Nature",true);
	
//	repo.save(dto);
//	repo.save(dto1);
//	repo.save(dto2);
//	repo.save(dto3);
//	repo.save(dto4);
//	
	repo.read();
	
}
}