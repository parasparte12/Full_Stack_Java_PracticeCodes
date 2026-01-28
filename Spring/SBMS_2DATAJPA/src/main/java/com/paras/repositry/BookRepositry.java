package com.paras.repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.paras.entity.Book;


@Repository
public interface BookRepositry extends JpaRepository<Book, Integer> {// <T,ID>=>>  <Entityclass,Primarykey returntype>
	

}
