package symulator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Baza {

    @GetMapping("/")
    public String index() {
        return "milosc/index";
    }

    @PostMapping(value = "/usun")
    public String addCar(Model model, @RequestParam(value = "fname") String fname) {
        System.out.println(fname);
        model.addAttribute("fname", fname);
        return "milosc/milosc";
    }
}
