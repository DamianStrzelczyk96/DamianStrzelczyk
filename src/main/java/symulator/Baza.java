package symulator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Baza {

    int licznik = 0;
    @GetMapping("/")
    public String index(Model model) {
        licznik++;
        model.addAttribute("licznik",licznik);
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
        licznik++;
            return "milosc/certyfikaty";

    }
    @GetMapping(value = "/zobaczProjekty")
    public String projekty(Model model) {
        licznik++;
        return "milosc/projekty";

    }

    @GetMapping(value = "/Hibernate")
    public String hiberante(Model model){
        licznik++;
        return "milosc/Hibernate";
    }

    @GetMapping(value = "/C_School")
    public String CSchool(Model model){
        licznik++;
        return "milosc/C_School";
    }
    @GetMapping(value = "/Udemy")
    public String Udemy(Model model){
        licznik++;
        return "milosc/Udemy";
    }
    @GetMapping(value = "/JUnit")
    public String JUnit(Model model){
        licznik++;
        return "milosc/JUnit";
    }
    @GetMapping(value = "/Wzorce")
    public String Wzorce(Model model){
        licznik++;
        return "milosc/Wzorce";
    }


}
