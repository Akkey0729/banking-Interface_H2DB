package io.javabrains.springbootquickstart.bankingInterface.Repository;

import io.javabrains.springbootquickstart.bankingInterface.Model.southWestBankModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface southWestBankRepository extends JpaRepository<southWestBankModel , Integer> {


}
