package idusw.springboot.boradthymleaf.controller;

import org.springframework.ui.Model;
import idusw.springboot.boradthymleaf.domain.Memo;
import idusw.springboot.boradthymleaf.service.MemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Controller
public class HomeController {
    MemoService memoService;
    public HomeController(MemoService memoService) { // constructor DI
        this.memoService = memoService;
    }

    /*
    @Autowired
    MemoRepository memoRepository; // field DI (Dependency Injection)
    */
    @GetMapping("/init")
    public String goHome() {
        memoService.initailize();
        return "index";
    }
    List<Memo> result = new ArrayList<>(); // 결과 리스트
    @GetMapping("/memo")
    public String getMemoList(Model model) {
       result = memoService.readList();
       model.addAttribute ("memoList", result);
        return "list";
    }
}