package org.t248.useidea;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class Runthis {

    private int a;

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(1);
        list.add(5);
        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println("Runthis.main");
        System.out.println("123");
        List<String> list2 = new ArrayList<String>();
        list2.add(1, "123");
        int a = new Runthis().getA();
        System.err.println(a);
    }

    @Override
    public String toString() {
        return "Runthis{" +
                "a=" + a +
                '}';
    }
}
