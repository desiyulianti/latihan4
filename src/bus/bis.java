/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

/**
 *
 * @author MOKLET-2
 */
public class bis {
    public int penumpang;
    public int maxpenumpang;
    
    public bis(int maxpenumpang){
        this.maxpenumpang = maxpenumpang;
        penumpang = 0;
    }
    //method mutator
    public void addpenumpang(int penumpang){
       int temp;
        temp = this.penumpang + penumpang;
        if(temp>maxpenumpang){
        System.out.println("penumpang melebihi kuota");
        }
        else{
         this.penumpang = temp;
     
        }
    }
    public void getpenumpang(double password){
       if(password==24){
        System.out.println("Pasword benar");
       } 
       else{
        System.out.println("pasword salah");
    }
    
       }
    public void cetakpenumpang(){
        System.out.println("Penumpang bus sekarang : "+penumpang);
        System.out.println("maksimum Penumpang yang seharusnya adalah : "+maxpenumpang);   
    }
}
  //pada program diatas terdapat password yang digunakan untuk memproteksi atau melindungi penambahan penumpang pada kelas Bus3
  //jika password yang dimasukkan benar maka akan menambahkan jumlah penumpang namun jika salah akan ada pemberitahuan.





