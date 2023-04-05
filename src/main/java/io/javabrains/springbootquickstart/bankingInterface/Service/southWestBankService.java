/*package io.javabrains.springbootquickstart.bankingInterface.Service;

import io.javabrains.springbootquickstart.bankingInterface.Model.southWestBankModel;

import java.util.Collections;
import java.util.List;

import io.javabrains.springbootquickstart.bankingInterface.Service.southWestBankService;
import io.javabrains.springbootquickstart.bankingInterface.Repository.southWestBankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Component;

///////////////////////////////////////////////DYNAMIC CODE BELOW/////////////////////////////////////////////////////
//public class southWestBankService {
//    private southWestBankRepository swbRepository;
//
//    public List<southWestBankModel> getAccountDetails(southWestBankModel swbModel) {
//        return Collections.singletonList(swbRepository.save(swbModel));
//        //return null;
//    }
//
//    public List<southWestBankModel> getAccountDetailsNew() {
//        return null;
//    }
//
//    public southWestBankModel updateAccount(int clId, southWestBankModel swbModel) {
//        return null;
//    }
//
//    public void deleteAccount(int clId) {
//
//    }

//    public southWestBankModel createAccount(int clId) {
//        return null;
//    }

    public interface southWestBankService{

    //public List<southWestBankModel> getAccountDetails();
        //southWestBankModel saveData(southWestBankModel swbModel);

        List<southWestBankModel> getAccountDetails(southWestBankModel swbModel);

        List<southWestBankModel> createAccount(int clId);

        List<southWestBankModel> updateAccount(long Account_Number, southWestBankModel swbModel);

        List<southWestBankModel> deleteAccount(int clId);

        //public List<southWestBankModel> createAccount();

    //public List<southWestBankModel> updateAccount();

    //public List<southWestBankModel> deleteAccount();

        //List<southWestBankModel> createAccount(int clId, southWestBankModel swbModel);



//        List<southWestBankModel> createAccount();
//
//        List<southWestBankModel> updateAccount();
//
//        List<southWestBankModel> deleteAccount();
    }
//}
///////////////////////////////////////////////STATC CODE BELOW//////////////////////////////////////////////////////
//public interface southWestBankService{
//
//        //@Autowired
////        private southWestBankRepository swbRepository;
//
////    Dynamic Data
////        public List<southWestBankModel> getAccountDetails(){
////            return swbRepository.findAll();
////        }
//
////    Static Dataset
//
//    public List<southWestBankModel> getAccountDetails();
//
//    public List<southWestBankModel> createAccount();
//
//    public List<southWestBankModel> updateAccount();
//
//    public List<southWestBankModel> deleteAccount();
//}

*/
