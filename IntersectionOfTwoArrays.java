class Solution{
    //Function to return the count of the number of elements in
    //the intersection of two arrays.
    public static int NumberofElementsInIntersection(int a[],int b[],int n,int m)
    {
        HashSet<Integer> res=new HashSet<Integer>();
        int count=0;
        for(int x:a)
        res.add(x);
        for(int i=0;i<m;i++){
             if(res.contains(b[i])){
              count++;
              res.remove(b[i]);
              
             }
            
        }
        
        return count;
    }
};
