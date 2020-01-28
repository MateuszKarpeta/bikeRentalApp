package pl.bikepoint.bikeRentalApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CrudService <T,ID> extends JpaRepository {
    /*Set<T> findAll();
    T findById (ID id);
    T save (T object);
    void deleteById (ID id);*/
}
