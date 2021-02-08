package proromanos;
public class ProRomanos {

    public static void main(String[] args) {
        int i, miles, centenas, decenas, unidades;
      String romano = "";
       int aleatorio = (int)(Math.random()*2000);
       miles = aleatorio/ 1000;
      centenas = aleatorio / 100 % 10;
      decenas = aleatorio / 10 % 10;
      unidades = aleatorio % 10;
              
      for (i = 1; i <= miles; i++) {
             romano = romano + "M";
      }
      if (centenas == 9) {
          romano = romano + "CM";
      } else if (centenas >= 5) {
                     romano = romano + "D";
                     for (i = 6; i <= centenas; i++) {
                            romano = romano + "C";
                     }
      } else if (centenas == 4) {
                      romano = romano + "CD";
      } else {
                  for (i = 1; i <= centenas; i++) {
                         romano = romano + "C";
                  }
      }
      if (decenas == 9) {
           romano = romano + "XC";
      } else if (decenas >= 5) {
                      romano = romano + "L";
                      for (i = 6; i <= decenas; i++) {
                            romano = romano + "X";
                      }
      } else if (decenas == 4) {
                      romano = romano + "XL";
      } else {
                    for (i = 1; i <= decenas; i++) {
                           romano = romano + "X";
                    }
      }
      if (unidades == 9) {
           romano = romano + "IX";
      } else if (unidades >= 5) {
                      romano = romano + "V";
                      for (i = 6; i <= unidades; i++) {
                             romano = romano + "I";
                      }
      } else if (unidades == 4) {
                      romano = romano + "IV";
      } else {
                  for (i = 1; i <= unidades; i++) {
                         romano = romano + "I";
                  }
      }
                
      System.out.println(aleatorio + " En numeros romanos es " + romano);
    }
  
  }
