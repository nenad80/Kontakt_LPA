package com.hfad.kontakt_lpa;

import android.app.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends Activity {

    private PronadjenKontakt odabran = new PronadjenKontakt();
    private PronadjenTelefon nadjen = new PronadjenTelefon();
    private PronadjenEmail dobijen = new PronadjenEmail();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void nadjiKontakt(View view){

        TextView adresa = findViewById(R.id.adresa);
        TextView telefon = findViewById(R.id.telefon);
        TextView mejl = findViewById(R.id.mejl);

        Spinner izaberi = findViewById(R.id.izaberi);
        String izabranKontakt = String.valueOf(izaberi.getSelectedItem());
        String izabranTelefon = String.valueOf(izaberi.getSelectedItem());
        String izabranEmail = String.valueOf(izaberi.getSelectedItem());
        List<String> kontaktList = odabran.getKontakt(izabranKontakt);
        List<String> telefonList = nadjen.getTelefon(izabranTelefon);
        List<String> emailList = dobijen.getEmail(izabranEmail);
        StringBuilder kontaktFormatted = new StringBuilder();
        StringBuilder telefonFormatted = new StringBuilder();
        StringBuilder emailFormatted = new StringBuilder();

        for ( String k : kontaktList){
            kontaktFormatted.append(k).append('\n');
        }
        for( String t: telefonList){
            telefonFormatted.append(t).append('\n');
        }
        for(String e: emailList){
            emailFormatted.append(e).append('\n');
        }
         adresa.setText(kontaktFormatted);
         telefon.setText(telefonFormatted);
         mejl.setText(emailFormatted);
    }
      public void PozivLPA (View view){

        TextView p = findViewById(R.id.telefon);

          Toast.makeText(this, "Poziva ...", Toast.LENGTH_SHORT).show();
          Uri u = Uri.parse("tel:" + p.getText().toString());
          Intent i = new Intent(Intent.ACTION_DIAL,u);

          try
          {
              startActivity(i);
          }
          catch (SecurityException s){

              Toast.makeText(this, s.getMessage(),Toast.LENGTH_LONG).show();
          }
      }
      public void PosaljiEmail(View view){

          TextView e = (TextView) findViewById(R.id.mejl);
          String email = e.getText().toString();

          Toast.makeText(this, "clicked", Toast.LENGTH_LONG).show();

          Log.i("Send email", "");
          String[] TO = {email} ;
          String[] CC = {""};
          Intent emailIntent = new Intent(Intent.ACTION_SEND);

          emailIntent.setData(Uri.parse("mailto:" + email));
          emailIntent.setType("text/plain");
          emailIntent.putExtra(Intent.EXTRA_EMAIL,TO);
          emailIntent.putExtra(Intent.EXTRA_CC, CC);
          emailIntent.putExtra(Intent.EXTRA_SUBJECT, "");
          emailIntent.putExtra(Intent.EXTRA_TEXT, "");

          try {
              startActivity(Intent.createChooser(emailIntent, "Šalje mail..."));
              finish();
              Log.i("Finished sending email", "");
          } catch (android.content.ActivityNotFoundException ex) {
              Toast.makeText(MainActivity.this, "Nema instaliranog mejl klijenta.", Toast.LENGTH_SHORT).show();
          }
      }
}
