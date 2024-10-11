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
     public int mostExpensiveItem(int[] tastatur,int[] usb){
         int maximumItem=0;
         for(int index=0;index<usb.length;index++){
             if(usb[index]>maximumItem){
                 maximumItem=usb[index];
             }
         }
         for(int index=0;index<tastatur.length;index++){
             if(tastatur[index]>maximumItem){
                 maximumItem=tastatur[index];
             }
         }
         return maximumItem;
     }
}
