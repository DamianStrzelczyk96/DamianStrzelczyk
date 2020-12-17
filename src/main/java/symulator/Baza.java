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

        @GetMapping(value = "/zobaczCertyfikaty")
        public String certyfikaty(Model model) {

            return "milosc/certyfikaty";

    }

    @GetMapping(value = "/Hibernate")
    public String hiberante(Model model){
        return "milosc/Hibernate";
    }

    @GetMapping(value = "/C_School")
    public String CSchool(Model model){
        return "milosc/C_School";
    }
    @GetMapping(value = "/Udemy")
    public String Udemy(Model model){
        return "milosc/Udemy";
    }
    @GetMapping(value = "/JUnit")
    public String JUnit(Model model){
        return "milosc/JUnit";
    }

}
