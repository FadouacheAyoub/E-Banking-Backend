package me.fadouache.ebankingbackend.dtos;

import lombok.Data;

@Data
public class CustomerDTO {
    private Long id;
    private String Nom;
    private String Email;
}
