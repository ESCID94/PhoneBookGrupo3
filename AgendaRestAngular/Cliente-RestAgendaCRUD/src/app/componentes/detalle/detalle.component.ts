import { Component, OnInit } from '@angular/core';
import { Persona } from 'src/app/modelo/persona/persona';
import { PersonaServiciosService } from 'src/app/servicios/persona-servicios.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-detalle',
  templateUrl: './detalle.component.html',
  styleUrls: ['./detalle.component.css']
})


export class DetalleComponent implements OnInit {

  constructor(private router: Router, private personaServicio:PersonaServiciosService) { }

  ngOnInit() {
    
  }

  detallesPersona(id:number): void {
    this.personaServicio.detailPersona;
  };

}
