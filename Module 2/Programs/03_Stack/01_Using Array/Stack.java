class Stack{
    int arr[];
    int maxSize;
    int crntIndex;
    Stack(int size){
        maxSize=size;
        arr=new int[maxSize];
        crntIndex=-1;
    }
    // Insertion or pushing value into the stack
    void push(int value){
        if(maxSize<=crntIndex+1){
            System.out.println("Sorry,Stack is full :(");
            return;
        }
        crntIndex++;
        arr[crntIndex]=value;
    }
    // Removing value for the stack
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int value=arr[crntIndex];
        crntIndex--;
        return value;
       
    }
    // Peaking the top element from the stack
    int peak(){
        if(isEmpty()){
            System.out.println("There is nothing to peak in stack :(");
            return -1;
        }
        return arr[crntIndex];
    }
    // Checking stack either empty or not
    boolean isEmpty(){
        return (crntIndex==-1);
    }
    // Getting the current size of the stack
    int getCrntSize(){
        return (crntIndex+1);
    }
    // Get the total size of stack
    int getTotalSize(){
        return this.maxSize;
    }
    // Print elements present in the stack
    void printStack(){
        if(isEmpty()){
            System.out.println("There is nothing to show in stack :(");
            return;
        }
        for (int i = crntIndex; i > -1; i--) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Stack st=new Stack(5);
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);
        // st.push(5);
        // st.printStack();
       // System.out.println("Peak :"+st.peak());
    //    System.out.println("Pop :"+st.pop());
    //    System.out.println("Pop :"+st.pop());
        // st.pop();
        // System.out.println(st.isEmpty());
       System.out.println(st.peak()); 
        System.out.println("Current size :"+st.getCrntSize());
        System.out.println("Total size :"+st.getTotalSize());
        // st.push(6);
        
    }
}