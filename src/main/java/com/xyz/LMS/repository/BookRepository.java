package com.xyz.LMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xyz.LMS.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
