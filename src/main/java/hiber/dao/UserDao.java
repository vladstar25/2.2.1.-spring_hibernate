package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserDao {

   User get(Car car);

   void add(User user);
   List<User> listUsers();
}
