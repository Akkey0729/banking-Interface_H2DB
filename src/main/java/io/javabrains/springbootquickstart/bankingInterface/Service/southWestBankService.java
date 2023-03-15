package io.javabrains.springbootquickstart.bankingInterface.Service;

import io.javabrains.springbootquickstart.bankingInterface.Model.southWestBankModel;
import io.javabrains.springbootquickstart.bankingInterface.Repository.southWestBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;

import java.util.List;

public interface southWestBankService {

    //@Autowired
    //private southWestBankRepository swbRepository;

    //Dynamic Data
//    public List<southWestBankModel> getAccountDetails(){
//        return swbRepository.findAll();
//    }

    //Static Dataset

    public List<southWestBankModel> getAccountDetails();

    public List<southWestBankModel> createAccount();

    public List<southWestBankModel> updateAccount();

    public List<southWestBankModel> deleteAccount();
}
