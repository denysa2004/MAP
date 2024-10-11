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

     public int mostExpensivePurchase(int[] usb,int budget){
         int maximumPrice=0;
         for(int index=0;index<usb.length;index++){
             if(usb[index]>maximumPrice && budget>usb[index]){
                 maximumPrice=usb[index];
             }
         }
         return maximumPrice;
     }

     public int mostExpensivePurchases(int[] tastatur,int[] usb,int budget){
         int maximumPrice=0;
         for(int index=0;index<usb.length;index++){
             for(int index1=0;index1<tastatur.length;index1++){
                 if(usb[index]+tastatur[index1]<budget && usb[index]+tastatur[index1]>maximumPrice){
                     maximumPrice=usb[index]+tastatur[index1];
                 }
             }
         }
           if(maximumPrice!=0)
             return maximumPrice;
           else
               return -1;
     }
}
