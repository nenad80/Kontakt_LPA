package com.hfad.kontakt_lpa;

import java.util.ArrayList;
import java.util.List;

public class PronadjenKontakt {

    List<String>getKontakt(String izaberi){
        List<String> adresa = new ArrayList<>();

        switch(izaberi){
            case("Barajevo"):
                adresa.add("Svetosavska 2");
            break;
            case("Voždovac"):
                adresa.add("Ustanička 53");
                break;
            case("Vračar"):
                adresa.add("Njegoševa 77");
                break;
            case("Grocka"):
                adresa.add("Bul. oslobođenja 39");
                break;
            case("Zvezdara"):
                adresa.add("Zahumska 23a");
                break;
            case("Zemun"):
                adresa.add("Magistratski trg 1");
                break;
            case("Lazarevac"):
                adresa.add("Karađorđeva 42");
                break;
            case("Mladenovac"):
                adresa.add(" Kralja Petra Prvog 217");
                break;
            case("Novi Beograd"):
                adresa.add("Bulevar Mihaila Pupina 167");
                break;
            case("Obrenovac"):
                adresa.add("Vojvode Mišića 195");
                break;
            case("Palilula"):
                adresa.add("Ilije Garašanina br. 5");
                break;
            case("Rakovica"):
                adresa.add("Miška Kranjca 12");
                break;
            case("Savski venac"):
                adresa.add("Kneza Miloša 69");
                break;
            case("Sopot"):
                adresa.add("Kosmajski trg 5");
                break;
            case("Stari grad"):
                adresa.add("Makedonska 42");
                break;
            case("Surčin"):
                adresa.add("Vojvođanska 108a");
                break;
            case("Čukarica"):
                adresa.add("Lješka 11");
                break;
            default:
                System.out.println("Nije izabrana nijedna LPA");
                break;
        }
        return adresa;
    }

}
