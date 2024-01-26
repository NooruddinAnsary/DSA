package Array;

public class TrappingWater {
    public static int trappedWater(int height[]) {//  T/C--> O(n)
        int n = height.length;

        // cacuate left max value of array
        int leftMax[]= new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] =Math.max(leftMax[i-1], height[i]);
        }
        // calculate right max value of array
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);

        }
        int trapped = 0;
        //loop
        for(int i=0; i<n; i++){
            //Waterlevel = min(leftMax, rightMax)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            //trappedWater = waterLevel- height
            trapped += waterLevel-height[i];
        }
        return trapped;
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println("trapped water= "+trappedWater(height));

        
    }
}
