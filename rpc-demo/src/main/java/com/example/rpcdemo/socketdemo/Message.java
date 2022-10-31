package com.example.rpcdemo.socketdemo;


import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class Message implements Serializable {
    private String content;
}
