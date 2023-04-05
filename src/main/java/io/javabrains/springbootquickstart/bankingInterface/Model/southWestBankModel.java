package io.javabrains.springbootquickstart.bankingInterface.Model;



import jakarta.persistence.*;
import lombok.*;

import java.util.Objects;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class southWestBankModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    public long Account_Number;
    @Column
    private String Account_Holder_Name;
    @Column
    private long Balance;

}