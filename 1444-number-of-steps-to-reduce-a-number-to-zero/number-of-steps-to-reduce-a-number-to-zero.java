class Solution {
    public int numberOfSteps(int num) {
        return help(num,0);
    }
     private int help(int num,int c)
      {
        if(num == 0) 
            return c ;
        if(num%2==0){
           return help(num/2,++c);
        }
           return help(num-1,++c);
        

      }
}