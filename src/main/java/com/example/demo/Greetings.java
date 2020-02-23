package com.example.demo;

public class Greetings {

    public String greet(String name) {


        if (name == null) {
            return "Witaj, mój przyjacielu";


        }
        else if(name.matches(".*\\d.*")){
            return "Z liczbami sie nie witam";
        }

        else if

        (name.equals(name.toUpperCase())) {
            return "WITAJ, " + name;
        } else if (name.contains(",")) {

            if (name.split(",").length == 2) {

                String[] tab = name.split(",");
                tab[0] = tab[0].trim();
                tab[1] = tab[1].trim();
                return tab[0] + " i " + tab[1];
            } else if (name.split(",").length == 3) {

                String[] tab = name.split(",");
                tab[0] = tab[0].trim();
                tab[1] = tab[1].trim();
                tab[2] = tab[2].trim();

                if (tab[0].equals(tab[0].toUpperCase())
                        || tab[1].equals(tab[1].toUpperCase())
                        || tab[2].equals(tab[2].toUpperCase())) {
                    int count = 0;
                    for (int i = 0; i < tab.length; i++) {
                        if (tab[i].equals(tab[i].toUpperCase())) {
                            count++;
                        }
                    }
                    if (count == 1) {
                        return greetingsOneUpperCase(tab);

                    }
                }

                return tab[0] + ", " + tab[1] + " i " + tab[2];
            }


        }


        return "Witaj, " + name;
    }

    public static String greetingsOneUpperCase(String[] tab) {
        if (tab[0].equals(tab[0].toUpperCase())
                && !tab[1].equals(tab[1].toUpperCase())
                && !tab[2].equals(tab[2].toUpperCase())) {
            return tab[1] + " i " + tab[2] + ", witajcie! WITAJ " + tab[0] + "!";
        } else if (!tab[0].equals(tab[0].toUpperCase())
                && tab[1].equals(tab[1].toUpperCase())
                && !tab[2].equals(tab[2].toUpperCase())) {
            return tab[0] + " i " + tab[2] + ", witajcie! WITAJ " + tab[1] + "!";
        } else if (!tab[0].equals(tab[0].toUpperCase())
                && !tab[1].equals(tab[1].toUpperCase())
                && tab[2].equals(tab[2].toUpperCase())) {
            return tab[0] + " i " + tab[1] + ", witajcie! WITAJ " + tab[2] + "!";
        }

        return "";
    }
}
