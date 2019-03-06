package guru.springframework.springjokesapp.controllers;

import guru.springframework.springjokesapp.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    @Autowired
    public JokesService jokesService;

    @RequestMapping({"/",""})
    public String getJoke(Model model){

        //property in html file
        model.addAttribute("joke", jokesService.getJoke());

        //this is the name of file in templates
        return "chucknorris";
    }
}
