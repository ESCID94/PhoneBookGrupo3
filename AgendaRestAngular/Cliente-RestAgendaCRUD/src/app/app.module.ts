import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CrearEditarComponent } from './componentes/crear-editar/crear-editar.component';
import { BuscarListarComponent } from './componentes/buscar-listar/buscar-listar.component';
import { FilterPipe} from './servicios/filter.pipe'
import { PersonaServiciosService } from './servicios/persona-servicios.service';
import { HttpClientModule } from "@angular/common/http";
import { FormsModule } from '@angular/forms';
import { DetalleComponent } from './componentes/detalle/detalle.component';
@NgModule({
  declarations: [
    AppComponent,
    CrearEditarComponent,
    BuscarListarComponent,
    FilterPipe,
    DetalleComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    //Nuevo
    HttpClientModule,
    FormsModule 
  ],
  //Nuevo el provider
  providers: [PersonaServiciosService],
  bootstrap: [AppComponent]
})
export class AppModule { }
