class Solution {
    public String solution(String code) {
        String[] codeArr = code.split("");
        //String mode = "0";
        Boolean mode = false;
        String ret = "";
        
        for(int idx = 0; idx < code.length(); idx++){
            // if("0".equals(mode)){
            //     if("1".equals(codeArr[idx])) mode = "1";
            //     else{
            //         if(idx % 2 == 0) ret += codeArr[idx];
            //     }
            // }else{
            //     if("1".equals(codeArr[idx])) mode = "0";
            //     else{
            //         if(idx % 2 == 1) ret += codeArr[idx];
            //     }
            // }
            
            // if("1".equals(codeArr[idx])){
            //     if("0".equals(mode)){
            //         mode = "1";
            //     }else{
            //         mode = "0";
            //     }
            // }else{
            //     if("0".equals(mode)){
            //         if(idx % 2 == 0) ret += codeArr[idx];
            //     }else{
            //         if(idx % 2 == 1) ret += codeArr[idx];
            //     }
            // }
            
            
            if("1".equals(codeArr[idx])){
                mode = !mode;
            }else{
                if(!mode){
                    if(idx % 2 == 0) ret += codeArr[idx];
                }else{
                    if(idx % 2 == 1) ret += codeArr[idx];
                }
            }
        }
       
        return ret.equals("") ? "EMPTY" : ret;
    }
}