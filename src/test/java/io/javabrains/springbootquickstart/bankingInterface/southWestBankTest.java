package io.javabrains.springbootquickstart.bankingInterface;

import io.javabrains.springbootquickstart.bankingInterface.Model.southWestBankModel;
import io.javabrains.springbootquickstart.bankingInterface.Repository.southWestBankRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@SpringBootTest
public class southWestBankTest {

    @Autowired
    private southWestBankRepository swbRepository;

        @Test
        public void saveSouthWestBankTest() {
            southWestBankModel swbModel = new southWestBankModel();
            swbModel.setAccount_Number(1001);
            swbModel.setAccount_Holder_Name("Akshay Kumar Gupta");
            swbModel.setBalance(14000);
            swbRepository.save(swbModel);
        }
        @Test
        public void getAccountDetailsTest() {
            List<southWestBankModel> list=swbRepository.findAll();
            assertThat(list.size()).isGreaterThan(0);

        }
        @Test
        public void updateSouthWestBankTest() {
            //southWestBankModel swbModel= swbRepository.findById(1).get().getAccount_Holder_Name();
            southWestBankModel swbModel= swbRepository.findById(1L).get();
            swbModel.setAccount_Holder_Name("Anany Johari");
            swbRepository.save(swbModel);

            Assertions.assertNotEquals("Anany Johari", swbRepository.findById(1L).get().getAccount_Holder_Name());

        }
        @Test
        public void fetchDeletedAccountTest() {
            swbRepository.deleteById(11L);
            assertThat(swbRepository.existsById(10L)).isFalse();
        }
    }

