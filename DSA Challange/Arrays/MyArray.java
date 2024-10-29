public class MyArray {
    private int[] items;
    private int currentIndex;

    public MyArray(int size) {
        this.items = new int[size];
        this.currentIndex = 0;
    }

    public void insert(int value){
        if(currentIndex == items.length){
            int [] newArray = new int[items.length * 2];

            //copy all elements from original array
            for(int i=0; i< currentIndex; i++){
                newArray[i] = items[i];
            }
            items = newArray;
        }
        this.items[currentIndex] = value;
        currentIndex++;
    }

    public int indexof(int val){
        //Use Linear Search
        for(int i=0; i<currentIndex; i++){
            if(this.items[i] == val) return i;
        }
        return -1;
    }

    public int max(){
        int result = this.items[0];
        for(int i=1; i<this.currentIndex; i++){
            if(items[i] > result){
                result = items[i];
            }
        }
        return result;
    }

    public int min(){
        int result = this.items[0];
        for(int i=1; i<this.currentIndex; i++){
            if(items[i] < result){
                result = items[i];
            }
        }
        return result;
    }

    public void reverse(){
        int i =0;
        int j = this.currentIndex -1;

        while(i < j){
            int temp = this.items[i];
            this.items[i] = this.items[j];
            this.items[j] = temp;
            i++;
            j--;
        }
    }


    public void removeAt(int index){
        if(index >= this.currentIndex) throw new IllegalArgumentException();

        for(int i=index; i<= this.currentIndex - 2; i++ )
            this.items[i] = this.items[i+1];
        currentIndex--;
        this.items[currentIndex] = 0;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append('[');
        for(int i =0; i<this.currentIndex; i++){
            builder.append(this.items[i]).append(", ");
        }
        builder.append("\b").append("\b").append("]");
        return builder.toString();
    }
}
