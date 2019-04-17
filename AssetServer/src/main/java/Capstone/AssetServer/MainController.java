package Capstone.AssetServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController // this means the class is a controller
public class MainController {
    @Autowired // this gets the bean called assetRepository
    private AssetsRepository assetsRepository;

    @Autowired
    @GetMapping(path="/assets")
    public  @ResponseBody Iterable<Assets> getAllAssets() {
        return assetsRepository.findAll();
    }


    @GetMapping(path="/assets/{id}")
    public @ResponseBody
    Optional<Assets> getAssetByID(@PathVariable Integer id) {
        return assetsRepository.findById(id);
    }
}
