package io.javabrains.springbootquickstart.bankingInterface.Service;

import io.javabrains.springbootquickstart.bankingInterface.Model.southWestBankModel;
import java.util.List;

import io.javabrains.springbootquickstart.bankingInterface.Service.southWestBankService;
import io.javabrains.springbootquickstart.bankingInterface.Repository.southWestBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Component;

///////////////////////////////////////////////DYNAMIC CODE BELOW/////////////////////////////////////////////////////
//public class southWestBankService {
//    private southWestBankRepository swbRepository;
//    public List<southWestBankModel> getAccountDetails(southWestBankModel swbModel)
//    {
//        return swbRepository.findAll();
//    }
//
//    public List<southWestBankModel> getAccountDetailsNew(){
//        return null;
//    }
//    public southWestBankModel updateAccount(int clId, southWestBankModel swbModel){
//        return null;
//    }
//    public void deleteAccount(int clId){
//
//    }
//    public southWestBankModel createAccount(int clId){
//        return null;
//    }

///////////////////////////////////////////////STATC CODE BELOW//////////////////////////////////////////////////////
public interface southWestBankService{

    //    @Autowired
    //    private southWestBankRepository swbRepository;

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
