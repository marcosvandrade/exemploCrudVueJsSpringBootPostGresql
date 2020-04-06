package spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
   List<Customer> findByAge(int age);
 }// public interface CustomerRepository extends JpaRepository<CustomerRepository, Long> {
//   List<Customer> findByAge(int age);
// }
