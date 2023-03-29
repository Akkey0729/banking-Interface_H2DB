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
//////////////////////////////////////////////DYNAMIC CODE BELOW///////////////////////////////////////////////////////
//package io.javabrains.springbootquickstart.bankingInterface.Controller;
//
//import java.util.List;
//
//import io.javabrains.springbootquickstart.bankingInterface.Service.southWestBankImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import io.javabrains.springbootquickstart.bankingInterface.Model.southWestBankModel;
//import io.javabrains.springbootquickstart.bankingInterface.Service.southWestBankService;
//
//
//
//
//@RestController
//public class southWestBankController {
//
//    @Autowired
//    public southWestBankImpl swbService;
//
//    public southWestBankController(southWestBankImpl swbService) {
//        this.swbService = swbService;
//    }
//
//    @PostMapping("/accountDetails")
//    public ResponseEntity<southWestBankModel> getAccountDetails(@RequestBody southWestBankModel swbModel) {
//        return new ResponseEntity<southWestBankModel>(swbService.getAccountDetails(swbModel), HttpStatus.CREATED);
//    }
//    @GetMapping("/getAccountDetailsNew")
//    public ResponseEntity<List<southWestBankModel>> getAccountDetailsNew() {
//        return new ResponseEntity<>(swbService.getDetails(),HttpStatus.OK);
//    }
//    @GetMapping("createAccount")
//    public ResponseEntity<southWestBankModel> createAccount(@PathVariable int Clientid){
//        return new ResponseEntity<>(swbService.createAccount(Clientidid), HttpStatus.OK);
//    }
//
//    @PutMapping("/updateAccount")
//    public ResponseEntity<southWestBankModel> updateAccount(@PathVariable int Clientid, @RequestBody southWestBankModel swbModel){
//        return new ResponseEntity<southWestBankModel>(swbService.updateAccount(Clientidid, swbModel),HttpStatus.OK);
//    }
//    @DeleteMapping("/deleteAccount")
//    public ResponseEntity<String> deleteAccount(@PathVariable int Clientid) {
//        swbService.deleteAccount(Clientid);
//        return new ResponseEntity<String>("Id deleted successfully",HttpStatus.OK);
//    }
//
//
//
//}
