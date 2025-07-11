class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] arr1 = new int [nums1.length];
        Stack <Integer> st = new Stack<>();
        int [] arr = new int [nums2.length];

                for(int i=nums2.length-1;i>=0;i--){
                    while(!st.isEmpty()&& nums2[i]>=st.peek()){
                            st.pop();
                    }
                    if(st.isEmpty()){
                        arr[i]= -1;
                    }
                    else {
                        arr[i] = st.peek();
                    }
                    st.push(nums2[i]);
                }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            map.put(nums2[i],arr[i]);
        }

        for(int i=0; i<nums1.length; i++){
            arr1[i] = map.get(nums1[i]);
        }
        return arr1;

    }
}