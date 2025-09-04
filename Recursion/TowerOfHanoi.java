package Recursion;

class TowerOfHanoi{
    public static void towerOfHanoi(int n,String s,String h,String d){
        if(n==1){
            System.out.println("Transfer Disk "+n +"From "+s+" to "+d);
            return;
        }
        towerOfHanoi(n-1,s,d,h);
        System.out.println("Transfer Disk "+n +"From "+s+" to "+d);
        towerOfHanoi(n-1, h, s, d);
    }





    public static void main(String[] args) {
        int n=2;
        towerOfHanoi(n, "Source", "Helper", "Destination");

    }
}