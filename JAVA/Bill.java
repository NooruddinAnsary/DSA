package JAVA;

import java.util.*;

public class Bill {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ente cost of Pencil: ");
        float pencil = sc.nextFloat();

        System.out.print("\nEnter cost of Pen: ");
        float pen = sc.nextFloat();

        System.out.print("\nEnter cost of Eraser: ");
        float eraser = sc.nextFloat();

        float totalWithoutGST = pencil + pen + eraser;
        float gst = (totalWithoutGST * 18/100);
        float totalWithGST = totalWithoutGST+ gst;

        System.out.println("Pencil price:               "+ pencil);
        System.out.println("Pen price:                  "+ pen);
        System.out.println("Eraser price:               "+ eraser);
        System.out.println("GST(18%):                   "+gst);
        System.out.println("Total bill (including GST): "+totalWithGST);
        sc.close();
    }
}
