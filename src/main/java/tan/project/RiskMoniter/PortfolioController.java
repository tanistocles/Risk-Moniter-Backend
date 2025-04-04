package tan.project.RiskMoniter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portfolio")
public class PortfolioController {
    @Autowired
    private PortfolioRepository repo;

    @PostMapping
    public Portfolio create(@RequestBody Portfolio p) {
        return repo.save(p);
    }

    @GetMapping
    public List<Portfolio> all() {
        return repo.findAll();
    }
}

