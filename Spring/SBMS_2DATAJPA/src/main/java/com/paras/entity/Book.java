package com.paras.entity;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="book_table")
@Data  // for getting-> getter,setter,toString,equals,hashcode
@AllArgsConstructor   // for param
@NoArgsConstructor    //for non parameter
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)// this is use for bookID to create automatic ID // for mysql->Identity // oracle->sequence // if you dont know the database then use -> Auto
	private Integer bookID;
	private String  bookName;
	private String  bookAuthor;
	private Double  bookprice;
	private Integer  bookQuantity;
	
}