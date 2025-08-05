class Solution {
    public int totalNumbers(int[] digits) {
        boolean[] check= new boolean[digits.length];
        Set<Integer> unique=new HashSet<>();
        int[] element=new int[3];
        helper(check,digits,unique,element,0);
        return unique.size();
    }
    public void helper(boolean[] check,int[] digits,Set<Integer> unique,int[] element,int depth){
        if(depth==3){
             if (element[0] != 0 && element[2] % 2 == 0) {
                int number = element[0] * 100 + element[1] * 10 + element[2];
                unique.add(number);
            }
            return;
        }
        for(int i=0;i<digits.length;i++){
            if(!check[i]){
            if(depth==0 && digits[i]==0)continue;
            else if(depth==2 && digits[i]%2!=0)continue;
            
            check[i]=true;
            element[depth]=digits[i];
            helper(check,digits,unique,element,depth+1);
            check[i]=false;
         }  
        }
    }
}