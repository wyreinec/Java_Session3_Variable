/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session3.part1;

/**
 *
 * Learn FGA JAVA Yohana Sri Rejeki
 */
public class day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // bilangan bulat
        byte a1;
        a1 = 1;
        byte b1 = 2;
        byte c1, d1, e1;
        c1 = 3;
        d1 = 4; 
        e1 = 5;
        byte f1 = 1, g1, h1 = 8;
        
//      System.out.println(g1);

        short b = 123;
        int c = 2000000000;
        long d = 3_000_000_000L;
          System.out.println(d);
          
        //floating
        float f = 2.1f;
        double g = 3.4;
          
        //character
        char ch = 'a';
        int nilaich = ch;
        char ch2 = 67;
        System.out.println(ch);
        System.out.println(ch2);
        System.out.println("nilai dari " + ch + " adalah " + nilaich);
          
        boolean kondisi = true;
        System.out.println(kondisi);
          
        String ucapan = "Hello World";
        System.out.println(ucapan);
          
        //primitive sudah ditanamkan dalam javanya jadi pemrosesannya cepat
        //non primitive berkaitan dengan variable reference
        
        //konversi otomatis
        System.out.println(12);
        
        //biner
        System.out.println(0b1100 + 0b101);
        
        //oktal
        System.out.println(017);
        
        //heksa
        System.out.println(0xf);
        
//        int num, String value;
//        boolean b1, b2;
//        String s1 = "1", s2;
//        double d1, double d2;
//        int i1, int i2;
//        int i3; i4;

        int okidentifier;
//        int 3DPointClass; //tidak valid
        int $OK2Identifier;
        int _also0K1d3ntifi3r;
//        int *$coffee; //tipenya * artinya pointer (tapi di java tidak mengenal pointer)
//        int hollywood@vine;
        int  __SStill0kbutKnotsonice$;
//        int public;

        int usia = 17;
//        int usia2 = 5;
        System.out.println("Usia saya adalah " + usia);
        System.out.println("Usia saya 5 tahun kemudian adalah " + usia + 5);
        System.out.println("Usia saya 5 tahun kemudian adalah " + (usia + 5));
        System.out.println(usia + 5 + " Usia saya 5 tahun kemudian");
        
        //kasus
        //coba buat program bagaimana menukarkan nilai dari 2 variable
        //variabel a = 5;
        //variabel b = 8;
        //hasilAkhir a=8, b=5;
        
        String varA = "5";
        String varB = "8";
        String temp;
        
        System.out.println("");
        System.out.println("Dengan Temp Variable");
        System.out.println("hasil awal variable A adalah " + varA);
        System.out.println("hasil awal variable B adalah " + varB);
        
        
        temp = varA;
        varA = varB;
        varB = temp;
        
        System.out.println("----------");
        System.out.println("hasil akhir variable A adalah " + varA);
        System.out.println("hasil akhir variable B adalah " + varB);
        
        //Xor operator
        int nilaiA = 5, nilaiB = 8;
        System.out.println("");
        System.out.println("XOR Operator");
        System.out.println("hasil awal variable A adalah " + nilaiA);
        System.out.println("hasil awal variable B adalah " + nilaiB);
        
        nilaiA = nilaiA^nilaiB;
        nilaiB = nilaiA^nilaiB;
        nilaiA = nilaiA^nilaiB;
        
        System.out.println("----------");
        System.out.println("hasil akhir nilai A adalah " + nilaiA);
        System.out.println("hasil akhir nilai A adalah " + nilaiB);
        
        
        byte x = 5;
        byte y = 10;
        int z = x + y;
        
        System.out.println(z);
    }
    
}
