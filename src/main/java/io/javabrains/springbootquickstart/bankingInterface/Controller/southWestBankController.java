//package io.javabrains.springbootquickstart.bankingInterface.Controller;
//import io.javabrains.springbootquickstart.bankingInterface.Model.southWestBankModel;
//import io.javabrains.springbootquickstart.bankingInterface.Service.southWestBankService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class southWestBankController {
//    @Autowired
//    private southWestBankService swbService;
//    @GetMapping("/accountDetails")
//    public List<southWestBankModel> getAccountDetails(){
//            return swbService.getAccountDetails();
//        }
//
//    @PostMapping("/createAccount")
//    public List<southWestBankModel> createAccount(){
//        return swbService.createAccount();
//    }
//
//    @PutMapping("/updateAccount")
//    public List<southWestBankModel> updateAccount(){
//        return swbService.updateAccount();
//    }
//
//    @DeleteMapping("/deleteAccount")
//    public List<southWestBankModel> deleteAccount(){
//        return swbService.deleteAccount();
//    }
//}
//////////////////////////////////////////////DYNAMIC CODE BELOW///////////////////////////////////////////////////////
package io.javabrains.springbootquickstart.bankingInterface.Controller;

import java.util.List;

//import io.javabrains.springbootquickstart.bankingInterface.Service.southWestBankImpl;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootquickstart.bankingInterface.Model.southWestBankModel;
import io.javabrains.springbootquickstart.bankingInterface.Repository.southWestBankRepository;




@RestController
public class southWestBankController {

    @Autowired
    private southWestBankRepository swbRepository;

//    public southWestBankController(southWestBankRpository swbRpository) {
//        this.swbRpository = swbRpository;
//    }


    @PostMapping("/createAccount")
    public String createAccount(@RequestBody southWestBankModel swbModel) {
        swbRepository.save(swbModel);
        return "Saved";
        //return new ResponseEntity<List<southWestBankModel>>((List<southWestBankModel>) swbService.getAccountDetails(swbModel), HttpStatus.CREATED);
    }
//    @GetMapping("/getAccountDetailsNew")
//    public ResponseEntity<List<southWestBankModel>> getAccountDetailsNew() {
//        return new ResponseEntity<>(swbService.getAccountDetailsNew(),HttpStatus.OK);
//    }
    @GetMapping("/accountDetails")
    public List<southWestBankModel> getAccountDetails(){
        return swbRepository.findAll();
        //return new ResponseEntity<southWestBankModel>((southWestBankModel) swbService.createAccount(Clientid), HttpStatus.OK);
    }

    @PutMapping("/updateAccount/{Account_Number}")
    public String updateAccount(@PathVariable long Account_Number, @RequestBody southWestBankModel swbModel){
        //List<southWestBankModel> list = swbRepository.findByAccount_Number(account_Number);
        swbRepository.save(swbModel);
        return "Updated Successfully";
    }
    @DeleteMapping("/deleteAccount/{account_Number}")
    public ResponseEntity<String> deleteAccount(@PathVariable long account_Number) {
        swbRepository.deleteById(account_Number);
        return new ResponseEntity<String>("Id deleted successfully",HttpStatus.OK);
    }



}
