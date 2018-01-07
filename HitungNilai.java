import java.util.*;

class HitungNilai {

public static void main(String[] args) {

String nama, hadiah;

int n1, n2, n3,n4;

double rata2;

Scanner input = new Scanner(System.in);

System.out.println("PROGRAM HITUNG NILAI RATA-RATA");

System.out.print("Nama Siswa :");

nama = input.nextLine();

System.out.print("Masukan Nilai Pertandingan I :");

n1 = input.nextInt();

System.out.print("Masukan Nilai Pertandingan II :");

n2 = input.nextInt();

System.out.print("Masukan Nilai Pertandingan III :");

n3 = input.nextInt();

System.out.print("Masukan Nilai Pertadingan  IV :");

n4 =input.nextInt();

rata2 = (n1 + n2 + n3 +n4 ) / 4;

if(rata2 >= 85){

hadiah="Seperangkat Komputer P4";

}

else if(rata2 >= 70){

hadiah="Uang sebesar Rp. 500.000";

}

else{

hadiah="Mendapat hadiah hiburan";

}

System.out.println("Siswa yang bernama :" + nama);

System.out.println("Memperoleh nilai rata-rata : " + rata2 + "dari hasil perlombaan yang diikutinya");

System.out.println("Hadiah yang didapat adalah :" + hadiah);

}

}