package com.sriman.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
 private String hose;
 private String villageOrStreet;
 private String mandal;
 private String sistrict;
 private String state;
 private Contact contact;
}
