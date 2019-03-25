package Capstone.AssetServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller // this means the class is a controller
@RequestMapping(path="/demo") // this is the path after the application path
public class MainController {
    @Autowired // this gets the bean called assetRepository
    private AssetsRepository assetsRepository;

    @Autowired
    @RequestMapping(path="/all")
    public  @ResponseBody Iterable<Assets> getAllAssets() {
        return assetsRepository.findAll();
    }

}
