import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

//Nuevo
import { CrearComponent } from './componentes/crear/crear.component';
import { BuscarListarEditarComponent } from './componentes/buscar-listar-editar/buscar-listar-editar.component';

//creamos las rutas
const routes: Routes = [
{path: 'crear', component:CrearComponent},
{path: 'listar', component:BuscarListarEditarComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
