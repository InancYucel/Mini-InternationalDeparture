package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {


        System.out.println("Esenboğa havalimanına hoşgeldiniz");

        String şartlar = "Yurtdışı çıkış kuralları...\n" +
                "Herhangibir siyasi yasağınızın bulunmaması gerekiyor\n"+
                "15 TL harç bedelini tam olarak yatırmanız gerekiyor\n"+
                "Gideceğiniz ülkeye vizenizin bulunması gerekiyor";

        String mesaj = "Yurtdışı şartlarından hepsini sağlamış olmanız gerekiyor";


        while(true){
            System.out.println("**********************************");
            System.out.println(şartlar);
            System.out.println("**********************************");


            Yolcu yolcu = new Yolcu();

            System.out.println("Harç Bedeli Kontrol ediliyor");
            Thread.sleep(3000);

            if(yolcu.yurtdisiHarciKontrol() == false){

                System.out.println(mesaj);
                continue;
            }

            System.out.println("Siyasi yasak kontrol ediliyor");
            Thread.sleep(3000);

            if(yolcu.siyasiYasakKontrol() == false){

                System.out.println(mesaj);
                continue;
            }

            System.out.println("Vize kontrol ediliyor");
            Thread.sleep(3000);

            if(yolcu.vizeDurumuKontrol() == false){

                System.out.println(mesaj);
                continue;
            }

            System.out.println("İşlemleriniz tamamlandı. Yurtdışına çıkış izniniz olumlu");
            break;
        }

    }
}
