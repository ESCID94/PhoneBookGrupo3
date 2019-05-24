import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

//Nuevo
import { CrearEditarComponent } from './componentes/crear-editar/crear-editar.component';
import { BuscarListarComponent } from './componentes/buscar-listar/buscar-listar.component';
import { DetalleComponent } from './componentes/detalle/detalle.component';

//creamos las rutas
const routes: Routes = [
{path: 'crear', component:CrearEditarComponent},
{path: 'ver', component:BuscarListarComponent},
{path: 'listar', component:DetalleComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
