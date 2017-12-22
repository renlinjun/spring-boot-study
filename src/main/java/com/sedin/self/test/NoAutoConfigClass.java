package com.sedin.self.test;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service
@Repository

public class NoAutoConfigClass {

    public void getMsg() {
        System.out.println("我很好");
    }
}
