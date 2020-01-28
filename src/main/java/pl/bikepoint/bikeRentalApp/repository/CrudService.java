package pl.bikepoint.bikeRentalApp.repository;

import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository  //extends JpaRepository
public interface CrudService<T, ID> {
    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void deleteById(ID id);
}
