package ex03;

@Controller
public class BoardController {

    @RequestMapping(uri = "/write")
    public void write() {
        System.out.println("글쓰기 호출됨");
    }
}
