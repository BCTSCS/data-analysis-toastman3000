
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ArticleAnalyzer {

    private ArrayList<String> stopWords; 
    private ArrayList<Article> articles;  

    public ArticleAnalyzer(){
        stopWords=FileOperator.getStringList("stopwords.txt");
        System.out.println("Stop Word count"+stopWords.size());
        articles=new ArrayList<>();
        System.out.println("Articles count"+articles.size());
    }
    public static void main(String[] args) {
       ArticleAnalyzer riano = new ArticleAnalyzer();
       ArrayList<String> lines= FileOperator.getStringList("data.txt");
       String line =lines.get(0);
       Article a=riano.parseJson(line);
       System.out.println(a);
    }
    public void addStopWord(String word){
    }
    public void addArticle(Article article){
    }
    public Article parseJson(String jsonLine){
        Article result;
        Pattern l = Pattern.compile("\"link\":\\s*\"([^\"]+)\""); 
        Matcher lm =l.matcher(jsonLine); 
         String lt = lm.find() ? lm.group(1) : ""; 
        result=new Article(lt, "", "", "", "","");
    return result;
}
    public String removeStopWords(String text){ 
        String result="";
        
        return result;
    }
}
