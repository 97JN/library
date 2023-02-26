package com.example.library;

import com.example.library.book.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepo extends CrudRepository<Library, Long> {
}
