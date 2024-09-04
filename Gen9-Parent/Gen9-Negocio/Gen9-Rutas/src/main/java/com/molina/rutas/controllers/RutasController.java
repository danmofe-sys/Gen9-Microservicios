package com.molina.rutas.controllers;
@RequestMapping("/rutas")
@RestController
public class RutasController {
    @Autowired
    RutasService rutasService;


    @GetMapping
    public ResponseEntity<List<Ruta>> listar(){
        List<Ruta> choferes = this.rutasService.getAll();
        if(choferes.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        else{
            return ResponseEntity.ok(choferes);
        }
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> get(@PathVariable(name="id") Long id){
        Optional<Ruta> c = rutasService.findById(id);
        if(c.isPresent()){
            return ResponseEntity.ok(c.get());
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }  


    @PostMapping
    public ResponseEntity<?> post(@RequestBody Ruta c){
        Ruta save = rutasService.save(c);
        return ResponseEntity.status(HttpStatus.CREATED).body(save);
    }





}
