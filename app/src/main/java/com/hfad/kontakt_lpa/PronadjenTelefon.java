package com.hfad.kontakt_lpa;

import java.util.ArrayList;
import java.util.List;

public class PronadjenTelefon {
    List<String>getTelefon(String izaberi){
        List<String> telefon = new ArrayList<>();

        switch(izaberi){
            case("Barajevo"):
                telefon.add("0118302637");
                break;
            case("Voždovac"):
                telefon.add("0112443192");
                break;
            case("Vračar"):
                telefon.add("0113081415");
                break;
            case("Grocka"):
                telefon.add("0118501533");
                break;
            case("Zvezdara"):
                telefon.add("0112422852");
                break;
            case("Zemun"):
                telefon.add("0113778629");
                break;
            case("Lazarevac"):
                telefon.add("0118126502");
                break;
            case("Mladenovac"):
                telefon.add(" 0117740659");
                break;
            case("Novi Beograd"):
                telefon.add("0113106839");
                break;
            case("Obrenovac"):
                telefon.add("0118721281");
                break;
            case("Palilula"):
                telefon.add("0113340165");
                break;
            case("Rakovica"):
                telefon.add("0113051856");
                break;
            case("Savski venac"):
                telefon.add("0112061763");
                break;
            case("Sopot"):
                telefon.add("0112834012");
                break;
            case("Stari grad"):
                telefon.add("0113300542");
                break;
            case("Surčin"):
                telefon.add("0116103545");
                break;
            case("Čukarica"):
                telefon.add("0113052420");
                break;
            default:
                System.out.println("Nije izabran nijedan telefon");
                break;
        }
        return telefon;
    }
}
