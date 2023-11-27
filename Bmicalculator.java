
package bmicalculator;

public class Bmicalculator {
public static void main (String[] args){
         String nama = "Aming Atima Rambu Sedu Tegi";
          int bb = 51;
          double tb = 1.50;
          int umur = 20;
          double BMI;
         
          System.out.println("nama:" +nama);
          System.out.println("umur:" +umur);
          System.out.println("tb:" +tb);
          System.out.println("bb:" +bb);
          
           BMI = (bb/(tb * tb));
          
          if (BMI <18.5){
               System.out.println(String.format("BMI: %.2f", BMI));
               System.out.println("BERAT BADAN SAYA KURANG");
          }
          else if(BMI <24.9){
               System.out.println(String.format("BMI: %.2f", BMI));
               System.out.println("BERAT BADAN SAYA NORMAL/IDEAL");
          }
          else if (BMI <29.9){
               System.out.println(String.format("BMI: %.2f", BMI));
               System.out.println("BERAT BADAN SAYA LEBIH/GEMUK");
          }
          else{
               System.out.println(String.format("BMI: %.2f", BMI));
                 System.out.println("Obesitas");
          }
          }
          }
 
    

    
    

