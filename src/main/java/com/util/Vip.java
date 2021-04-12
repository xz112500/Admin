package com.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vip {
    private String username;
    private String password;
    private String qq;
    private String address;
    private String remarks;
}
