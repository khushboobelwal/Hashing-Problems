class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        HashSet<Integer>h=new HashSet<>();
        for(int x:a){
            h.add(x);
        }
        for(int x:b){
            h.add(x);
            
        }
        return h.size();
        //Your code here
    }
}
