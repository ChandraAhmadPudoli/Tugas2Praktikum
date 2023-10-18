package Praktikum2;

    public class Matematika implements InterfaceMatematika {

        public int pertambahan(int a, int b){
            int hasil = a + b;
            System.out.println("Hasil : " + hasil);
            return hasil;
        }
        
        public int pengurangan(int a, int b){
            int hasil = a - b;
            System.out.println("Hasil : " + hasil);
            return hasil;
        }
        
        public int perkalian(int a, int b){
            int hasil = a * b;
            System.out.println("Hasil : " + hasil);
            return hasil;
        }
        
        public int pembagian(int a, int b){
            
            int hasil = a / b;
            System.out.println("Hasil : " + hasil);
            return hasil;
        }
    }

