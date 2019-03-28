
//////////////////////////// Q U E S T I O N  3 //////////////////////////

    @Override
    public ArrayBag<T> intersection(ArrayBag<T> aSet) {
        
        ArrayBag<T> inter = new ArrayBag();
        ArrayBag<T> setA = this;
        ArrayBag<T> setB = aSet;      
        int i=0;
        while(i<setA.numberOfEntries){
            int j=0;
            while(j<setB.numberOfEntries){
                if(setA.contains(setB.bag[j])){//setA and B at [j] is ==
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
    public ArrayBag<T> difference(ArrayBag<T> aSet) {
        
        ArrayBag<T> diff = this.intersection(aSet);
        ArrayBag<T> setA = this;
        
        int i=0;
        while(i<setA.numberOfEntries){
            if(setA.contains(diff.bag[i])){
                setA.remove(diff.bag[i]);
            }
            else
                i++;
        }
        
        return setA;
 
    }