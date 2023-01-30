/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partB;

/**
 *
 * @author nehar
 */
public class code {
    public static void newarr(int arr[])
{
    for (int i = 0; i < arr.length; i++) {
    if (i % 2 == 0) {
      arr[i]= arr[i] * 2;
     } else {
       arr[i]= arr[i] * 3;
     }
   }  
  }
 
public static void main(String[] args){
   int arr[]= {1,10,17,42,46,52};
   newarr(arr);
   System.out.println("The elements in array: ");
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" "+"\n");
        }
}
}
    
