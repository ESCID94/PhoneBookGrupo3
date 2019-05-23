import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

//Nuevo
import { CrearEditarComponent } from './componentes/crear-editar/crear-editar.component';
import { BuscarListarComponent } from './componentes/buscar-listar/buscar-listar.component';

//creamos las rutas
const routes: Routes = [
{path: 'crear', component:CrearEditarComponent},
{path: 'listar', component:BuscarListarComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
