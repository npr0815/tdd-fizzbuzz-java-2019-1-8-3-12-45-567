package com.thoughtworks.tdd;

public class HomeWork {
    public String fizzBuzz(int i) {
        String result = "";
        if (i % 3 ==0)
            result += "Fizz";
        if (i % 5 ==0)
            result += "Bizz";
        if (i % 7 ==0)
            result += "Whizz";
        if (result == "")
            result = Integer.toString(i);
        return result;
    }
}
