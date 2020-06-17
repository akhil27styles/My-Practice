import java.util.Stack;
class nextgreater {
 public static void printNextGreaterElement(int[] array) {
Stack<Integer> s=new Stack<>();
int size=array.length;
s.push(array[0]);
for(int i=1;i<size;i++){
 while(!s.isEmpty()&&s.peek()<array[i]){
 System.out.println(s.pop()+" "+ array[i]);
}
s.push(array[i]);
}
while(!s.isEmpty()){
 int top=(int)s.pop();
 System.out.println(top +" "+-1);
}
}
public static void main(String[] args) {
        int[] input = { 98, 23, 54, 12, 20, 7, 27 };
        printNextGreaterElement(input);
    }
}
