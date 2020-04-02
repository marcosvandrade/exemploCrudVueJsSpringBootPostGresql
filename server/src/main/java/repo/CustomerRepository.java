package repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import model.Customer;
 
public interface CustomerRepository extends CrudRepository<Customer, Long> {
   List<Customer> findByAge(int age);
 }

// public interface CustomerRepository extends JpaRepository<CustomerRepository, Long> {
//   List<Customer> findByAge(int age);
// }
