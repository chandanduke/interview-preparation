public class TowerOfHanoi{

    public static void main(String []args){
        towerOfHanoi(2,"A","B","C");
    }

    static void towerOfHanoi(int n,String from,String to, String intermediate){

        if(n==1){
            System.out.println("move "+from +" to "+ to);
            return;
        }
        else{
            // Move n-1 from from peg to intermediate
            towerOfHanoi(n-1,from,intermediate,to);
            // Move the last disk from from to to peg
            System.out.println("move "+from +" to "+ to);
            // Move n-1 from intermediate to to peg
            towerOfHanoi(n-1,intermediate,to,from);

        }
    }
}