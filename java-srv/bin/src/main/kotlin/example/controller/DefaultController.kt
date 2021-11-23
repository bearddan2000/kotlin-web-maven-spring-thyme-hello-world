package example.controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.stereotype.Controller

@Controller
class DefaultController {

  @GetMapping("/")
  fun home1(): String {
      return "/home"
  }

  @GetMapping("/home")
  fun home(): String {
      return "/home"
  }

}
