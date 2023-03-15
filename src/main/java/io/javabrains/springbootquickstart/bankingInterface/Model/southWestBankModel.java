package io.javabrains.springbootquickstart.bankingInterface.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name = "AccountDetails")
public class southWestBankModel {
    @Id
    @Column( name = "Account_Number")
    int Account_Number;
    @Column( name = "Account_Holder_Name")
    String Account_Holder_Name;
    @Column( name = "Balance")
    int Balance;

}
