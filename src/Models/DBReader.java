/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author joseap
 */
public class DBReader {
    String vechiclesResource = "vehiclesDB.dat";
    
    public static ArrayList<ArrayList<String>> getValues(String dbPath) {
       FileInputStream stream = null;
       try {
           stream = new FileInputStream(dbPath);
       } catch (FileNotFoundException e) {
           e.printStackTrace();
       }
       BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
       String strLine;
       ArrayList<ArrayList<String>> data = new ArrayList<>();
       try {
           while ((strLine = reader.readLine()) != null) {
               ArrayList<String> register = new ArrayList<>();
               //System.out.println(": " + strLine);
               Collections.addAll(register, strLine.trim().split(","));
               data.add(register);
           }
       } catch (IOException e) {
           e.printStackTrace();
       }
       try {
           reader.close();
       } catch (IOException e) {
           e.printStackTrace();
       }
       return data;
   }
    
    public static ArrayList<IAutomovil> getVehicles() {
        ArrayList<ArrayList<String>> data = getValues("vehiclesDB.dat");
        ArrayList<IAutomovil> automoviles = new ArrayList<>();
        // serie,marca,modelo,año,price,typo
        for (ArrayList<String> r : data) {
            float price = Float.parseFloat( r.get(4).substring(1));
            String type = r.get(5);
            Automovil auto = new Automovil(r.get(0), r.get(1), r.get(2), r.get(3), price);
            IAutomovil iauto = null;
            if (type.equals("sedan")) {
                iauto = new AutomovilSedan(auto);
            } else {
                iauto = new AutomovilPickUp(auto);
            }
            automoviles.add(iauto);
        }
        Collections.sort(automoviles, new Comparator<IAutomovil>() {
            @Override 
            public int compare(IAutomovil x, IAutomovil y) {
                return x.getMarca().compareTo(y.getMarca());
            }
        });

        return automoviles;
    }
}