package com.alex.demo.rest;

import org.springframework.stereotype.Service;

@Service
public class SomeServiceImpl implements ISomeService {
	@Override
    public void sayHi(String msg) {
        System.out.println(msg);
    }
}
