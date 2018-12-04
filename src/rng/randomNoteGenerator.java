/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rng;

/**
 *
 * @author Greg
 */
public class randomNoteGenerator {

  
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("It's time to start your Practice!");
        System.out.println("Here are your Major & Minor Scales today.");
        
        int majorScale = (int) (12 * Math.random()+ 1);
        
        switch (majorScale){
            case 1: System.out.println("A Major");
            break;
            case 2: System.out.println("A# / B flat Major");
            break;
            case 3: System.out.println("B Major");
            break;
            case 4: System.out.println("C Major");
            break;
            case 5: System.out.println("C# / D flat Major");
            break;
            case 6: System.out.println("D Major");
            break;
            case 7: System.out.println("D# / E flat Major");
            break;
            case 8: System.out.println("E Major");
            break;
            case 9: System.out.println("F Major");
            break;
            case 10: System.out.println("F# / G flat Major");
            break;
            case 11: System.out.println("G Major");
            break;
            case 12: System.out.println("G# / A flat Major");
            break;
            
        }//majorScale Switch
        
        
        
        int minorScale = (int) (12 * Math.random()+ 1);
        
         switch (minorScale){
            case 1: System.out.println("A Minor");
            break;
            case 2: System.out.println("A# / B flat Minor");
            break;
            case 3: System.out.println("B Minor");
            break;
            case 4: System.out.println("C Minor");
            break;
            case 5: System.out.println("C# / D flat Minor");
            break;
            case 6: System.out.println("D Minor");
            break;
            case 7: System.out.println("D# / E flat Minor");
            break;
            case 8: System.out.println("E Minor");
            break;
            case 9: System.out.println("F Minor");
            break;
            case 10: System.out.println("F# / G flat Minor ");
            break;
            case 11: System.out.println("G  Minor");
            break;
            case 12: System.out.println("G# / A flat Minor ");
            break;
            
        }//minorScale Switch

         System.out.println("==========================================");
    
        System.out.println("Here is your Major Scale Starting Position: ");
        
        int majorPosition = (int) (5 * Math.random()+ 1);
        
     switch (majorPosition){
            case 1: System.out.println("C Major Shape");
            break;
            case 2: System.out.println("A Major Shape");
            break;
            case 3: System.out.println("G Major Shape");
            break;
            case 4: System.out.println("E Major Shape");
            break;
            case 5: System.out.println("D Major Shape ");
            break;
          }//majorPosition

    int minorPosition = (int) (5 * Math.random()+ 1);
      
        System.out.println("Here is your Minor Scale Starting Position: ");
    
    switch (minorPosition){
            case 1: System.out.println("C Minor Shape");
            break;
            case 2: System.out.println("A Minor Shape");
            break;
            case 3: System.out.println("G Minor Shape");
            break;
            case 4: System.out.println("E Minor Shape");
            break;
            case 5: System.out.println("D Minor Shape ");
            break;
            }//minorPosition
          
         System.out.println("==========================================");
         System.out.println("Here is your Scale to be extended:");
              int extendScale = (int) (5 * Math.random()+ 1);
        
     switch (extendScale){
            case 1: System.out.println("A Major");
            break;
            case 2: System.out.println("A# / B flat Major");
            break;
            case 3: System.out.println("B Major");
            break;
            case 4: System.out.println("C Major");
            break;
            case 5: System.out.println("C# / D flat Major");
            break;
            case 6: System.out.println("D Major");
            break;
            case 7: System.out.println("D# / E flat Major");
            break;
            case 8: System.out.println("E Major");
            break;
            case 9: System.out.println("F Major");
            break;
            case 10: System.out.println("F# / G flat Major ");
            break;
            case 11: System.out.println("G  Major");
            break;
            case 12: System.out.println("G# / A flat Major ");
            break;
          }//extendScalePosition
        
         
         System.out.println("==========================================");       
      
         int guitarExtendedPosition = (int) (5 * Math.random() + 1);
        
        System.out.println("Here is your Extended Scale Pattern:"); 
             
         switch (guitarExtendedPosition){
            case 1: System.out.println("1st Position");
            break;
            case 2: System.out.println("2nd Position");
            break;
            case 3: System.out.println("3rd Position");
            break;
            case 4: System.out.println("4th Position");
            break;
            case 5: System.out.println("5th Position");
            break;
            
        }//guitarExtendedPosition
        
        System.out.println("==========================================");
        
        int BassScale = (int) (12 * Math.random()+ 1);
        
        System.out.println("Here is your Bass Scale for today!:");
         
        switch (BassScale){
            case 1: System.out.println("A ");
            break;
            case 2: System.out.println("A# / B flat ");
            break;
            case 3: System.out.println("B ");
            break;
            case 4: System.out.println("C ");
            break;
            case 5: System.out.println("C# / D flat ");
            break;
            case 6: System.out.println("D ");
            break;
            case 7: System.out.println("D# / E flat ");
            break;
            case 8: System.out.println("E ");
            break;
            case 9: System.out.println("F ");
            break;
            case 10: System.out.println("F# / G flat ");
            break;
            case 11: System.out.println("G ");
            break;
            case 12: System.out.println("G# / A flat ");
            break;
            
        }//BassScale Switch
        
         System.out.println("==========================================");
        
        int BassPosition = (int) (5 * Math.random() + 1);
        
        System.out.println("Here is your Bass Pattern:"); 
             
         switch (BassPosition){
            case 1: System.out.println("1st Position");
            break;
            case 2: System.out.println("2nd Position");
            break;
            case 3: System.out.println("3rd Position");
            break;
            case 4: System.out.println("4th Position");
            break;
            case 5: System.out.println("5th Position");
            break;
            
        }//BassPosition
         
        System.out.println("==========================================");
         
            int bassExtendedPosition = (int) (5 * Math.random() + 1);
        
        System.out.println("Here is your Extended Scale Pattern:"); 
             
         switch (bassExtendedPosition){
            case 1: System.out.println("1st Position");
            break;
            case 2: System.out.println("2nd Position");
            break;
            case 3: System.out.println("3rd Position");
            break;
            case 4: System.out.println("4th Position");
            break;
            case 5: System.out.println("5th Position");
            break;
            
        }//bassExtendedPosition
        
        System.out.println("==========================================");
            
        int BanjoScale = (int) (12 * Math.random()+ 1);
        
        System.out.println("Here is your Banjo Scale for today!:");
         
        switch (BanjoScale){
            case 1: System.out.println("A ");
            break;
            case 2: System.out.println("A# / B flat ");
            break;
            case 3: System.out.println("B ");
            break;
            case 4: System.out.println("C ");
            break;
            case 5: System.out.println("C# / D flat ");
            break;
            case 6: System.out.println("D ");
            break;
            case 7: System.out.println("D# / E flat ");
            break;
            case 8: System.out.println("E ");
            break;
            case 9: System.out.println("F ");
            break;
            case 10: System.out.println("F# / G flat ");
            break;
            case 11: System.out.println("G ");
            break;
            case 12: System.out.println("G# / A flat ");
            break;
            
        }//BanjoScale Switch
        
        System.out.println("==========================================");
    }//main
    
}//class
