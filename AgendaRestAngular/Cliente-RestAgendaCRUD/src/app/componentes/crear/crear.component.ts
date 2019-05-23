import { Component, OnInit } from '@angular/core';

//Nuevo
import { Router } from '@angular/router';
import { Persona } from '../../modelo/persona/persona';
import { PersonaServiciosService } from '../../servicios/persona-servicios.service';


@Component({
  selector: 'app-crear',
  templateUrl: './crear.component.html',
  styleUrls: ['./crear.component.css']
})
export class CrearComponent implements OnInit {

  //nuevo
  persona: Persona = new Persona();

  constructor(private router: Router, private personaServicio:PersonaServiciosService) {

   }

   createPersona(): void {
     this.personaServicio.createPersona(this.persona)
     .subscribe(data => {alert("Ha añadido una persona de forma correcta.");
    });
   };

  ngOnInit() {
  }

}
