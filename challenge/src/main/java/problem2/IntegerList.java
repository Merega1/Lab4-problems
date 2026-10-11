package problem2;

public class IntegerList
{
    int[] list; //values in the list
    int currentSize;
    int nInt;
    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
        currentSize = 2 * size;
        nInt = size;
        list = new int[2 * size];
    }
    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<nInt; i++){
            list[i] = (int)(Math.random() * 100) + 1;
        }
    }
    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<nInt; i++)
            System.out.println(i + ":\t" + list[i]);
    }

   void increaseSize(){
        int[] tmp = new int[currentSize * 2];
        for(int i = 0; i < currentSize; i++){
            tmp[i] = list[i];
        }
        list = tmp;
        currentSize *= 2;
    }

    void addElement(int newVal){
        if(nInt == currentSize){
            increaseSize();
        }
        list[nInt ] = newVal;
        nInt++;
    }

    void removeFirst(int newVal){
        for(int i = 0; i < nInt; i++){
            if(list[i] == newVal){
                for(int j = i + 1; j < nInt; j++){
                    list[j - 1] = list[j];
                }
                list[nInt - 1] = 0;
                nInt--;
                break;
            }
        }
    }
    void removeAll(int newVal){
        for(int i = 0; i < nInt; i++){
            if(list[i] == newVal){
                for(int j = i + 1; j < nInt; j++){
                    list[j - 1] = list[j];
                }
                list[nInt - 1] = 0;
                nInt--;
            }
        }
    }
}