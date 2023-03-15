package io.javabrains.springbootquickstart.bankingInterface.Controller;
import io.javabrains.springbootquickstart.bankingInterface.Model.southWestBankModel;
import io.javabrains.springbootquickstart.bankingInterface.Service.southWestBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class southWestBankController {
    @Autowired
    private southWestBankService swbService;
    @GetMapping("/accountDetails")
    public List<southWestBankModel> getAccountDetails(){
            return swbService.getAccountDetails();
        }

    @PostMapping("/createAccount")
    public List<southWestBankModel> createAccount(){
        return swbService.createAccount();
    }

    @PutMapping("/updateAccount")
    public List<southWestBankModel> updateAccount(){
        return swbService.updateAccount();
    }

    @DeleteMapping("/deleteAccount")
    public List<southWestBankModel> deleteAccount(){
        return swbService.deleteAccount();
    }
}
