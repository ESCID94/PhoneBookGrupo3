import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CrearComponent } from './componentes/crear/crear.component';
import { BuscarListarEditarComponent } from './componentes/buscar-listar-editar/buscar-listar-editar.component';
import { FilterPipe} from './servicios/filter.pipe'
import { PersonaServiciosService } from './servicios/persona-servicios.service';
import { HttpClientModule } from "@angular/common/http";
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    CrearComponent,
    BuscarListarEditarComponent,
    FilterPipe,
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
