
//////////////////////////// Q U E S T I O N  3 //////////////////////////

    @Override
    public ArrayBag<T> intersection(ArrayBag<T> aBag) {
        
        ArrayBag<T> inter = new ArrayBag();
        ArrayBag<T> setA = new ArrayBag();
        ArrayBag<T> setB = new ArrayBag();
        
        //Copy items from the original bag to another bag
        for(int i=0; i<numberOfEntries; i++) {
            setA.add(bag[i]);
        }
        
        for(int i=0; i<aBag.numberOfEntries; i++) {
            setB.add(aBag.bag[i]);
        }
        
        int i=0;
        while(i<setA.numberOfEntries){
            int j=0;
            while(j<setB.numberOfEntries){
                if(setA.bag[i]==setB.bag[j]) {
                    inter.add(setB.bag[j]);
                    setA.remove(setB.bag[j]);
                    setB.remove(setB.bag[j]);
                    break;
                }
                else j++;
            }
            if(j==setB.numberOfEntries)
                i++;
        }
        return inter;
    }
    
//////////////////////////// Q U E S T I O N  4 //////////////////////////

    @Override
    public ArrayBag<T> difference(ArrayBag<T> aBag) {
        
        ArrayBag<T> diff = new ArrayBag();
        ArrayBag<T> setA = new ArrayBag();
        ArrayBag<T> setB = new ArrayBag();
        
        //Copy items from the original bag to another bag
        for(int i=0; i<numberOfEntries; i++) {
            setA.add(bag[i]);
        }
        
        for(int i=0; i<aBag.numberOfEntries; i++) {
            setB.add(aBag.bag[i]);
        }
        
        int i=0;
        while(i<setA.numberOfEntries){
            int j =0;
            while(j<setB.numberOfEntries) {
                if(setA.bag[i]==setB.bag[j]) {
                    setA.remove(setA.bag[i]);
                    setB.remove(setA.bag[i]);
                    break;
                } else j++;
            }
            if(j==setB.numberOfEntries) {
                i++;
            }
          
        }
        for(int k=0;k<setA.numberOfEntries;k++) {
            diff.add(setA.bag[k]);
        }
        return diff;
    }
