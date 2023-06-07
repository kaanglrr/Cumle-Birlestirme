package com.yazlab.projeone.algoritma;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class algoritma {
    public String kelime_yolla(List<String> gelen){
        List<String> kelime_dizisi = new ArrayList<>();
        kelime_dizisi = (List<String>) ((ArrayList<String>) gelen).clone();
        String yeni_kelime = "";
        for (int i = 0; i <kelime_dizisi.size()-1; i++) {
            yeni_kelime = kelime(kelime_dizisi.get(i),kelime_dizisi.get(i+1));
            kelime_dizisi.set(i+1,yeni_kelime);
        }
        return yeni_kelime;
    }
    public String kelime(String text1, String text2){
        ArrayList<String> list1 = new ArrayList<String>();
        String[] words1 = text1.split(" ");
        for (int i = 0; i < words1.length; i++) {
            list1.add(words1[i]);
        }
        String[] words2 = text2.split(" ");
        for (int i = 0; i < words2.length; i++) {
            list1.add(words2[i]);
        }
        int lw1 = words1.length;
        int baslangic;
        int son;

        for (int i = 0; i < lw1; i++) {
            int x = 0;
            if(list1.get(i).contains(list1.get(lw1))) //ortak metnin baslangicini bul
            {
                baslangic=i;
                int a = lw1;
                int b = baslangic;
                for (int j = 0; j < lw1-baslangic; j++) {
                    if((a>=list1.size())||(b>=list1.size()))
                    {
                        break;
                    }
                    if(list1.get(b).contains(list1.get(a))){
                        x++;
                    }
                    b++;
                    a++;
                }
                son = lw1+x-1;              //ortak metnin bitisini bul
                System.out.println("Başlangıç: "+baslangic+" Son: "+son+" LW1: "+lw1+"list1 uzunlugu"+list1.size()+"x:"+x);
                for(int r = 0; r<x;r++){
                    int rr = lw1;
                    list1.remove(rr);
                    rr++;
                } // ortak kelimeleri cikar
                break;
            }
        }
        String str = String.join(" ", list1);
        return str;

    }


}