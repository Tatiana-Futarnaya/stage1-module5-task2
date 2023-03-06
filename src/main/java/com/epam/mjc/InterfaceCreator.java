package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        Operation<Integer> operation=(arg)->{
            List<Integer> list=new ArrayList<>();
            for (Integer item: arg) {
              list.add(item/divider);
            }
            return list;
        };

       return operation;
    }
}
