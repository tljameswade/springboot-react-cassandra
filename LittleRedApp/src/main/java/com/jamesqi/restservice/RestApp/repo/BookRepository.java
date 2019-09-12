package com.jamesqi.restservice.RestApp.repo;

import com.jamesqi.restservice.RestApp.model.Book;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface BookRepository extends CassandraRepository<Book, UUID> {
}
