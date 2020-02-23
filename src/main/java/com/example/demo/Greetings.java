package com.example.demo;

public class Greetings {

    public String greet(String name) {


        if (name == null) {
            return "Witaj, mój przyjacielu ";

        } else if (name.equals((name.toUpperCase()))) {
            return "Witaj" + name;

        } else if (name.contains(",")) {
            if (name.split(",").length == 2) {
                String[] tab = name.split(",");
                tab[0]=tab[0].trim();
                tab[1] = tab[1].trim();
                return tab[0] + "i" + tab[1];

            }
        }else if(name.contains(",")){
            if (name.split(",").length == 3){
                String[] tab = name.split(",");
                tab[0]=tab[0].trim();
                tab[1]=tab[1].trim();
                tab[2]=tab[2].trim();
                return tab[0]+"i"+ tab[1]+"i"+ tab[2];

            }
        }

        return "Witaj" + name;

    }
}
