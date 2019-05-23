import { Pipe, PipeTransform } from '@angular/core';
@Pipe({
  name: 'filter'
})
export class FilterPipe implements PipeTransform {
    transform(items: any[], nombreBuscar: string): any[] {
        if(!items) return [];
        if(!nombreBuscar) return items;
         console.log(nombreBuscar);
         nombreBuscar = nombreBuscar.toString().toLowerCase();
         return items.filter( it => {
           console.log(it);
         return it.nombre.toLowerCase().includes(nombreBuscar);
          });
          }
}