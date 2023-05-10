import org.springframework.web.bind.annotation.*;
public class CalcSum {

    @RequestMapping 
    public int sum
            (@RequestParam int a,
             @RequestParam int b){
        return a+b;
    }
}
