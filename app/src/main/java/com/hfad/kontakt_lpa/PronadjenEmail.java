package com.hfad.kontakt_lpa;

import java.util.ArrayList;
import java.util.List;

public class PronadjenEmail {
    List<String> getEmail(String izaberi){
        List<String> mejl = new ArrayList<>();
        switch(izaberi){
            case("Barajevo"):
                mejl.add("ujpbarajevo@beograd.gov.rs");
                break;
            case("Voždovac"):
                mejl.add("ujpvozdovac@beograd.gov.rs");
                break;
            case("Vračar"):
                mejl.add("ujpvracar@beograd.gov.rs");
                break;
            case("Grocka"):
                mejl.add("ujpgrocka@beograd.gov.rs");
                break;
            case("Zvezdara"):
                mejl.add("ujpzvezdara@beograd.gov.rs");
                break;
            case("Zemun"):
                mejl.add("ujpzemun@beograd.gov.rs");
                break;
            case("Lazarevac"):
                mejl.add("ujplazarevac@beograd.gov.rs");
                break;
            case("Mladenovac"):
                mejl.add("ujpmladenovac@beograd.gov.rs");
                break;
            case("Novi Beograd"):
                mejl.add("ujpnovibeograd@beograd.gov.rs");
                break;
            case("Obrenovac"):
                mejl.add("ujpobrenovac@beograd.gov.rs");
                break;
            case("Palilula"):
                mejl.add("ujppalilula@beograd.gov.rs");
                break;
            case("Rakovica"):
                mejl.add("ujprakovica@beograd.gov.rs");
                break;
            case("Savski venac"):
                mejl.add("ujpsavskivenac@beograd.gov.rs");
                break;
            case("Sopot"):
                mejl.add("ujpsopot@beograd.gov.rs");
                break;
            case("Stari grad"):
                mejl.add("ujpstarigrad@beograd.gov.rs");
                break;
            case("Surčin"):
                mejl.add("ujpsurcin@beograd.gov.rs");
                break;
            case("Čukarica"):
                mejl.add("ujpcukarica@beograd.gov.rs");
                break;
            default:
                System.out.println("Nije izabran nijedan mejl");
                break;
    }
    return mejl;
}
}