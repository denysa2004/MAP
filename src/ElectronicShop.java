public class ElectronicShop {

     public int cheapestTastatur(int[] tastatur){
         int minimumPrice=tastatur[0];
         for(int index=1;index<tastatur.length;index++){
             if(tastatur[index]<minimumPrice){
                 minimumPrice=tastatur[index];
             }
         }
         return minimumPrice;

     }
}
