package com.github.funthomas424242.licensecheck.example.thinlet;


import thinlet.*;

public class Calculator extends Thinlet {

    public Calculator() throws Exception {
        add(parse("calculator.xml"));
    }

    public static void main(String[] args) throws Exception {
        new FrameLauncher("Calculator", new Calculator(), 320, 240);
    }
}