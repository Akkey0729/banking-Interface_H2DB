package io.javabrains.springbootquickstart.bankingInterface.Service;

import io.javabrains.springbootquickstart.bankingInterface.Model.southWestBankModel;
import io.javabrains.springbootquickstart.bankingInterface.Repository.southWestBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;

import java.util.List;

public class southWestBankService {

    @Autowired
    private southWestBankRepository swbRepository;

    public List<southWestBankModel> getAccountDetails(){
        return swbRepository.findAll();
    }
}
