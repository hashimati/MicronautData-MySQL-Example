package com.hashimati.ahmed.micronautdata;


import io.micronaut.data.annotation.*;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.*;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;
import java.util.List;



@JdbcRepository(dialect = Dialect.MYSQL)
public interface BookRepository extends CrudRepository<Book, Long> {
    Book find(String title);

}
