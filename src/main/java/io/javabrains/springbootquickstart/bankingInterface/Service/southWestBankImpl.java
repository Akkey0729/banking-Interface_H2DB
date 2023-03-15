package io.javabrains.springbootquickstart.bankingInterface.Service;
import io.javabrains.springbootquickstart.bankingInterface.Model.southWestBankModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class southWestBankImpl implements southWestBankService {

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
