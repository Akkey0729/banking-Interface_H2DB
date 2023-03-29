package io.javabrains.springbootquickstart.bankingInterface.Service;
import io.javabrains.springbootquickstart.bankingInterface.Model.southWestBankModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.javabrains.springbootquickstart.bankingInterface.Repository.southWestBankRepository;
import io.javabrains.springbootquickstart.bankingInterface.Service.southWestBankService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//@Service
//public class southWestBankImpl extends southWestBankService {
//
//
//    private southWestBankRepository swbRepository;

////////////////////////////////////////////DYNAMIC CODE BELOW////////////////////////////////////////////////////////
//    public southWestBankImpl(southWestBankRepository swbRepository) {
//        super();
//        this.swbRepository = swbRepository;
//    }
//    @Override
//    public List<southWestBankModel> getAccountDetails(southWestBankModel swbModel) {
//        return swbRepository.save(swbModel);
//    }
//
//    @Override
//    public List<southWestBankModel> getAccountDetailsNew() {
//        return swbRepository.findAll();
//
//
//    }
//
//
//    @Override
//    public void deleteAccount(int clId) {
//        swbRepository.findById(clId);
//        swbRepository.deleteById(clId);
//
//    }
//    @Override
//    public southWestBankModel updateAccount(int clId, southWestBankModel swbModel1) {
//        Optional<southWestBankModel> swbModel = swbRepository.findById(clId);
//
//            swbModel.get().setAccount_Number(swbModel1.getAccount_Number());
//            swbModel.get().setAccount_Holder_Name(swbModel1.getAccount_Holder_Name());
//            swbModel.get().setBalance(swbModel1.getBalance());
//            return swbRepository.save(swbModel.get());
//
//
//    }
//    @Override
//    public southWestBankModel createAccount(int clId) {
//        Optional<southWestBankModel> swbModel = swbRepository.findById(clId);
//
//            return swbRepository.getById(clId);
//
//    }
//
//
//}

///////////////////////////////////////////////STATIC CODE BELOW////////////////////////////////////////////////

@Service
public class southWestBankImpl implements southWestBankService {

    @Autowired
    private southWestBankRepository swbRepository;
private static List<southWestBankModel> list = new ArrayList<>();
    private static List<southWestBankModel> createlist = new ArrayList<>();
    private static List<southWestBankModel> updatelist = new ArrayList<>();
    private static List<southWestBankModel> deletelist = new ArrayList<>();

    static{
        southWestBankModel swbModel = new southWestBankModel();
        swbModel.setAccount_Number(1001);
        swbModel.setAccount_Holder_Name("Akshay Kumar Gupta");
        swbModel.setBalance(15000);
        list.add(swbModel);

        swbModel = new southWestBankModel();
        swbModel.setAccount_Number(1002);
        swbModel.setAccount_Holder_Name("Ashraiy Manohar");
        swbModel.setBalance(35000);
        list.add(swbModel);

        swbModel = new southWestBankModel();
        swbModel.setAccount_Number(1003);
        swbModel.setAccount_Holder_Name("Anany Johari");
        swbModel.setBalance(25000);
        list.add(swbModel);

        swbModel = new southWestBankModel();
        swbModel.setAccount_Number(1004);
        swbModel.setAccount_Holder_Name("Harshith Reddy");
        swbModel.setBalance(20000);
        list.add(swbModel);
    }

    static{

        southWestBankModel swbModel = new southWestBankModel();
        swbModel.setAccount_Number(1001);
        swbModel.setAccount_Holder_Name("Akshay Kumar Gupta");
        swbModel.setBalance(15000);
        createlist.add(swbModel);

        swbModel = new southWestBankModel();
        swbModel.setAccount_Number(1002);
        swbModel.setAccount_Holder_Name("Ashraiy Manohar");
        swbModel.setBalance(35000);
        createlist.add(swbModel);

        swbModel = new southWestBankModel();
        swbModel.setAccount_Number(1003);
        swbModel.setAccount_Holder_Name("Anany Johari");
        swbModel.setBalance(25000);
        createlist.add(swbModel);

        swbModel = new southWestBankModel();
        swbModel.setAccount_Number(1004);
        swbModel.setAccount_Holder_Name("Harshith Reddy");
        swbModel.setBalance(20000);
        createlist.add(swbModel);

        swbModel = new southWestBankModel();
        swbModel.setAccount_Number(1005);
        swbModel.setAccount_Holder_Name("Ankeet Choudhary");
        swbModel.setBalance(27000);
        createlist.add(swbModel);
    }

    static{

        southWestBankModel swbModel = new southWestBankModel();
        swbModel.setAccount_Number(1001);
        swbModel.setAccount_Holder_Name("Akshay Kumar Gupta");
        swbModel.setBalance(15000);
        updatelist.add(swbModel);

        swbModel = new southWestBankModel();
        swbModel.setAccount_Number(1002);
        swbModel.setAccount_Holder_Name("Ashraiy Manohar");
        swbModel.setBalance(38000);
        updatelist.add(swbModel);

        swbModel = new southWestBankModel();
        swbModel.setAccount_Number(1003);
        swbModel.setAccount_Holder_Name("Anany Johari");
        swbModel.setBalance(23000);
        updatelist.add(swbModel);

        swbModel = new southWestBankModel();
        swbModel.setAccount_Number(1004);
        swbModel.setAccount_Holder_Name("Harshith Reddy");
        swbModel.setBalance(28000);
        updatelist.add(swbModel);

        swbModel = new southWestBankModel();
        swbModel.setAccount_Number(1005);
        swbModel.setAccount_Holder_Name("Ankeet Choudhary");
        swbModel.setBalance(29000);
        updatelist.add(swbModel);
    }

    static {

        southWestBankModel swbModel = new southWestBankModel();
        swbModel.setAccount_Number(1001);
        swbModel.setAccount_Holder_Name("Akshay Kumar Gupta");
        swbModel.setBalance(15000);
        deletelist.add(swbModel);

        swbModel = new southWestBankModel();
        swbModel.setAccount_Number(1002);
        swbModel.setAccount_Holder_Name("Ashraiy Manohar");
        swbModel.setBalance(38000);
        deletelist.add(swbModel);

        swbModel = new southWestBankModel();
        swbModel.setAccount_Number(1003);
        swbModel.setAccount_Holder_Name("Anany Johari");
        swbModel.setBalance(23000);
        deletelist.add(swbModel);

        swbModel = new southWestBankModel();
        swbModel.setAccount_Number(1004);
        swbModel.setAccount_Holder_Name("Harshith Reddy");
        swbModel.setBalance(28000);
        deletelist.add(swbModel);
    }

        @Override
    public List<southWestBankModel> getAccountDetails(){
        return list;
    }

    @Override
    public List<southWestBankModel> createAccount(){
        return createlist;
    }

    @Override
    public List<southWestBankModel> updateAccount(){
        return updatelist;
    }

    @Override
    public List<southWestBankModel> deleteAccount(){
        return deletelist;
    }
}
