import java.util.ArrayList;
public class Re {
    public static void main(String[] args){
        String re="\\d{3}-\\d{2}-\\d{4}";
        String text="616-33-4565";
        boolean r=text.matches(re);  
        System.out.println(r);    
        String re2="#[A-Za-z]+";
        String text2="ABBBBBBBBA";
        boolean r2=text.matches(re);  
        ArrayList<String> posts= FileOperator.getStringList("data-analysis-toastman3000/posts.txt");   
        System.out.println(posts);
        for(String post : posts ){
            boolean result=post.matches(re2);  
            System.out.println(result);
        }

    }
    
}