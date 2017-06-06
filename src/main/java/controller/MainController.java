package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import repository.Note;

@Controller
public class MainController {

  @Autowired
  private Note note;

  @RequestMapping({"/questions"})
  public String index(Model model) {
    model.addAttribute("questions", note.findAll());
    return "redirect:/";
  }
}
