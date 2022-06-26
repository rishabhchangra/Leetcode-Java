class mergeintervals {
    public int[][] merge(int[][] intervals) {
      
        Arrays.sort(intervals, (a, b) -> Double.compare(a[0], b[0]));
        int m=intervals.length;
        
        List<int []> l= new ArrayList<int []>();
        
        int i=0;
        int k=1;
        
        l.add(intervals[0]);
        
        
        while(i<m && k<m)
        {  
            
            int []arr= new int[2];
            if(l.get(k-1)[1]>=intervals[i][0])
            {
            
              l.get(k-1)[1]=(intervals[i][1]>l.get(k-1)[1]) ? intervals[i][1]:l.get(k-1)[1]; 
                
         }
            else{
                
            arr[0]=intervals[i][0];
            arr[1]=intervals[i][1];
            l.add(arr);
            k++;
            }
                
                i++;
                
        }
    
            int[][] myArray = new int[l.size()][];
    

            l.toArray(myArray);
        

        
        
        return myArray;
    }
}
