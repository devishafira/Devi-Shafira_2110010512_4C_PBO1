# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data cat menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa merk dan kode cat, dan memberikan output berupa informasi detail dari kode tersebut seperti tahun produksi, jenis cat, dan warna cat.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Cat`, `CatDetail`, dan `CatBeraksi` adalah contoh dari class.

```bash
public class Cat {
    //    atribut dan enkapsulasi
    private String merk;
    private String kode;
    
//    construktor
    public Cat(String merk, String kode) {
        this.merk = merk;
        this.kode = kode;
    }
    
//    mutator (seter)
    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

//    accesor (getter)
    public String getMerk() {
        return merk;
    }

    public String getKode() {
        return kode;
    }
    
    public String displayInfo(){
       return "Merk: "+getMerk()+
              "\nKode: "+getKode(); 
    }
    
//    polymorphism (overloading)
    public String displayInfo(String kelas){
        return displayInfo() + "\nKelas: "+kelas;
    }
}

public class CatDetail extends Cat {
    //    overriding
    public CatDetail(String merk, String kode) {
        super(merk, kode);
    }
    
    public int getTahunProduksi() {
        return Integer.parseInt(getKode().substring(4, 6)) + 2000;
    }
     
    public String getJenis(){
        String kodeJenis = getKode().substring(0, 1);
//        seleksi switch
        switch (kodeJenis){
            case "M":
                return "Matte";
            case "G":
                return "Glosy";
            default:
                return "tidak ada jenis lain";
        }
    }
    
    public String getWarna(){
        String kodeWarna = getKode().substring(1, 4);
//        seleksi switch
        switch (kodeWarna){
            case "003":
                return "Merah";
            case "008":
                return "Biru";
            case "009":
                return "Hitam";
            default:
                return "tidak ada jenis lain";
        }
    }   
    
//    polymorphism (overriding)
    @Override
    public String displayInfo(){
        return super.displayInfo() +
                "\nJenis Cat: "+getJenis()+
                "\nWarna: "+getWarna()+
                "\nTahun Lahir: "+getTahunProduksi();
        
    }
}


package pbo;

import java.util.Scanner;

public class CatBeraksi{
    public static void main(String[] args) {

try{
    //io sederhana
    Scanner scanner = new Scanner (System.in);

    //array
        CatDetail[] cat = new CatDetail[2];
        for(int i=0; i<cat.length; i++) {
                System.out.print("Masukkan Merk cat "+(i+1)+" ");
                String merk = scanner.nextLine();
                System.out.print("Masukkan Kode  "+(i+1)+" ");
                String kode = scanner.nextLine();

        //        objek
                cat[i] = new CatDetail (merk, kode);
    }

        for(CatDetail data: cat) {
            System.out.println("==================");
            System.out.println("Data Cat: ");
            System.out.println(data.displayInfo());
        }
    } catch (NumberFormatException e){
        System.out.println("Kesalahan format cat: "+e.getMessage());
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Kesalahan format kode: "+e.getMessage());
    } catch (Exception e) {
        System.out.println("Kesalahan umum: "+e.getMessage());
    }
  }
}
```

2. **Object** adalah instance dari class. Pada kode ini, `cat[i] = new CatDetail(merk, kode);` adalah contoh pembuatan object.

```bash
cat[i] = new CatDetail(merk, kode);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `merk` dan `kode` adalah contoh atribut.

```bash
String merk;
String kode;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Cat` dan `CatDetail`.

```bash
public Mahasiswa(String merk, String kode) {
    this.merk =  merk;
    this.merk = merk;
}

public CataDetail(String merk, String kode) {
    super(merk, kode);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setMerk` dan `setKode` adalah contoh method mutator.

```bash
public void setMerk(String merk) {
    this.merk = merk;
}

public void setKode(String kode) {
    this.kode = kode;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getMerk`, `getKode`, `getTahunProduksi`, `getJenis`, dan `getWarna` adalah contoh method accessor.

```bash
public String getMerk() {
    return merk;
}

public String getKode() {
    return merk;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `merk` dan `kode` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String merk;
private String kode;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `CatDetail` mewarisi `Cat` dengan sintaks `extends`.

```bash
public class CatDetail extends Cat {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `Cat` merupakan overloading method `displayInfo` dan `displayInfo` di `CatDetail` merupakan override dari method `displayInfo` di `Cat`.

```bash
public String displayInfo(String kelas) {
    return displayInfo() + "\nKelas: " + kelas;
}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getJenis` dan seleksi `switch` dalam method `getWarna`.

```bash
public String getJenis(){
        String kodeJenis = getKode().substring(0, 1);
//        seleksi switch
        switch (kodeJenis){
            case "M":
                return "Matte";
            case "G":
                return "Glosy";
            default:
                return "tidak ada jenis lain";
        }
    }
    
    public String getWarna(){
        String kodeWarna = getKode().substring(1, 4);
//        seleksi switch
        switch (kodeWarna){
            case "003":
                return "Merah";
            case "008":
                return "Biru";
            case "009":
                return "Hitam";
            default:
                return "tidak ada jenis lain";
        }
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < cat.length; i++) {
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Masukkan Merk cat "+(i+1)+" ");
String merk = scanner.nextLine();
System.out.print("Masukkan Kode  "+(i+1)+" ");
String kode = scanner.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `CatDetail[] cat = new CatDetail[2];` adalah contoh penggunaan array.

```bash
CatDetail[] cat = new CatDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    catch (NumberFormatException e){
        System.out.println("Kesalahan format cat: "+e.getMessage());
    } catch (StringIndexOutOfBoundsException e) {
        System.out.println("Kesalahan format kode: "+e.getMessage());
    } catch (Exception e) {
        System.out.println("Kesalahan umum: "+e.getMessage());
    }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Devi Shafira
NPM: 2110010512
