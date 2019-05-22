import { Component, OnInit } from '@angular/core';

//Nuevo
import { Router } from '@angular/router';

import { Persona } from '../../modelo/persona/persona';
import { PersonaServiciosService } from '../../servicios/persona-servicios.service';

@Component({
  selector: 'app-buscar-listar',
  templateUrl: './buscar-listar.component.html',
  styleUrls: ['./buscar-listar.component.css']
})
export class BuscarListarComponent implements OnInit {

   //Todo la clase es nueva

   personas: Persona[];//tengo q crear la variable
   //para mostrarlos los muestro en un array de personas



  constructor(private router: Router, private personaServicio:PersonaServiciosService) { }

  //inyecto en el constructor para poder trabajar con el objeto persona service

  ngOnInit() {
    this.personaServicio.getPersonas()//patron observer
    .subscribe(data => {//me subscribo a sus servicios
      this.personas = data;//y cuando lleguen los guardo en personas

    });
  };

  deletePersona(persona:Persona): void {
    this.personaServicio.deletePersona(persona)
    .subscribe(data => {
      this.personas = this.personas.filter(p => p !== persona);
      //los guardo otra vez con observer y cuando esten los filtro
    })
  };

}
