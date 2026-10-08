package com.DSA.string;

public class String_builder {
    static void main(String[] args) {


        String str = "programming";
        StringBuilder sb = new StringBuilder(str);
        sb.append(str);
        sb.append(1234); //add at end

        sb.insert(0,12.6); // add at what index you want

        sb.setCharAt(5, '9'); //update the specific index to char

sb.reverse();
sb.delete(0,3);

        System.out.println(sb.toString()); //as sb and string are two different classes

    }
}
