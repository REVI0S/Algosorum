/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package benimalgoritmasorum;

import java.util.Scanner;

/**
 *
 * @author Brute
 */
public class Benimalgoritmasorum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner klavye = new Scanner(System.in);
        System.out.println("Lütfen toplam harcama miktarını giriniz!!");
        int fiyat = klavye.nextInt();
        int puan = 0;
        int ekle = 0;
 
        if (fiyat <= 200) {
            puan += 10;
        } else if (fiyat >= 200 && fiyat <= 400) {
            puan += 15;
        } else if (fiyat >= 400) {
            puan += 20;
        }
 
        do {
            fiyat = fiyat - 50;
            ekle = ekle + puan;
        } while (fiyat > 49);
 
        System.out.println("Yaptığınız harcamaya göre kazandığınız TL miktarı= " + ekle + " TL");
 
        System.out.println("Kazandığınız miktarı LÖSEV e bağışlamak ister misiniz? (evet - hayir) ");
        String cevap = klavye.next();
 
        if (cevap.equalsIgnoreCase("evet")) {
            System.out.println("Toplam " + ekle + " TL LÖSEV e bağışlanmıştır. Bağışınız için teşekkür ederiz...");
 
        } else {
            System.out.println("İyi günler dileriz!!");
        }
 
    }
}
