package pl.bikepoint.rental.services;

import pl.bikepoint.rental.dao.contract.User;

import java.util.List;

public interface UserService {
    void deleteUserById (Long Id);
    List<User> findAllUsers();
    void addUser (User user);
}
