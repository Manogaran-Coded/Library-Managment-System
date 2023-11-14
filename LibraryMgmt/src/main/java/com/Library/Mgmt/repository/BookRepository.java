package com.Library.Mgmt.repository;
import com.Library.Mgmt.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BookRepository extends JpaRepository<Book, Long> {
}