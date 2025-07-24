class Solution {
    public int expressiveWords(String s, String[] words) {
        
        int expressive = 0;

        List<List<Integer>> sFreq = countOrder(s);
        
        for(String w: words) {
            List<List<Integer>> wFreq = countOrder(w);
            if(sFreq.size() != wFreq.size())
                continue;
            else {
                boolean flag = true;
                for(int i = 0 ; i < sFreq.size(); i++) {
                    if(sFreq.get(i).get(0) != wFreq.get(i).get(0)) {
                        flag = false;
                        break;
                    }
                    else if(sFreq.get(i).get(0) == wFreq.get(i).get(0) && 
                      sFreq.get(i).get(1) != wFreq.get(i).get(1)) {
                        if(sFreq.get(i).get(1) > wFreq.get(i).get(1) &&
                          sFreq.get(i).get(1) >= 3)
                            flag = true;
                        else {
                            flag = false;
                            break;
                        }
                    }
                }
                if(flag)
                    expressive++;
            }
        }
        
        return expressive;
    }
    
    public List<List<Integer>> countOrder(String str) {
        
        List<List<Integer>> countList = new ArrayList<>();
        char prev = str.charAt(0);
        int cnt = 1;
        for(int i = 1; i <= str.length(); i++) {
            if(i < str.length() && str.charAt(i) == str.charAt(i - 1)) 
                cnt++;
            else {
                List<Integer> temp = new ArrayList<>();
                temp.add((int)(prev - 'a'));
                temp.add(cnt);
                countList.add(temp);
                cnt = 1;
                if(i < str.length())
                    prev = str.charAt(i);
                else
                    break;
            }
        }
        return countList;
    }
}