package io.javabrains.springbootquickstart.bankingInterface.Controller;
import io.javabrains.springbootquickstart.bankingInterface.Model.southWestBankModel;
import io.javabrains.springbootquickstart.bankingInterface.Service.southWestBankService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class southWestBankController {
    private southWestBankService swbService;
    @GetMapping("/accountDetails")
    public List<southWestBankModel> getAccountDetails(){
            return swbService.getAccountDetails();
        }

}
