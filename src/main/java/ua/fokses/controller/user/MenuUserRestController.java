package ua.fokses.controller.user;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.fokses.controller.AbstractUserController;
import ua.fokses.model.Menu;
import ua.fokses.repository.readOnly.MenuReadOnlyRepository;

import java.time.LocalDate;
import java.util.List;

@RequestMapping("/menus")
public class MenuUserRestController extends AbstractUserController {

    private final MenuReadOnlyRepository menuRepository;

    public MenuUserRestController(MenuReadOnlyRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @GetMapping("/{day}")
    public List<Menu> getAll(@PathVariable(required = false) @DateTimeFormat(iso= DateTimeFormat.ISO.DATE) LocalDate day) {
        return menuRepository.findByDate((day == null ? LocalDate.now() : day));
    }
}
