package repository;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Balázs on 2017. 06. 06..
 */
public interface Note extends CrudRepository<Note, Long> {
}
